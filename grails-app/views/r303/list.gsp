
<%@ page import="los.reports.R303" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r303.label', default: 'R303')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-r303" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-r303" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="dateFrom"  title="${message(code: 'r303.dateFrom.label', default: 'Date From')}" />
					
						<g:sortableColumn property="dateTo" title="${message(code: 'r303.dateTo.label', default: 'Date To')}" />
					
						<th><g:message code="r303.lokal.label" default="Lokal" /></th>
					
						<th><g:message code="r303.teacher.label" default="Teacher" /></th>
					
						<g:sortableColumn property="weekNo" title="${message(code: 'r303.weekNo.label', default: 'Week No')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${r303InstanceList}" status="i" var="r303Instance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${r303Instance.id}"><g:formatDate date="${r303Instance.dateFrom}" format="MMM-dd-yyyy" /></g:link></td>
					
						<td><g:formatDate date="${r303Instance.dateTo}" format="MMM-dd-yyyy" /></td>
					
						<td>${fieldValue(bean: r303Instance, field: "lokal.lokal")}</td>
					
						<td>${fieldValue(bean: r303Instance, field: "teacher.name")}</td>
					
						<td>${fieldValue(bean: r303Instance, field: "weekNo")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${r303InstanceTotal}" />
			</div>
		</div>
	</body>
</html>
