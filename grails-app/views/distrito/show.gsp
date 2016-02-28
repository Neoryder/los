
<%@ page import="los.Distrito" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'distrito.label', default: 'Distrito')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>
        <r:require modules="bootstrap"/>
	</head>
	<body>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-distrito" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ul class="property-list distrito">
			
				<g:if test="${distritoInstance?.distrito}">
				<li class="fieldcontain">
					<span id="distrito-label" class="property-label"><g:message code="distrito.distrito.label" default="Distrito" /></span>
					
						<span class="property-value" aria-labelledby="distrito-label"><g:fieldValue bean="${distritoInstance}" field="distrito"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${distritoInstance?.dcode}">
				<li class="fieldcontain">
					<span id="dcode-label" class="property-label"><g:message code="distrito.dcode.label" default="Dcode" /></span>
					
						<span class="property-value" aria-labelledby="dcode-label"><g:fieldValue bean="${distritoInstance}" field="dcode"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${distritoInstance?.lokal}">
				<li class="fieldcontain">
					<span id="lokal-label" class="property-label"><g:message code="distrito.lokal.label" default="Lokal" /></span>
					    <ul>

                            <g:each in="${distritoInstance.lokal.sort { it.id }}" var="l">
                                <li><span class="property-value" aria-labelledby="lokal-label"><g:link controller="lokal" action="show" id="${l.id}">${l?.lokal?.encodeAsHTML()}</g:link></span></li>
                            </g:each>
                        </ul>
					
				</li>
				</g:if>
			
			</ul>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${distritoInstance?.id}" />
					<g:link class="edit" action="edit" id="${distritoInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
