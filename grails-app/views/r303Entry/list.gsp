
<%@ page import="los.reports.R303Entry" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'r303Entry.label', default: 'R303Entry')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-r303Entry" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-r303Entry" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
				<thead>
					<tr>
					
						<g:sortableColumn property="lessonFri" title="${message(code: 'r303Entry.lessonFri.label', default: 'Lesson Fri')}" />
					
						<g:sortableColumn property="lessonMon" title="${message(code: 'r303Entry.lessonMon.label', default: 'Lesson Mon')}" />
					
						<g:sortableColumn property="lessonSat" title="${message(code: 'r303Entry.lessonSat.label', default: 'Lesson Sat')}" />
					
						<g:sortableColumn property="lessonSun" title="${message(code: 'r303Entry.lessonSun.label', default: 'Lesson Sun')}" />
					
						<g:sortableColumn property="lessonThu" title="${message(code: 'r303Entry.lessonThu.label', default: 'Lesson Thu')}" />
					
						<g:sortableColumn property="lessonTue" title="${message(code: 'r303Entry.lessonTue.label', default: 'Lesson Tue')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${r303EntryInstanceList}" status="i" var="r303EntryInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${r303EntryInstance.id}">${fieldValue(bean: r303EntryInstance, field: "lessonFri")}</g:link></td>
					
						<td>${fieldValue(bean: r303EntryInstance, field: "lessonMon")}</td>
					
						<td>${fieldValue(bean: r303EntryInstance, field: "lessonSat")}</td>
					
						<td>${fieldValue(bean: r303EntryInstance, field: "lessonSun")}</td>
					
						<td>${fieldValue(bean: r303EntryInstance, field: "lessonThu")}</td>
					
						<td>${fieldValue(bean: r303EntryInstance, field: "lessonTue")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${r303EntryInstanceTotal}" />
			</div>
		</div>
	</body>
</html>
