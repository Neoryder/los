<%@ page import="los.reports.R305Entry" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r305Entry.label', default: 'R305Entry')}" />
		<title><g:message code="default.create.label" args="[entityName]" /></title>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>
        <r:require modules="bootstrap"/>
	</head>
	<body>
	<g:javascript src="autocomplete_common.js" />
    <script type="text/javascript">
        //Auto Complete
        var autoCompleteStudentUrl = '${g.createLink(controller:'autoComplete', action:'autoCompleteStudent')}';
        var autoCompleteTeacherUrl = '${g.createLink(controller:'autoComplete', action:'autoCompleteTeacher')}';
        var autoCompleteR303Url = '${g.createLink(controller:'autoComplete', action:'autoCompleteR303')}';
        var autoCompleteR305Url = '${g.createLink(controller:'autoComplete', action:'autoCompleteR305')}';
    </script>
		<a href="#create-r305Entry" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="create-r305Entry" class="content scaffold-create" role="main">
			<h1><g:message code="default.create.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<g:hasErrors bean="${r305EntryInstance}">
			<ul class="errors" role="alert">
				<g:eachError bean="${r305EntryInstance}" var="error">
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
