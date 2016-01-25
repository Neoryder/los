
<%@ page import="los.Student" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'student.label', default: 'Student')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
        <link rel="stylesheet" href="${resource(dir: 'js/jqwidgets/styles', file: 'jqx.base.css')}" type="text/css">
        <link rel="stylesheet" href="${resource(dir: 'js/jqwidgets/styles', file: 'jqx.classic.css')}" type="text/css">
        <script src="${resource(dir: 'js/jqwidgets', file: 'jqx-all.js')}" type="text/javascript"></script>

        <script type="text/javascript">
            $(document).ready(function () {
                // Create a jqxDateTimeInput
//                $("#birthDate").jqxDateTimeInput({ width: '150px', height: '25px', showCalendarButton:true,  formatString: 'MMM-dd-yyyy'  });
            });
        </script>
	</head>
	<body>
		<a href="#list-student" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-student" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>

						<g:sortableColumn property="referenceNumber01" title="${message(code: 'student.referenceNumber01.label', default: 'Reference Number')}" />

						<g:sortableColumn property="firstName" title="${message(code: 'student.firstName.label', default: 'First Name')}" />
					
						<g:sortableColumn property="middleName" title="${message(code: 'student.middleName.label', default: 'Middle Name')}" />
					
						<g:sortableColumn property="lastName" title="${message(code: 'student.lastName.label', default: 'Last Name')}" />
					
						<g:sortableColumn property="husbandsLastName" title="${message(code: 'student.husbandsLastName.label', default: 'Husbands')}" />
					
						<g:sortableColumn property="spouseName" title="${message(code: 'student.spouseName.label', default: 'Spouse Name')}" />

						<th><g:message code="student.lokal.label" default="Lokal" /></th>
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${studentInstanceList}" status="i" var="studentInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

						<td><g:link action="show" id="${studentInstance.id}">${fieldValue(bean: studentInstance, field: "referenceNumber01")}</g:link></td>

						<td><g:link action="show" id="${studentInstance.id}">${fieldValue(bean: studentInstance, field: "firstName")}</g:link></td>
					
						<td>${fieldValue(bean: studentInstance, field: "middleName")}</td>
					
						<td>${fieldValue(bean: studentInstance, field: "lastName")}</td>
					
						<td>${fieldValue(bean: studentInstance, field: "husbandsLastName")}</td>
					
						<td>${fieldValue(bean: studentInstance, field: "spouseName")}</td>

						<td>${fieldValue(bean: studentInstance, field: "lokal.lokal")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${studentInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
