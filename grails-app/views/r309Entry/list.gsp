
<%@ page import="los.reports.R309Entry" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r309Entry.label', default: 'R309Entry')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-r309Entry" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-r309Entry" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<th><g:message code="r309Entry.student.label" default="Student" /></th>
					
						<th><g:message code="r309Entry.r309.label" default="R309" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${r309EntryInstanceList}" status="i" var="r309EntryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${r309EntryInstance.id}">${fieldValue(bean: r309EntryInstance, field: "student")}</g:link></td>
					
						<td>${fieldValue(bean: r309EntryInstance, field: "r309")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${r309EntryInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
