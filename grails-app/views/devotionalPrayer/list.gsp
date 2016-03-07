
<%@ page import="los.DevotionalPrayer" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'devotionalPrayer.label', default: 'DevotionalPrayer')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>
        <r:require modules="bootstrap"/>
	</head>
	<body>
		%{--<a href="#list-devotionalPrayer" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>--}%
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-devotionalPrayer" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
            <div class="table-responsive">
                <table class="table table-striped table-bordered table-condensed">
                    <thead>
                    <tr>

                        <g:sortableColumn property="dateOfAttendance" title="${message(code: 'devotionalPrayer.dateOfAttendance.label', default: 'Date Of Attendance')}" />

                        %{--<g:sortableColumn property="type" title="${message(code: 'devotionalPrayer.type.label', default: 'Type')}" />--}%

                        %{--<g:sortableColumn property="status" title="${message(code: 'devotionalPrayer.status.label', default: 'Status')}" />--}%

                        <g:sortableColumn property="student.lokal.lokal" title="${message(code: 'devotionalPrayer.student.lokal.label', default: 'Lokal')}" />

                        %{--<th><g:message code="devotionalPrayer.student.lokal.label" default="Lokal" /></th>--}%

                        <th><g:message code="devotionalPrayer.student.label" default="Student" /></th>

                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${devotionalPrayerInstanceList}" status="i" var="devotionalPrayerInstance">
                        <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                            <td><g:link action="show" id="${devotionalPrayerInstance.id}">${g.formatDate(date:devotionalPrayerInstance.dateOfAttendance, format:"yyyy-MM-dd")}</g:link></td>

                            %{--<td>${fieldValue(bean: devotionalPrayerInstance, field: "type")}</td>--}%

                            %{--<td>${fieldValue(bean: devotionalPrayerInstance, field: "status")}</td>--}%

                            <td>${fieldValue(bean: devotionalPrayerInstance, field: "student.lokal.lokal")}</td>

                            <td>${fieldValue(bean: devotionalPrayerInstance, field: "student")}</td>

                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>

			<div class="pagination">
				<g:paginate total="${devotionalPrayerInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
