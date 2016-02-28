
<%@ page import="los.reports.R303" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r303.label', default: 'R303')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-r303" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-r303" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list r303">
			
				<g:if test="${r303Instance?.dateFrom}">
				<li class="fieldcontain">
					<span id="dateFrom-label" class="property-label"><g:message code="r303.dateFrom.label" default="Date From" /></span>
					
						<span class="property-value" aria-labelledby="dateFrom-label"><g:formatDate date="${r303Instance?.dateFrom}" format="MMM-dd-yyyy" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${r303Instance?.dateTo}">
				<li class="fieldcontain">
					<span id="dateTo-label" class="property-label"><g:message code="r303.dateTo.label" default="Date To" /></span>
						<span class="property-value" aria-labelledby="dateTo-label"><g:formatDate date="${r303Instance?.dateTo}" format="MMM-dd-yyyy"  /></span>
				</li>
				</g:if>
			
				<g:if test="${r303Instance?.entry}">
				<li class="fieldcontain">
					<span id="entry-label" class="property-label"><g:message code="r303.entry.label" default="Entry" /></span>
						<g:each in="${r303Instance.entry}" var="e">
						<span class="property-value" aria-labelledby="entry-label"><g:link controller="r303Entry" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></span>
						</g:each>
				</li>
				</g:if>
			
				<g:if test="${r303Instance?.lokal}">
				<li class="fieldcontain">
					<span id="lokal-label" class="property-label"><g:message code="r303.lokal.label" default="Lokal" /></span>
                    <span class="property-value" aria-labelledby="lokal-label"><g:link controller="lokal" action="show" id="${r303Instance?.lokal?.id}">${r303Instance?.lokal?.lokal.encodeAsHTML()}</g:link></span>
				</li>
				</g:if>
			
				<g:if test="${r303Instance?.teacher}">
				<li class="fieldcontain">
					<span id="teacher-label" class="property-label"><g:message code="r303.teacher.label" default="Teacher" /></span>
                    <span class="property-value" aria-labelledby="teacher-label"><g:link controller="teacher" action="show" id="${r303Instance?.teacher?.id}">${r303Instance?.teacher}</g:link></span>
				</li>
				</g:if>
			
				<g:if test="${r303Instance?.weekNo}">
				<li class="fieldcontain">
					<span id="weekNo-label" class="property-label"><g:message code="r303.weekNo.label" default="Week No" /></span>
					
						<span class="property-value" aria-labelledby="weekNo-label"><g:fieldValue bean="${r303Instance}" field="weekNo"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${r303Instance?.id}" />
					<g:link class="edit" action="edit" id="${r303Instance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
