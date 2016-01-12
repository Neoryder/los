
<%@ page import="los.Lokal" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'lokal.label', default: 'Lokal')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-lokal" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-lokal" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list lokal">
			
				<g:if test="${lokalInstance?.lokal}">
				<li class="fieldcontain">
					<span id="lokal-label" class="property-label"><g:message code="lokal.lokal.label" default="Lokal" /></span>
					
						<span class="property-value" aria-labelledby="lokal-label"><g:fieldValue bean="${lokalInstance}" field="lokal"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${lokalInstance?.lcode}">
				<li class="fieldcontain">
					<span id="lcode-label" class="property-label"><g:message code="lokal.lcode.label" default="Lcode" /></span>
					
						<span class="property-value" aria-labelledby="lcode-label"><g:fieldValue bean="${lokalInstance}" field="lcode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${lokalInstance?.distrito}">
				<li class="fieldcontain">
					<span id="distrito-label" class="property-label"><g:message code="lokal.distrito.label" default="Distrito" /></span>
					
						<span class="property-value" aria-labelledby="distrito-label"><g:link controller="distrito" action="show" id="${lokalInstance?.distrito?.id}">${lokalInstance?.distrito?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${lokalInstance?.id}" />
					<g:link class="edit" action="edit" id="${lokalInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
