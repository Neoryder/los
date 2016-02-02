
<%@ page import="los.reports.R305" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r305.label', default: 'R305')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-r305" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-r305" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>

                        <g:sortableColumn property="weekNo" title="${message(code: 'r305.weekNo.label', default: 'Week No')}" />
					
						<th><g:message code="r305.lokal.label" default="Lokal" /></th>
					
						<th><g:message code="r305.teacher.label" default="Teacher" /></th>

                        <g:sortableColumn property="dateFrom" title="${message(code: 'r305.dateFrom.label', default: 'Date From')}" />

                        <g:sortableColumn property="dateTo" title="${message(code: 'r305.dateTo.label', default: 'Date To')}" />

					</tr>
				</thead>
				<tbody>
				<g:each in="${r305InstanceList}" status="i" var="r305Instance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                        <td><g:link action="show" id="${r305Instance.id}">${fieldValue(bean: r305Instance, field: "weekNo")}</g:link></td>

                        <td>${fieldValue(bean: r305Instance, field: "lokal.lokal")}</td>

                        <td>${fieldValue(bean: r305Instance, field: "teacher.name")}</td>

						<td><g:formatDate date="${r305Instance.dateFrom}" format="MM/dd/yyyy" /></td>
					
						<td><g:formatDate date="${r305Instance.dateTo}" format="MM/dd/yyyy" /></td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${r305InstanceTotal}" />
			</div>
		</div>
	</body>
</html>
