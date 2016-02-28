<%@ page import="los.Student" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'student.label', default: 'Student')}" />
		<title><g:message code="default.edit.label" args="[entityName]" /></title>
        <link rel="stylesheet" href="${resource(dir: 'js/jqwidgets/styles', file: 'jqx.base.css')}" type="text/css">
        <link rel="stylesheet" href="${resource(dir: 'js/jqwidgets/styles', file: 'jqx.classic.css')}" type="text/css">
        <script src="${resource(dir: 'js/jqwidgets', file: 'jqx-all.js')}" type="text/javascript"></script>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>
        <r:require modules="bootstrap"/>

        <script type="text/javascript">
            $(document).ready(function () {
                // Create a jqxDateTimeInput
//                $("#birthDate").jqxDateTimeInput({theme: "arctic",  width: '100px', height: '25px'});
                $("#birthDate").jqxDateTimeInput({ width: '150px', height: '25px', showCalendarButton:true,  formatString: 'MMM-dd-yyyy'  });
            });
        </script>
	</head>
	<body>
	<g:javascript src="autocomplete_common.js" />

    <script type="text/javascript">
        var autoCompleteTeacherUrl = '${g.createLink(controller:'autoComplete', action:'autoCompleteTeacher')}';
    </script>
		<a href="#edit-student" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="edit-student" class="content scaffold-edit" role="main">
			<h1><g:message code="default.edit.label" args="[entityName]" /></h1>
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
			<g:form method="post" >
				<g:hiddenField name="id" value="${studentInstance?.id}" />
				<g:hiddenField name="version" value="${studentInstance?.version}" />
				<fieldset class="form">
					<g:render template="form"/>
				</fieldset>
				<fieldset class="buttons">
					<g:actionSubmit class="save" action="update" value="${message(code: 'default.button.update.label', default: 'Update')}" />
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" formnovalidate="" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
