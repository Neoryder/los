package los.reports


import org.junit.*
import grails.test.mixin.*

@TestFor(R304Controller)
@Mock(R304)
class R304ControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/r304/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.r304InstanceList.size() == 0
        assert model.r304InstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.r304Instance != null
    }

    void testSave() {
        controller.save()

        assert model.r304Instance != null
        assert view == '/r304/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/r304/show/1'
        assert controller.flash.message != null
        assert R304.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/r304/list'

        populateValidParams(params)
        def r304 = new R304(params)

        assert r304.save() != null

        params.id = r304.id

        def model = controller.show()

        assert model.r304Instance == r304
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/r304/list'

        populateValidParams(params)
        def r304 = new R304(params)

        assert r304.save() != null

        params.id = r304.id

        def model = controller.edit()

        assert model.r304Instance == r304
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/r304/list'

        response.reset()

        populateValidParams(params)
        def r304 = new R304(params)

        assert r304.save() != null

        // test invalid parameters in update
        params.id = r304.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/r304/edit"
        assert model.r304Instance != null

        r304.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/r304/show/$r304.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        r304.clearErrors()

        populateValidParams(params)
        params.id = r304.id
        params.version = -1
        controller.update()

        assert view == "/r304/edit"
        assert model.r304Instance != null
        assert model.r304Instance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/r304/list'

        response.reset()

        populateValidParams(params)
        def r304 = new R304(params)

        assert r304.save() != null
        assert R304.count() == 1

        params.id = r304.id

        controller.delete()

        assert R304.count() == 0
        assert R304.get(r304.id) == null
        assert response.redirectedUrl == '/r304/list'
    }
}
