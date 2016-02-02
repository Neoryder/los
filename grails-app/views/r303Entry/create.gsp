<%@ page import="los.reports.R303Entry" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r303Entry.label', default: 'R303Entry')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>
	</head>
	<body>
    <script type="text/javascript">
        //Auto Complete
        var autoCompleteStudentUrl = '${g.createLink(controller:'autoComplete', action:'autoCompleteStudent')}';
        var autoCompleteTeacherUrl = '${g.createLink(controller:'autoComplete', action:'autoCompleteTeacher')}';
        var autoCompleteR303Url = '${g.createLink(controller:'autoComplete', action:'autoCompleteR303')}';

        function formatResultR303(results) {
            console.log('formatResultR303');
            var markup = '<table><tr><td>';
            markup += '<div>' + results.teacher + '</div>';
            markup += '<div class="autocomplete_id_below">' + results.dateFrom + '</div>';
            markup += '<div class="autocomplete_id_below">' + results.dateTo + '</div>';
            markup += '<div class="autocomplete_id_below">' + results.lokal + '</div>';
            markup += '<div class="autocomplete_id_below">' + results.id + '</div>';
            markup += '</td></tr></table>';
            console.log(markup)
            return markup;
        }

        function formatSelectionR303(result) {
            console.log('formatSelectionR303');
            console.log(result);

            if(result.dateFrom){
                return result.dateFrom+"-"+result.dateTo+"|"+result.lokal+"|"+result.teacher;
            } else {
                return result.text;
            }
        }



        $(document).ready(function() {
            var pageSize = 20;


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

            var $eventSelect = $("#teacher");
            $eventSelect.on("change", function (e) {
                $("#teacherId").val($("#teacher").val())
            });

        });
    </script>
		<a href="#create-r303Entry" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="create-r303Entry" class="content scaffold-create" role="main">
			<h1><g:message code="default.create.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${r303EntryInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${r303EntryInstance}" var="error">
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
