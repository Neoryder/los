<%@ page import="los.reports.R309" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r309.label', default: 'R309')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>

    </head>
	<body>
    <script>
        $(document).ready(function () {
            $( "#dateFrom" ).datepicker({
                        beforeShowDay: function(date){
                            var day = date.getDay();
//                            return [day == 1 || day == 4,""]; //Monday and Thursday
                            return [day == 1 ,""];
                        }
                    }
            );

            $( "#date" ).datepicker({
                        beforeShowDay: function(date){
                            var day = date.getDay();
                            return [day == 4 || day == 0,""]; //Thursday and Sunday
//                            return [day == 1 ,""];
                        }
                    }
            );

        });
    </script>
    <script type="text/javascript">
        //Auto Complete
        var autoCompleteStudentUrl = '${g.createLink(controller:'autoComplete', action:'autoCompleteStudent')}';
        var autoCompleteTeacherUrl = '${g.createLink(controller:'autoComplete', action:'autoCompleteTeacher')}';

        function formatResultTeacher(results) {
            console.log('formatResultTeacher');
            var markup = '<table><tr><td>';
            markup += '<div>' + results.label + '</div>';
            markup += '<div class="autocomplete_id_below">' + results.assignedNumber + '</div>';
            markup += '<div class="autocomplete_id_below">' + results.id + '</div>';
            markup += '</td></tr></table>';
            console.log(markup)
            return markup;
        }

        function formatSelectionTeachers(result) {
            console.log('formatSelectionTeachers');
            return result.label+"|"+result.assignedNumber;
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


        $(document).ready(function() {
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

            var $eventSelect = $("#teacher");
            $eventSelect.on("change", function (e) {
                $("#teacherId").val($("#teacher").val())
            });

        });
    </script>
		<a href="#create-r309" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="create-r309" class="content scaffold-create" role="main">
			<h1><g:message code="default.create.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${r309Instance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${r309Instance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form action="save" >
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:submitButton name="create" class="save" value="${message(code: 'default.button.create.label', default: 'Create')}" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
