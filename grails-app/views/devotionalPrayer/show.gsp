
<%@ page import="los.DevotionalPrayer" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'devotionalPrayer.label', default: 'DevotionalPrayer')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>
        <r:require modules="bootstrap"/>
	</head>
	<body>
		<a href="#show-devotionalPrayer" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-devotionalPrayer" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list devotionalPrayer">
			
				<g:if test="${devotionalPrayerInstance?.dateOfAttendance}">
				<li class="fieldcontain">
					<span id="dateOfAttendance-label" class="property-label"><g:message code="devotionalPrayer.dateOfAttendance.label" default="Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="dateOfAttendance-label"><g:formatDate date="${devotionalPrayerInstance?.dateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${devotionalPrayerInstance?.student}">
				<li class="fieldcontain">
					<span id="student-label" class="property-label"><g:message code="devotionalPrayer.student.label" default="Student" /></span>
					
						<span class="property-value" aria-labelledby="student-label"><g:link controller="student" action="show" id="${devotionalPrayerInstance?.student?.id}">${devotionalPrayerInstance?.student?.referenceNumber01?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${devotionalPrayerInstance?.id}" />
					<g:link class="edit" action="edit" id="${devotionalPrayerInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
