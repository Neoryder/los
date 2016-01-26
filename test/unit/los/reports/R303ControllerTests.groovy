package los.reports



import org.junit.*
import grails.test.mixin.*

@TestFor(R303Controller)
@Mock(R303)
class R303ControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/r303/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.r303InstanceList.size() == 0
        assert model.r303InstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.r303Instance != null
    }

    void testSave() {
        controller.save()

        assert model.r303Instance != null
        assert view == '/r303/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/r303/show/1'
        assert controller.flash.message != null
        assert R303.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/r303/list'

        populateValidParams(params)
        def r303 = new R303(params)

        assert r303.save() != null

        params.id = r303.id

        def model = controller.show()

        assert model.r303Instance == r303
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/r303/list'

        populateValidParams(params)
        def r303 = new R303(params)

        assert r303.save() != null

        params.id = r303.id

        def model = controller.edit()

        assert model.r303Instance == r303
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/r303/list'

        response.reset()

        populateValidParams(params)
        def r303 = new R303(params)

        assert r303.save() != null

        // test invalid parameters in update
        params.id = r303.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/r303/edit"
        assert model.r303Instance != null

        r303.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/r303/show/$r303.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        r303.clearErrors()

        populateValidParams(params)
        params.id = r303.id
        params.version = -1
        controller.update()

        assert view == "/r303/edit"
        assert model.r303Instance != null
        assert model.r303Instance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/r303/list'

        response.reset()

        populateValidParams(params)
        def r303 = new R303(params)

        assert r303.save() != null
        assert R303.count() == 1

        params.id = r303.id

        controller.delete()

        assert R303.count() == 0
        assert R303.get(r303.id) == null
        assert response.redirectedUrl == '/r303/list'
    }
}
