package los


import org.junit.*
import grails.test.mixin.*

@TestFor(LokalController)
@Mock(Lokal)
class LokalControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/lokal/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.lokalInstanceList.size() == 0
        assert model.lokalInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.lokalInstance != null
    }

    void testSave() {
        controller.save()

        assert model.lokalInstance != null
        assert view == '/lokal/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/lokal/show/1'
        assert controller.flash.message != null
        assert Lokal.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/lokal/list'

        populateValidParams(params)
        def lokal = new Lokal(params)

        assert lokal.save() != null

        params.id = lokal.id

        def model = controller.show()

        assert model.lokalInstance == lokal
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/lokal/list'

        populateValidParams(params)
        def lokal = new Lokal(params)

        assert lokal.save() != null

        params.id = lokal.id

        def model = controller.edit()

        assert model.lokalInstance == lokal
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/lokal/list'

        response.reset()

        populateValidParams(params)
        def lokal = new Lokal(params)

        assert lokal.save() != null

        // test invalid parameters in update
        params.id = lokal.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/lokal/edit"
        assert model.lokalInstance != null

        lokal.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/lokal/show/$lokal.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        lokal.clearErrors()

        populateValidParams(params)
        params.id = lokal.id
        params.version = -1
        controller.update()

        assert view == "/lokal/edit"
        assert model.lokalInstance != null
        assert model.lokalInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/lokal/list'

        response.reset()

        populateValidParams(params)
        def lokal = new Lokal(params)

        assert lokal.save() != null
        assert Lokal.count() == 1

        params.id = lokal.id

        controller.delete()

        assert Lokal.count() == 0
        assert Lokal.get(lokal.id) == null
        assert response.redirectedUrl == '/lokal/list'
    }
}
