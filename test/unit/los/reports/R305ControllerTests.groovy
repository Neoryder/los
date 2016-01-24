package los.reports


import org.junit.*
import grails.test.mixin.*

@TestFor(R305Controller)
@Mock(R305)
class R305ControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/r305/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.r305InstanceList.size() == 0
        assert model.r305InstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.r305Instance != null
    }

    void testSave() {
        controller.save()

        assert model.r305Instance != null
        assert view == '/r305/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/r305/show/1'
        assert controller.flash.message != null
        assert R305.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/r305/list'

        populateValidParams(params)
        def r305 = new R305(params)

        assert r305.save() != null

        params.id = r305.id

        def model = controller.show()

        assert model.r305Instance == r305
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/r305/list'

        populateValidParams(params)
        def r305 = new R305(params)

        assert r305.save() != null

        params.id = r305.id

        def model = controller.edit()

        assert model.r305Instance == r305
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/r305/list'

        response.reset()

        populateValidParams(params)
        def r305 = new R305(params)

        assert r305.save() != null

        // test invalid parameters in update
        params.id = r305.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/r305/edit"
        assert model.r305Instance != null

        r305.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/r305/show/$r305.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        r305.clearErrors()

        populateValidParams(params)
        params.id = r305.id
        params.version = -1
        controller.update()

        assert view == "/r305/edit"
        assert model.r305Instance != null
        assert model.r305Instance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/r305/list'

        response.reset()

        populateValidParams(params)
        def r305 = new R305(params)

        assert r305.save() != null
        assert R305.count() == 1

        params.id = r305.id

        controller.delete()

        assert R305.count() == 0
        assert R305.get(r305.id) == null
        assert response.redirectedUrl == '/r305/list'
    }
}
