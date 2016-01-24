package los.reports


import org.junit.*
import grails.test.mixin.*

@TestFor(R303EntryController)
@Mock(R303Entry)
class R303EntryControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/r303Entry/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.r303EntryInstanceList.size() == 0
        assert model.r303EntryInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.r303EntryInstance != null
    }

    void testSave() {
        controller.save()

        assert model.r303EntryInstance != null
        assert view == '/r303Entry/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/r303Entry/show/1'
        assert controller.flash.message != null
        assert R303Entry.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/r303Entry/list'

        populateValidParams(params)
        def r303Entry = new R303Entry(params)

        assert r303Entry.save() != null

        params.id = r303Entry.id

        def model = controller.show()

        assert model.r303EntryInstance == r303Entry
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/r303Entry/list'

        populateValidParams(params)
        def r303Entry = new R303Entry(params)

        assert r303Entry.save() != null

        params.id = r303Entry.id

        def model = controller.edit()

        assert model.r303EntryInstance == r303Entry
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/r303Entry/list'

        response.reset()

        populateValidParams(params)
        def r303Entry = new R303Entry(params)

        assert r303Entry.save() != null

        // test invalid parameters in update
        params.id = r303Entry.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/r303Entry/edit"
        assert model.r303EntryInstance != null

        r303Entry.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/r303Entry/show/$r303Entry.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        r303Entry.clearErrors()

        populateValidParams(params)
        params.id = r303Entry.id
        params.version = -1
        controller.update()

        assert view == "/r303Entry/edit"
        assert model.r303EntryInstance != null
        assert model.r303EntryInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/r303Entry/list'

        response.reset()

        populateValidParams(params)
        def r303Entry = new R303Entry(params)

        assert r303Entry.save() != null
        assert R303Entry.count() == 1

        params.id = r303Entry.id

        controller.delete()

        assert R303Entry.count() == 0
        assert R303Entry.get(r303Entry.id) == null
        assert response.redirectedUrl == '/r303Entry/list'
    }
}
