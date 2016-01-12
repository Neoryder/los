<%@ page import="los.Lokal" %>



<div class="fieldcontain ${hasErrors(bean: lokalInstance, field: 'lokal', 'error')} ">
	<label for="lokal">
		<g:message code="lokal.lokal.label" default="Lokal" />
		
	</label>
	<g:textField name="lokal" maxlength="200" value="${lokalInstance?.lokal}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: lokalInstance, field: 'lcode', 'error')} ">
	<label for="lcode">
		<g:message code="lokal.lcode.label" default="Lcode" />
		
	</label>
	<g:textField name="lcode" maxlength="3" value="${lokalInstance?.lcode}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: lokalInstance, field: 'distrito', 'error')} required">
	<label for="distrito">
		<g:message code="lokal.distrito.label" default="Distrito" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="distrito" name="distrito.id" from="${los.Distrito.list()}" optionKey="id" required="" value="${lokalInstance?.distrito?.id}" class="many-to-one"/>
</div>

