package los



import org.junit.*
import grails.test.mixin.*

@TestFor(WorshipServiceAttendanceController)
@Mock(WorshipServiceAttendance)
class WorshipServiceAttendanceControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/worshipServiceAttendance/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.worshipServiceAttendanceInstanceList.size() == 0
        assert model.worshipServiceAttendanceInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.worshipServiceAttendanceInstance != null
    }

    void testSave() {
        controller.save()

        assert model.worshipServiceAttendanceInstance != null
        assert view == '/worshipServiceAttendance/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/worshipServiceAttendance/show/1'
        assert controller.flash.message != null
        assert WorshipServiceAttendance.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/worshipServiceAttendance/list'

        populateValidParams(params)
        def worshipServiceAttendance = new WorshipServiceAttendance(params)

        assert worshipServiceAttendance.save() != null

        params.id = worshipServiceAttendance.id

        def model = controller.show()

        assert model.worshipServiceAttendanceInstance == worshipServiceAttendance
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/worshipServiceAttendance/list'

        populateValidParams(params)
        def worshipServiceAttendance = new WorshipServiceAttendance(params)

        assert worshipServiceAttendance.save() != null

        params.id = worshipServiceAttendance.id

        def model = controller.edit()

        assert model.worshipServiceAttendanceInstance == worshipServiceAttendance
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/worshipServiceAttendance/list'

        response.reset()

        populateValidParams(params)
        def worshipServiceAttendance = new WorshipServiceAttendance(params)

        assert worshipServiceAttendance.save() != null

        // test invalid parameters in update
        params.id = worshipServiceAttendance.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/worshipServiceAttendance/edit"
        assert model.worshipServiceAttendanceInstance != null

        worshipServiceAttendance.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/worshipServiceAttendance/show/$worshipServiceAttendance.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        worshipServiceAttendance.clearErrors()

        populateValidParams(params)
        params.id = worshipServiceAttendance.id
        params.version = -1
        controller.update()

        assert view == "/worshipServiceAttendance/edit"
        assert model.worshipServiceAttendanceInstance != null
        assert model.worshipServiceAttendanceInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/worshipServiceAttendance/list'

        response.reset()

        populateValidParams(params)
        def worshipServiceAttendance = new WorshipServiceAttendance(params)

        assert worshipServiceAttendance.save() != null
        assert WorshipServiceAttendance.count() == 1

        params.id = worshipServiceAttendance.id

        controller.delete()

        assert WorshipServiceAttendance.count() == 0
        assert WorshipServiceAttendance.get(worshipServiceAttendance.id) == null
        assert response.redirectedUrl == '/worshipServiceAttendance/list'
    }
}
