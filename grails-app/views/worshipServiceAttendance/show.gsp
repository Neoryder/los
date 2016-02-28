
<%@ page import="los.WorshipServiceAttendance" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'worshipServiceAttendance.label', default: 'WorshipServiceAttendance')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>
        <r:require modules="bootstrap"/>
	</head>
	<body>
		<a href="#show-worshipServiceAttendance" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-worshipServiceAttendance" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list worshipServiceAttendance">
			
				<g:if test="${worshipServiceAttendanceInstance?.dateOfAttendance}">
				<li class="fieldcontain">
					<span id="dateOfAttendance-label" class="property-label"><g:message code="worshipServiceAttendance.dateOfAttendance.label" default="Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="dateOfAttendance-label"><g:formatDate date="${worshipServiceAttendanceInstance?.dateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${worshipServiceAttendanceInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="worshipServiceAttendance.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${worshipServiceAttendanceInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${worshipServiceAttendanceInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="worshipServiceAttendance.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:fieldValue bean="${worshipServiceAttendanceInstance}" field="status"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${worshipServiceAttendanceInstance?.lokal}">
				<li class="fieldcontain">
					<span id="lokal-label" class="property-label"><g:message code="worshipServiceAttendance.lokal.label" default="Lokal" /></span>
					
						<span class="property-value" aria-labelledby="lokal-label"><g:link controller="lokal" action="show" id="${worshipServiceAttendanceInstance?.lokal?.id}">${worshipServiceAttendanceInstance?.lokal?.lokal?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${worshipServiceAttendanceInstance?.student}">
				<li class="fieldcontain">
					<span id="student-label" class="property-label"><g:message code="worshipServiceAttendance.student.label" default="Student" /></span>
					
						<span class="property-value" aria-labelledby="student-label"><g:link controller="student" action="show" id="${worshipServiceAttendanceInstance?.student?.id}">${worshipServiceAttendanceInstance?.student?.referenceNumber01?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${worshipServiceAttendanceInstance?.id}" />
					<g:link class="edit" action="edit" id="${worshipServiceAttendanceInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
