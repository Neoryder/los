
<%@ page import="los.Lokal" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'lokal.label', default: 'Lokal')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>
        <r:require modules="bootstrap"/>
	</head>
	<body>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
                <li><g:link class="create" action="create" controller="student">Create Student</g:link></li>
			</ul>
		</div>
		<div id="list-lokal" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>


            <div class="table-responsive">
                <table class="table table-striped table-bordered table-condensed">
                    <thead>
                    <tr>

                        <g:sortableColumn property="lokal" title="${message(code: 'lokal.lokal.label', default: 'Lokal')}" />

                    </tr>
                    </thead>
                    <tbody>
                    <g:each in="${lokalInstanceList}" status="i" var="lokalInstance">
                        <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                            <td><g:link action="listByLokal" id="${lokalInstance.id}">${fieldValue(bean: lokalInstance, field: "lokal")}</g:link></td>


                        </tr>
                    </g:each>
                    </tbody>
                </table>
            </div>

			<div class="pagination">
				<g:paginate total="${lokalInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
