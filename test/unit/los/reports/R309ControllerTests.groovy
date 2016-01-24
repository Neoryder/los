package los.reports


import org.junit.*
import grails.test.mixin.*

@TestFor(R309Controller)
@Mock(R309)
class R309ControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/r309/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.r309InstanceList.size() == 0
        assert model.r309InstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.r309Instance != null
    }

    void testSave() {
        controller.save()

        assert model.r309Instance != null
        assert view == '/r309/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/r309/show/1'
        assert controller.flash.message != null
        assert R309.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/r309/list'

        populateValidParams(params)
        def r309 = new R309(params)

        assert r309.save() != null

        params.id = r309.id

        def model = controller.show()

        assert model.r309Instance == r309
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/r309/list'

        populateValidParams(params)
        def r309 = new R309(params)

        assert r309.save() != null

        params.id = r309.id

        def model = controller.edit()

        assert model.r309Instance == r309
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/r309/list'

        response.reset()

        populateValidParams(params)
        def r309 = new R309(params)

        assert r309.save() != null

        // test invalid parameters in update
        params.id = r309.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/r309/edit"
        assert model.r309Instance != null

        r309.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/r309/show/$r309.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        r309.clearErrors()

        populateValidParams(params)
        params.id = r309.id
        params.version = -1
        controller.update()

        assert view == "/r309/edit"
        assert model.r309Instance != null
        assert model.r309Instance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/r309/list'

        response.reset()

        populateValidParams(params)
        def r309 = new R309(params)

        assert r309.save() != null
        assert R309.count() == 1

        params.id = r309.id

        controller.delete()

        assert R309.count() == 0
        assert R309.get(r309.id) == null
        assert response.redirectedUrl == '/r309/list'
    }
}
