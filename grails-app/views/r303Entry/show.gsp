
<%@ page import="los.reports.R303Entry" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r303Entry.label', default: 'R303Entry')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-r303Entry" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-r303Entry" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list r303Entry">
			
				<g:if test="${r303EntryInstance?.lessonFri}">
				<li class="fieldcontain">
					<span id="lessonFri-label" class="property-label"><g:message code="r303Entry.lessonFri.label" default="Lesson Fri" /></span>
					
						<span class="property-value" aria-labelledby="lessonFri-label"><g:fieldValue bean="${r303EntryInstance}" field="lessonFri"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${r303EntryInstance?.lessonMon}">
				<li class="fieldcontain">
					<span id="lessonMon-label" class="property-label"><g:message code="r303Entry.lessonMon.label" default="Lesson Mon" /></span>
					
						<span class="property-value" aria-labelledby="lessonMon-label"><g:fieldValue bean="${r303EntryInstance}" field="lessonMon"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${r303EntryInstance?.lessonSat}">
				<li class="fieldcontain">
					<span id="lessonSat-label" class="property-label"><g:message code="r303Entry.lessonSat.label" default="Lesson Sat" /></span>
					
						<span class="property-value" aria-labelledby="lessonSat-label"><g:fieldValue bean="${r303EntryInstance}" field="lessonSat"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${r303EntryInstance?.lessonSun}">
				<li class="fieldcontain">
					<span id="lessonSun-label" class="property-label"><g:message code="r303Entry.lessonSun.label" default="Lesson Sun" /></span>
					
						<span class="property-value" aria-labelledby="lessonSun-label"><g:fieldValue bean="${r303EntryInstance}" field="lessonSun"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${r303EntryInstance?.lessonThu}">
				<li class="fieldcontain">
					<span id="lessonThu-label" class="property-label"><g:message code="r303Entry.lessonThu.label" default="Lesson Thu" /></span>
					
						<span class="property-value" aria-labelledby="lessonThu-label"><g:fieldValue bean="${r303EntryInstance}" field="lessonThu"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${r303EntryInstance?.lessonTue}">
				<li class="fieldcontain">
					<span id="lessonTue-label" class="property-label"><g:message code="r303Entry.lessonTue.label" default="Lesson Tue" /></span>
					
						<span class="property-value" aria-labelledby="lessonTue-label"><g:fieldValue bean="${r303EntryInstance}" field="lessonTue"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${r303EntryInstance?.lessonWed}">
				<li class="fieldcontain">
					<span id="lessonWed-label" class="property-label"><g:message code="r303Entry.lessonWed.label" default="Lesson Wed" /></span>
					
						<span class="property-value" aria-labelledby="lessonWed-label"><g:fieldValue bean="${r303EntryInstance}" field="lessonWed"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${r303EntryInstance?.student}">
				<li class="fieldcontain">
					<span id="student-label" class="property-label"><g:message code="r303Entry.student.label" default="Student" /></span>
					
						<span class="property-value" aria-labelledby="student-label"><g:link controller="student" action="show" id="${r303EntryInstance?.student?.id}">${r303EntryInstance?.student?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${r303EntryInstance?.id}" />
					<g:link class="edit" action="edit" id="${r303EntryInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
