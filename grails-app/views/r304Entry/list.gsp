
<%@ page import="los.reports.R304Entry" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r304Entry.label', default: 'R304Entry')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>
        <r:require modules="bootstrap"/>
	</head>
	<body>
		<a href="#list-r304Entry" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-r304Entry" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>

            <div class="table-responsive">
                <table class="table table-striped table-bordered table-condensed">
                    <thead>
                    <tr>

                        <th><g:message code="r304Entry.student.label" default="Student" /></th>

                        <th><g:message code="r304Entry.r304.label" default="R304" /></th>

                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${r304EntryInstanceList}" status="i" var="r304EntryInstance">
                        <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                            <td><g:link action="show" id="${r304EntryInstance.id}">${fieldValue(bean: r304EntryInstance, field: "student")}</g:link></td>

                            <td>${fieldValue(bean: r304EntryInstance, field: "r304")}</td>

                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>

			<div class="pagination">
				<g:paginate total="${r304EntryInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
