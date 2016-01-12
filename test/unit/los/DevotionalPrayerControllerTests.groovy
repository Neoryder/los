package los


import org.junit.*
import grails.test.mixin.*

@TestFor(DevotionalPrayerController)
@Mock(DevotionalPrayer)
class DevotionalPrayerControllerTests {

    def populateValidParams(params) {
        assert params != null
        // TODO: Populate valid properties like...
        //params["name"] = 'someValidName'
    }

    void testIndex() {
        controller.index()
        assert "/devotionalPrayer/list" == response.redirectedUrl
    }

    void testList() {

        def model = controller.list()

        assert model.devotionalPrayerInstanceList.size() == 0
        assert model.devotionalPrayerInstanceTotal == 0
    }

    void testCreate() {
        def model = controller.create()

        assert model.devotionalPrayerInstance != null
    }

    void testSave() {
        controller.save()

        assert model.devotionalPrayerInstance != null
        assert view == '/devotionalPrayer/create'

        response.reset()

        populateValidParams(params)
        controller.save()

        assert response.redirectedUrl == '/devotionalPrayer/show/1'
        assert controller.flash.message != null
        assert DevotionalPrayer.count() == 1
    }

    void testShow() {
        controller.show()

        assert flash.message != null
        assert response.redirectedUrl == '/devotionalPrayer/list'

        populateValidParams(params)
        def devotionalPrayer = new DevotionalPrayer(params)

        assert devotionalPrayer.save() != null

        params.id = devotionalPrayer.id

        def model = controller.show()

        assert model.devotionalPrayerInstance == devotionalPrayer
    }

    void testEdit() {
        controller.edit()

        assert flash.message != null
        assert response.redirectedUrl == '/devotionalPrayer/list'

        populateValidParams(params)
        def devotionalPrayer = new DevotionalPrayer(params)

        assert devotionalPrayer.save() != null

        params.id = devotionalPrayer.id

        def model = controller.edit()

        assert model.devotionalPrayerInstance == devotionalPrayer
    }

    void testUpdate() {
        controller.update()

        assert flash.message != null
        assert response.redirectedUrl == '/devotionalPrayer/list'

        response.reset()

        populateValidParams(params)
        def devotionalPrayer = new DevotionalPrayer(params)

        assert devotionalPrayer.save() != null

        // test invalid parameters in update
        params.id = devotionalPrayer.id
        //TODO: add invalid values to params object

        controller.update()

        assert view == "/devotionalPrayer/edit"
        assert model.devotionalPrayerInstance != null

        devotionalPrayer.clearErrors()

        populateValidParams(params)
        controller.update()

        assert response.redirectedUrl == "/devotionalPrayer/show/$devotionalPrayer.id"
        assert flash.message != null

        //test outdated version number
        response.reset()
        devotionalPrayer.clearErrors()

        populateValidParams(params)
        params.id = devotionalPrayer.id
        params.version = -1
        controller.update()

        assert view == "/devotionalPrayer/edit"
        assert model.devotionalPrayerInstance != null
        assert model.devotionalPrayerInstance.errors.getFieldError('version')
        assert flash.message != null
    }

    void testDelete() {
        controller.delete()
        assert flash.message != null
        assert response.redirectedUrl == '/devotionalPrayer/list'

        response.reset()

        populateValidParams(params)
        def devotionalPrayer = new DevotionalPrayer(params)

        assert devotionalPrayer.save() != null
        assert DevotionalPrayer.count() == 1

        params.id = devotionalPrayer.id

        controller.delete()

        assert DevotionalPrayer.count() == 0
        assert DevotionalPrayer.get(devotionalPrayer.id) == null
        assert response.redirectedUrl == '/devotionalPrayer/list'
    }
}
