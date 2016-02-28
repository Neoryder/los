<%@ page import="los.Distrito" %>


<div class="fieldcontain ${hasErrors(bean: distritoInstance, field: 'distrito', 'error')} ">
	<label for="distrito">
		<g:message code="distrito.distrito.label" default="Distrito" />
		
	</label>
	<g:textField name="distrito" maxlength="200" value="${distritoInstance?.distrito}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: distritoInstance, field: 'dcode', 'error')} ">
	<label for="dcode">
		<g:message code="distrito.dcode.label" default="Dcode" />
		
	</label>
	<g:textField name="dcode" maxlength="5" value="${distritoInstance?.dcode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: distritoInstance, field: 'lokal', 'error')} ">
	<label for="lokal">
		<g:message code="distrito.lokal.label" default="Lokal" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${distritoInstance?.lokal?.sort { it.id }}" var="l">
    <li><g:link controller="lokal" action="show" id="${l.id}">${l?.lokal?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="lokal" action="create" params="['distrito.id': distritoInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'lokal.label', default: 'Lokal')])}</g:link>
</li>
</ul>

</div>

