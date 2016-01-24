
<%@ page import="los.reports.R305Entry" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r305Entry.label', default: 'R305Entry')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-r305Entry" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-r305Entry" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<th><g:message code="r305Entry.student.label" default="Student" /></th>
					
						<th><g:message code="r305Entry.r305.label" default="R305" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${r305EntryInstanceList}" status="i" var="r305EntryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${r305EntryInstance.id}">${fieldValue(bean: r305EntryInstance, field: "student")}</g:link></td>
					
						<td>${fieldValue(bean: r305EntryInstance, field: "r305")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${r305EntryInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
