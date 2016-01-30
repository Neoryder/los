<%@ page import="los.Student" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'student.label', default: 'Student')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
        <g:javascript library="jquery" plugin="jquery"/>
        <link rel="stylesheet" href="${resource(dir: 'js/jqwidgets/styles', file: 'jqx.base.css')}" type="text/css">
        <link rel="stylesheet" href="${resource(dir: 'js/jqwidgets/styles', file: 'jqx.classic.css')}" type="text/css">
        <script src="${resource(dir: 'js/jqwidgets', file: 'jqx-all.js')}" type="text/javascript"></script>
        %{--<script src="${resource(dir: 'js/jqwidgets', file: 'jqxdatetimeinput.js')}" type="text/javascript"></script>--}%
        %{--<script src="${resource(dir: 'js/jqwidgets', file: 'jqxcalendar.js')}" type="text/javascript"></script>--}%
        <script src="${resource(dir: 'js/jqwidgets/globalization', file: 'globalize.js')}" type="text/javascript"></script>

    </head>
	<body>
    %{--<script type="text/javascript">--}%
        %{--$(document).ready(function () {--}%
            %{--$("#birthDatePicker").jqxDateTimeInput({ width: '150px', height: '25px', formatString:'MM/dd/yyyy'});--}%
            %{--$("#birthDatePicker").on('valueChanged', function (event)--}%
            %{--{--}%
%{--//                var jsDate = event.args.date;--}%
                %{--$("#birthDate").val($("#birthDatePicker").val())--}%
            %{--});--}%
        %{--});--}%
    %{--</script>--}%

		<a href="#create-student" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="create-student" class="content scaffold-create" role="main">
			<h1><g:message code="default.create.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${studentInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${studentInstance}" var="error">
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
