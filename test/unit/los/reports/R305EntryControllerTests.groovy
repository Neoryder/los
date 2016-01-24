package los.reports


import org.junit.*
import grails.test.mixin.*

@TestFor(R305EntryController)
@Mock(R305Entry)
class R305EntryControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/r305Entry/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.r305EntryInstanceList.size() == 0
        assert model.r305EntryInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.r305EntryInstance != null
    }

    void testSave() {
        controller.save()

        assert model.r305EntryInstance != null
        assert view == '/r305Entry/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/r305Entry/show/1'
        assert controller.flash.message != null
        assert R305Entry.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/r305Entry/list'

        populateValidParams(params)
        def r305Entry = new R305Entry(params)

        assert r305Entry.save() != null

        params.id = r305Entry.id

        def model = controller.show()

        assert model.r305EntryInstance == r305Entry
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/r305Entry/list'

        populateValidParams(params)
        def r305Entry = new R305Entry(params)

        assert r305Entry.save() != null

        params.id = r305Entry.id

        def model = controller.edit()

        assert model.r305EntryInstance == r305Entry
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/r305Entry/list'

        response.reset()

        populateValidParams(params)
        def r305Entry = new R305Entry(params)

        assert r305Entry.save() != null

        // test invalid parameters in update
        params.id = r305Entry.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/r305Entry/edit"
        assert model.r305EntryInstance != null

        r305Entry.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/r305Entry/show/$r305Entry.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        r305Entry.clearErrors()

        populateValidParams(params)
        params.id = r305Entry.id
        params.version = -1
        controller.update()

        assert view == "/r305Entry/edit"
        assert model.r305EntryInstance != null
        assert model.r305EntryInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/r305Entry/list'

        response.reset()

        populateValidParams(params)
        def r305Entry = new R305Entry(params)

        assert r305Entry.save() != null
        assert R305Entry.count() == 1

        params.id = r305Entry.id

        controller.delete()

        assert R305Entry.count() == 0
        assert R305Entry.get(r305Entry.id) == null
        assert response.redirectedUrl == '/r305Entry/list'
    }
}
