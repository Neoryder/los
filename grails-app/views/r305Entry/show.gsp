
<%@ page import="los.reports.R305Entry" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r305Entry.label', default: 'R305Entry')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-r305Entry" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-r305Entry" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list r305Entry">
			
				<g:if test="${r305EntryInstance?.student}">
				<li class="fieldcontain">
					<span id="student-label" class="property-label"><g:message code="r305Entry.student.label" default="Student" /></span>
					
						<span class="property-value" aria-labelledby="student-label"><g:link controller="student" action="show" id="${r305EntryInstance?.student?.id}">${r305EntryInstance?.student}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${r305EntryInstance?.r305}">
				<li class="fieldcontain">
					<span id="r305-label" class="property-label"><g:message code="r305Entry.r305.label" default="R305" /></span>
					
						<span class="property-value" aria-labelledby="r305-label"><g:link controller="r305" action="show" id="${r305EntryInstance?.r305?.id}">${r305EntryInstance?.r305?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${r305EntryInstance?.id}" />
					<g:link class="edit" action="edit" id="${r305EntryInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
