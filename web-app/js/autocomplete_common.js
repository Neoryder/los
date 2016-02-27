$(document).ready(function() {
	
    $( "#dateFrom" ).datepicker({
                beforeShowDay: function(date){
                    var day = date.getDay();
//                        return [day == 1 || day == 4,""]; //Monday and Thursday
                    return [day == 1 ,""];
                }
            }
    );

	
    var pageSize = 20;

    $("#teacher").select2({
        ajax: {
            url: autoCompleteTeacherUrl,
            dataType: 'json',
            delay: 250,
            data: function (params) {
                return {
                    starts_with: params.term, // search term
                    page: params.page
                };
            },
            processResults: function (data, params) {
                // parse the results into the format expected by Select2
                // since we are using custom formatting functions we do not need to
                // alter the remote JSON data, except to indicate that infinite
                // scrolling can be used
                params.page = params.page || 1;

                return {
                    results: data.results,
                    pagination: {
                        more: (params.page * 30) < data.total
                    }
                };
            },
            cache: true
        },
        escapeMarkup: function (markup) { return markup; }, // let our custom formatter work
        minimumInputLength: 1,
        dropdownCssClass: "bigdrop",
        templateResult: formatResultTeacher,
        templateSelection: formatSelectionTeachers
    });

    var $teacherSelect = $("#teacher");
    $teacherSelect.on("change", function (e) {
        $("#teacherId").val($("#teacher").val())
    });
    
    $("#student").select2({
        ajax: {
            url: autoCompleteStudentUrl,
            dataType: 'json',
            delay: 250,
            data: function (params) {
                return {
                    starts_with: params.term, // search term
                    page: params.page
                };
            },
            processResults: function (data, params) {
                // parse the results into the format expected by Select2
                // since we are using custom formatting functions we do not need to
                // alter the remote JSON data, except to indicate that infinite
                // scrolling can be used
                params.page = params.page || 1;

                return {
                    results: data.results,
                    pagination: {
                        more: (params.page * 30) < data.total
                    }
                };
            },
            cache: true
        },
        escapeMarkup: function (markup) { return markup; }, // let our custom formatter work
        minimumInputLength: 1,
        dropdownCssClass: "bigdrop",
        templateResult: formatResultStudent,
        templateSelection: formatSelectionStudent
    });

    var $studentSelect = $("#student");
    $studentSelect.on("change", function (e) {
        $("#studentId").val($("#student").val())
    });

    $("#r303").select2({
        ajax: {
            url: autoCompleteR303Url,
            dataType: 'json',
            delay: 250,
            data: function (params) {
                return {
                    starts_with: params.term, // search term
                    page: params.page
                };
            },
            processResults: function (data, params) {
                // parse the results into the format expected by Select2
                // since we are using custom formatting functions we do not need to
                // alter the remote JSON data, except to indicate that infinite
                // scrolling can be used
                params.page = params.page || 1;

                return {
                    results: data.results,
                    pagination: {
                        more: (params.page * 30) < data.total
                    }
                };
            },
            cache: true
        },
        escapeMarkup: function (markup) { return markup; }, // let our custom formatter work
        minimumInputLength: 1,
        dropdownCssClass: "bigdrop",
        templateResult: formatResultR303,
        templateSelection: formatSelectionR303
    });

    var $r303Select = $("#r303");
    $r303Select.on("change", function (e) {
        $("#r303Id").val($("#r303").val())
    });

    function formatResultTeacher(results) {
        console.log('formatResultTeacher');
        var markup = '<table><tr><td>';
        if(results.label) {
        	markup += '<div>' + results.label + '</div>';
        	markup += '<div class="autocomplete_id_below">' + results.assignedNumber + '</div>';
        	markup += '<div class="autocomplete_id_below">' + results.id + '</div>';
        } else {
        	markup += '<div>' + "Loading teachers..." + '</div>';
        }
        markup += '</td></tr></table>';
        console.log(markup)
        return markup;
    }

    function formatSelectionTeachers(result) {
    	console.log('formatSelectionTeachers');
        console.log(result);
        if(result.label){
            return result.label+"|"+result.assignedNumber;
        } else if(result.id){
            return result.text;
        } else {
        	return 'Please select a teacher';
        }
    }

    function formatRepo (repo) {
        if (repo.loading) return repo.text;

        var markup = "<div class='select2-result-repository clearfix'>" +
                "<div class='select2-result-repository__avatar'><img src='" + repo.owner.avatar_url + "' /></div>" +
                "<div class='select2-result-repository__meta'>" +
                "<div class='select2-result-repository__title'>" + repo.full_name + "</div>";

        if (repo.description) {
            markup += "<div class='select2-result-repository__description'>" + repo.description + "</div>";
        }

        markup += "<div class='select2-result-repository__statistics'>" +
        "<div class='select2-result-repository__forks'><i class='fa fa-flash'></i> " + repo.forks_count + " Forks</div>" +
        "<div class='select2-result-repository__stargazers'><i class='fa fa-star'></i> " + repo.stargazers_count + " Stars</div>" +
        "<div class='select2-result-repository__watchers'><i class='fa fa-eye'></i> " + repo.watchers_count + " Watchers</div>" +
        "</div>" +
        "</div></div>";

        return markup;
    }

    function formatRepoSelection (repo) {
        return repo.full_name || repo.text;
    }
    
    function formatResultR303(results) {
        console.log('formatResultR303');
        var markup = '<table><tr><td>';
        if(results.teacher) {
        	markup += '<div>' + results.teacher + '</div>';
        	markup += '<div class="autocomplete_id_below">' + results.dateFrom + '</div>';
        	markup += '<div class="autocomplete_id_below">' + results.dateTo + '</div>';
        	markup += '<div class="autocomplete_id_below">' + results.lokal + '</div>';
        	markup += '<div class="autocomplete_id_below">' + results.id + '</div>';
        } else {
        	markup += '<div>' + "Loading R303..." + '</div>';
        }
        markup += '</td></tr></table>';
        console.log(markup)
        return markup;
    }

    function formatSelectionR303(result) {
        console.log('formatSelectionR303');
        console.log(result);

        if(result.dateFrom){
            return result.dateFrom+"-"+result.dateTo+"|"+result.lokal+"|"+result.teacher;
        } else if(result.id) {
            return result.text;
        } else {
        	return 'Please select an R303';
        }
    }



    function formatResultStudent(results) {
        console.log('formatResultStudent');
        var markup = '<table><tr><td>';
        if(results.referenceNumber01) {
        	markup += '<div>' + results.referenceNumber01 + '</div>';
        	markup += '<div class="autocomplete_id_below">' + results.firstName + '</div>';
        	markup += '<div class="autocomplete_id_below">' + results.middleName + '</div>';
        	markup += '<div class="autocomplete_id_below">' + results.lastName + '</div>';
        	if(results.husbandsLastName) {
        		markup += '<div class="autocomplete_id_below">' + results.husbandsLastName + '</div>';
        	}
        	markup += '<div class="autocomplete_id_below">' + results.lokal + '</div>';
        } else {
        	markup += '<div>' + "Loading students..." + '</div>';
        }
        markup += '</td></tr></table>';
        console.log(markup)
        return markup;
    }

    function formatSelectionStudent(result) {
        console.log('formatSelectionStudent');
        console.log(result);

        if(result.referenceNumber01){
            if(result.husbandsLastName){
                return result.referenceNumber01+"-"+result.firstName+"|"+result.middleName+"|"+result.lastName+"|"+result.husbandsLastName+"|"+result.lokal;
            } else {
                return result.referenceNumber01+"-"+result.firstName+"|"+result.middleName+"|"+result.lastName+"|"+result.lokal;
            }
        } else if(result.id){
            return result.text;
        } else {
        	return 'Please select a student';
        }
    }
});