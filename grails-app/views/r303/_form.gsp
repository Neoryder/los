<%@ page import="los.reports.R303" %>



<div class="fieldcontain ${hasErrors(bean: r303Instance, field: 'dateFrom', 'error')} required">
	<label for="dateFrom">
		<g:message code="r303.dateFrom.label" default="Date From" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dateFrom" precision="day"  value="${r303Instance?.dateFrom}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: r303Instance, field: 'dateTo', 'error')} required">
	<label for="dateTo">
		<g:message code="r303.dateTo.label" default="Date To" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dateTo" precision="day"  value="${r303Instance?.dateTo}"  />
</div>

<div class="fieldcontain ${hasErrors(bean: r303Instance, field: 'entry', 'error')} ">
	<label for="entry">
		<g:message code="r303.entry.label" default="Entry" />
		
	</label>
	<g:select name="entry" from="${los.reports.R303Entry.list()}" multiple="multiple" optionKey="id" size="5" value="${r303Instance?.entry*.id}" class="many-to-many"/>
</div>

<div class="fieldcontain ${hasErrors(bean: r303Instance, field: 'lokal', 'error')} required">
	<label for="lokal">
		<g:message code="r303.lokal.label" default="Lokal" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="lokal" name="lokal.id" from="${los.Lokal.list()}" optionKey="id" required="" value="${r303Instance?.lokal?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: r303Instance, field: 'teacher', 'error')} required">
	<label for="teacher">
		<g:message code="r303.teacher.label" default="Teacher" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="teacher" name="teacher.id" from="${los.Teacher.list()}" optionKey="id" required="" value="${r303Instance?.teacher?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: r303Instance, field: 'weekNo', 'error')} required">
	<label for="weekNo">
		<g:message code="r303.weekNo.label" default="Week No" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="weekNo" type="number" value="${r303Instance.weekNo}" required=""/>
</div>

