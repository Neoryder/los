
<%@ page import="los.reports.R304" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r304.label', default: 'R304')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>
        <r:require modules="bootstrap"/>
	</head>
	<body>
		<a href="#list-r304" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-r304" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>


            <div class="table-responsive">
                <table class="table table-striped table-bordered table-condensed">
                    <thead>
                    <tr>

                        <g:sortableColumn property="dateFrom" title="${message(code: 'r304.dateFrom.label', default: 'Date From')}" />

                        <g:sortableColumn property="dateTo" title="${message(code: 'r304.dateTo.label', default: 'Date To')}" />

                        <th><g:message code="r304.lokal.label" default="Lokal" /></th>

                        <th><g:message code="r304.teacher.label" default="Teacher" /></th>

                        <g:sortableColumn property="weekNo" title="${message(code: 'r304.weekNo.label', default: 'Week No')}" />

                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${r304InstanceList}" status="i" var="r304Instance">
                        <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                            <td><g:link action="show" id="${r304Instance.id}">${fieldValue(bean: r304Instance, field: "dateFrom")}</g:link></td>

                            <td><g:formatDate date="${r304Instance.dateTo}" /></td>

                            <td>${fieldValue(bean: r304Instance, field: "lokal")}</td>

                            <td>${fieldValue(bean: r304Instance, field: "teacher")}</td>

                            <td>${fieldValue(bean: r304Instance, field: "weekNo")}</td>

                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>

			<div class="pagination">
				<g:paginate total="${r304InstanceTotal}" />
			</div>
		</div>
	</body>
</html>
