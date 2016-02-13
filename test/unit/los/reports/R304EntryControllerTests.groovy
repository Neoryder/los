package los.reports


import org.junit.*
import grails.test.mixin.*

@TestFor(R304EntryController)
@Mock(R304Entry)
class R304EntryControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/r304Entry/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.r304EntryInstanceList.size() == 0
        assert model.r304EntryInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.r304EntryInstance != null
    }

    void testSave() {
        controller.save()

        assert model.r304EntryInstance != null
        assert view == '/r304Entry/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/r304Entry/show/1'
        assert controller.flash.message != null
        assert R304Entry.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/r304Entry/list'

        populateValidParams(params)
        def r304Entry = new R304Entry(params)

        assert r304Entry.save() != null

        params.id = r304Entry.id

        def model = controller.show()

        assert model.r304EntryInstance == r304Entry
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/r304Entry/list'

        populateValidParams(params)
        def r304Entry = new R304Entry(params)

        assert r304Entry.save() != null

        params.id = r304Entry.id

        def model = controller.edit()

        assert model.r304EntryInstance == r304Entry
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/r304Entry/list'

        response.reset()

        populateValidParams(params)
        def r304Entry = new R304Entry(params)

        assert r304Entry.save() != null

        // test invalid parameters in update
        params.id = r304Entry.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/r304Entry/edit"
        assert model.r304EntryInstance != null

        r304Entry.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/r304Entry/show/$r304Entry.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        r304Entry.clearErrors()

        populateValidParams(params)
        params.id = r304Entry.id
        params.version = -1
        controller.update()

        assert view == "/r304Entry/edit"
        assert model.r304EntryInstance != null
        assert model.r304EntryInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/r304Entry/list'

        response.reset()

        populateValidParams(params)
        def r304Entry = new R304Entry(params)

        assert r304Entry.save() != null
        assert R304Entry.count() == 1

        params.id = r304Entry.id

        controller.delete()

        assert R304Entry.count() == 0
        assert R304Entry.get(r304Entry.id) == null
        assert response.redirectedUrl == '/r304Entry/list'
    }
}
