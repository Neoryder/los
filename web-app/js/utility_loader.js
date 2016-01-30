/**
 * Created by Giancarlo Angulos on 1/30/2016.
 */


function formatResultStudent(result) {
    console.log('formatResultStudent');
    var markup = '<table><tr><td>';
    markup += '<div>' + result.label + '</div>';
    markup += '<div class="autocomplete_id_below">' + result.referenceNumber01 + '</div>';
    markup += '<div class="autocomplete_id_below">' + result.id + '</div>';
    markup += '</td></tr></table>';
    return markup;
}

function formatSelectionStudents(result) {
    console.log('formatSelectionStudents');
    return result.id;
}

jQuery.fn.setStudentDropdown = function() {
    console.log('setStudentDropdown');
    var elementName = '#'+this.attr("id");

    $(elementName).select2({
        minimumInputLength: 2,
        placeholder: 'SELECT ONE...',
        allowClear:true,
        ajax: { // instead of writing the function to execute the request we use Select2's convenient helper
            url: autoCompleteStudentUrl,
            dataType: 'json',
            type:"GET",
            data: function (term, page) {
                return {
                    starts_with: term,
                    page_limit: 10//,
                };
            },
            results: function (data, page) { // parse the results into the format expected by Select2.
                //since we are using custom formatting functions we do not need to alter remote JSON data
                var more = (page * 10) < data.total; // whether or not there are more results available

                // notice we return the value of more so Select2 knows if more results can be loaded
                return {results: data.results, more: more};

            }
        },
        formatResult: formatResultStudent, // omitted for brevity, see the source of this page
        formatSelection: formatSelectionStudents, // omitted for brevity, see the source of this page
        dropdownCssClass: "bigdrop" // apply css that makes the dropdown taller
    });

    return this;
}


function formatResultTeacher(result) {
    console.log('formatResultTeacher');
    var markup = '<table><tr><td>';
    markup += '<div>' + result.label + '</div>';
    markup += '<div class="autocomplete_id_below">' + result.referenceNumber01 + '</div>';
    markup += '<div class="autocomplete_id_below">' + result.id + '</div>';
    markup += '</td></tr></table>';
    return markup;
}

function formatSelectionTeachers(result) {
    console.log('formatSelectionTeachers');
    return result.id;
}

jQuery.fn.setTeacherDropdown = function() {
    console.log('setTeacherDropdown');
    console.log(autoCompleteTeacherUrl);
    var elementName = '#'+this.attr("id");

    $(elementName).select2({
        minimumInputLength: 2,
        placeholder: 'SELECT ONE...',
        allowClear:true,
        ajax: { // instead of writing the function to execute the request we use Select2's convenient helper
            quietMillis: 150,
            url: autoCompleteTeacherUrl,
            dataType: 'json',
            data: function (term, page) {
                return {
                    starts_with: term,
                    page_limit: 10//,
                };
            },
            results: function (data, page) { // parse the results into the format expected by Select2.
                //since we are using custom formatting functions we do not need to alter remote JSON data
                var more = (page * 10) < data.total; // whether or not there are more results available

                // notice we return the value of more so Select2 knows if more results can be loaded
                return {results: data.results, more: more};

            }
        },
        formatResult: formatResultStudent, // omitted for brevity, see the source of this page
        formatSelection: formatSelectionStudents, // omitted for brevity, see the source of this page
        dropdownCssClass: "bigdrop" // apply css that makes the dropdown taller
    });

    return this;
}





function resetFields() {
    $('#student').select2('data',{id: null});
    $('#teacher').select2('data',{id: null});
}
