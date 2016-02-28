
<%@ page import="los.reports.R309" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r309.label', default: 'R309')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>
        <r:require modules="bootstrap"/>
	</head>
	<body>
		<a href="#list-r309" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-r309" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>


            <div class="table-responsive">
                <table class="table table-striped table-bordered table-condensed">
                    <thead>
                    <tr>

                        <g:sortableColumn property="weekNo" title="${message(code: 'r309.weekNo.label', default: 'Week No')}" />

                        <g:sortableColumn property="dateFrom" title="${message(code: 'r309.dateFrom.label', default: 'Date From')}" />

                        <g:sortableColumn property="dateTo" title="${message(code: 'r309.dateTo.label', default: 'Date To')}" />

                        <th><g:message code="r309.lokal.label" default="Lokal" /></th>

                        <th><g:message code="r309.teacher.label" default="Teacher" /></th>

                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${r309InstanceList}" status="i" var="r309Instance">
                        <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                            <td><g:link action="show" id="${r309Instance.id}">${fieldValue(bean: r309Instance, field: "weekNo")}</g:link></td>

                            <td><g:formatDate date="${r309Instance.dateFrom}" /></td>

                            <td><g:formatDate date="${r309Instance.dateTo}" /></td>

                            <td>${fieldValue(bean: r309Instance, field: "lokal.lokal")}</td>

                            <td>${fieldValue(bean: r309Instance, field: "teacher.name")}</td>


                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>

			<div class="pagination">
				<g:paginate total="${r309InstanceTotal}" />
			</div>
		</div>
	</body>
</html>
