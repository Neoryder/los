
<%@ page import="los.Teacher" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'teacher.label', default: 'Teacher')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>
        <r:require modules="bootstrap"/>
	</head>
	<body>
		%{--<a href="#list-teacher" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>--}%
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-teacher" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>

            <div class="table-responsive">
                <table class="table table-striped table-bordered table-condensed">

                    <thead>
                    <tr>

                        <g:sortableColumn property="assignedNumber" title="${message(code: 'teacher.assignedNumber.label', default: 'Assigned Number')}" />

                        <g:sortableColumn property="name" title="${message(code: 'teacher.name.label', default: 'Name')}" />

                        <g:sortableColumn property="type" title="${message(code: 'teacher.type.label', default: 'Type')}" />

                        <g:sortableColumn property="status" title="${message(code: 'teacher.status.label', default: 'Status')}" />

                        <th><g:message code="teacher.lokal.label" default="Lokal" /></th>

                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${teacherInstanceList}" status="i" var="teacherInstance">
                        <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                            <td><g:link action="show" id="${teacherInstance.id}">${fieldValue(bean: teacherInstance, field: "assignedNumber")}</g:link></td>

                            <td>${fieldValue(bean: teacherInstance, field: "name")}</td>

                            <td>${fieldValue(bean: teacherInstance, field: "type")}</td>

                            <td>${fieldValue(bean: teacherInstance, field: "status")}</td>

                            <td>${fieldValue(bean: teacherInstance, field: "lokal")}</td>

                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>

			<div class="pagination">
				<g:paginate total="${teacherInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
