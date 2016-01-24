package los.reports


import org.junit.*
import grails.test.mixin.*

@TestFor(R309EntryController)
@Mock(R309Entry)
class R309EntryControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/r309Entry/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.r309EntryInstanceList.size() == 0
        assert model.r309EntryInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.r309EntryInstance != null
    }

    void testSave() {
        controller.save()

        assert model.r309EntryInstance != null
        assert view == '/r309Entry/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/r309Entry/show/1'
        assert controller.flash.message != null
        assert R309Entry.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/r309Entry/list'

        populateValidParams(params)
        def r309Entry = new R309Entry(params)

        assert r309Entry.save() != null

        params.id = r309Entry.id

        def model = controller.show()

        assert model.r309EntryInstance == r309Entry
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/r309Entry/list'

        populateValidParams(params)
        def r309Entry = new R309Entry(params)

        assert r309Entry.save() != null

        params.id = r309Entry.id

        def model = controller.edit()

        assert model.r309EntryInstance == r309Entry
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/r309Entry/list'

        response.reset()

        populateValidParams(params)
        def r309Entry = new R309Entry(params)

        assert r309Entry.save() != null

        // test invalid parameters in update
        params.id = r309Entry.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/r309Entry/edit"
        assert model.r309EntryInstance != null

        r309Entry.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/r309Entry/show/$r309Entry.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        r309Entry.clearErrors()

        populateValidParams(params)
        params.id = r309Entry.id
        params.version = -1
        controller.update()

        assert view == "/r309Entry/edit"
        assert model.r309EntryInstance != null
        assert model.r309EntryInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/r309Entry/list'

        response.reset()

        populateValidParams(params)
        def r309Entry = new R309Entry(params)

        assert r309Entry.save() != null
        assert R309Entry.count() == 1

        params.id = r309Entry.id

        controller.delete()

        assert R309Entry.count() == 0
        assert R309Entry.get(r309Entry.id) == null
        assert response.redirectedUrl == '/r309Entry/list'
    }
}
