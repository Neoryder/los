<%@ page import="los.reports.R304" %>



<div class="fieldcontain ${hasErrors(bean: r304Instance, field: 'dateFrom', 'error')} required">
	<label for="dateFrom">
		<g:message code="r304.dateFrom.label" default="Date From" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dateFrom" precision="day"  value="${r304Instance?.dateFrom}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: r304Instance, field: 'dateTo', 'error')} required">
	<label for="dateTo">
		<g:message code="r304.dateTo.label" default="Date To" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dateTo" precision="day"  value="${r304Instance?.dateTo}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: r304Instance, field: 'entry', 'error')} ">
	<label for="entry">
		<g:message code="r304.entry.label" default="Entry" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${r304Instance?.entry?}" var="e">
    <li><g:link controller="r304Entry" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="r304Entry" action="create" params="['r304.id': r304Instance?.id]">${message(code: 'default.add.label', args: [message(code: 'r304Entry.label', default: 'R304Entry')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: r304Instance, field: 'lokal', 'error')} required">
	<label for="lokal">
		<g:message code="r304.lokal.label" default="Lokal" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="lokal" name="lokal.id" from="${los.Lokal.list()}" optionKey="id" required="" value="${r304Instance?.lokal?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: r304Instance, field: 'teacher', 'error')} required">
	<label for="teacher">
		<g:message code="r304.teacher.label" default="Teacher" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="teacher" name="teacher.id" from="${los.Teacher.list()}" optionKey="id" required="" value="${r304Instance?.teacher?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: r304Instance, field: 'weekNo', 'error')} required">
	<label for="weekNo">
		<g:message code="r304.weekNo.label" default="Week No" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="weekNo" type="number" value="${r304Instance.weekNo}" required=""/>
</div>

