
<%@ page import="los.WorshipServiceAttendance" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'worshipServiceAttendance.label', default: 'WorshipServiceAttendance')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-worshipServiceAttendance" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-worshipServiceAttendance" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="dateOfAttendance" title="${message(code: 'worshipServiceAttendance.dateOfAttendance.label', default: 'Date Of Attendance')}" />
					
						%{--<g:sortableColumn property="type" title="${message(code: 'worshipServiceAttendance.type.label', default: 'Type')}" />--}%
					
						%{--<g:sortableColumn property="status" title="${message(code: 'worshipServiceAttendance.status.label', default: 'Status')}" />--}%
					
						<th><g:message code="worshipServiceAttendance.lokal.label" default="Lokal" /></th>
					
						<th><g:message code="worshipServiceAttendance.student.label" default="Student" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${worshipServiceAttendanceInstanceList}" status="i" var="worshipServiceAttendanceInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${worshipServiceAttendanceInstance.id}">${g.formatDate(date:worshipServiceAttendanceInstance.dateOfAttendance, format:"yyyy-MMM-dd")}</g:link></td>
					
						%{--<td>${fieldValue(bean: worshipServiceAttendanceInstance, field: "type")}</td>--}%
					
						%{--<td>${fieldValue(bean: worshipServiceAttendanceInstance, field: "status")}</td>--}%
					
						<td>${fieldValue(bean: worshipServiceAttendanceInstance, field: "lokal.lokal")}</td>
					
						<td>${fieldValue(bean: worshipServiceAttendanceInstance, field: "student.referenceNumber01")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${worshipServiceAttendanceInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
