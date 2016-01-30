<%@ page import="los.reports.R303" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r303.label', default: 'R303')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
        %{--<link rel="stylesheet" href="${resource(dir: 'css/bootstrap', file: 'bootstrap.css')}" type="text/css">--}%
        %{--<link rel="stylesheet" href="${resource(dir: 'css/bootstrap', file: 'bootstrap-datepicker3.css')}" type="text/css">--}%
        %{--<link rel="stylesheet" href="${resource(dir: 'css/bootstrap', file: 'selectize.css')}" type="text/css">--}%
        %{--<link rel="stylesheet" href="${resource(dir: 'css/bootstrap', file: 'selectize.bootstrap3.css')}" type="text/css">--}%
        %{--<g:javascript src="bootstrap.js"/>--}%
        %{--<g:javascript src="bootstrap-datepicker.js"/>--}%
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
        });
    </script>
		<a href="#create-r303" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="create-r303" class="content scaffold-create" role="main">
			<h1><g:message code="default.create.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${r303Instance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${r303Instance}" var="error">
				<li <g:if test="${error in org.springframework.validation.FieldError}">data-field-id="${error.field}"</g:if>><g:message error="${error}"/></li>
				</g:eachError>
			</ul>
			</g:hasErrors>
			<g:form action="save"  >
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
