<%@ page import="los.reports.R309" %>



<div class="fieldcontain ${hasErrors(bean: r309Instance, field: 'dateFrom', 'error')} required">
	<label for="dateFrom">
		<g:message code="r309.dateFrom.label" default="Date From" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dateFrom" precision="day"  value="${r309Instance?.dateFrom}"  />
</div>

%{--<div class="fieldcontain ${hasErrors(bean: r309Instance, field: 'dateTo', 'error')} required">--}%
	%{--<label for="dateTo">--}%
		%{--<g:message code="r309.dateTo.label" default="Date To" />--}%
		%{--<span class="required-indicator">*</span>--}%
	%{--</label>--}%
	%{--<g:datePicker name="dateTo" precision="day"  value="${r309Instance?.dateTo}"  />--}%
%{--</div>--}%

<div class="fieldcontain ${hasErrors(bean: r309Instance, field: 'entry', 'error')} ">
	<label for="entry">
		<g:message code="r309.entry.label" default="Entry" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${r309Instance?.entry?}" var="e">
    <li><g:link controller="r309Entry" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="r309Entry" action="create" params="['r309.id': r309Instance?.id]">${message(code: 'default.add.label', args: [message(code: 'r309Entry.label', default: 'R309Entry')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: r309Instance, field: 'lokal', 'error')} required">
	<label for="lokal">
		<g:message code="r309.lokal.label" default="Lokal" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="lokal" name="lokal.id" from="${los.Lokal.list()}"  optionKey="id" optionValue="lokal" noSelection="${[null:'Please Choose a lokal']}" required="" value="${r309Instance?.lokal?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: r309Instance, field: 'teacher', 'error')} required">
	<label for="teacher">
		<g:message code="r309.teacher.label" default="Teacher" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="teacher" name="teacher.id" from="${los.Teacher.list()}" optionKey="id" optionValue="assignedNumber" noSelection="${[null:'Please Choose a assigned number']}" required="" value="${r309Instance?.teacher?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: r309Instance, field: 'weekNo', 'error')} required">
	<label for="weekNo">
		<g:message code="r309.weekNo.label" default="Week No" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="weekNo" type="number" value="${r309Instance.weekNo}" required=""/>
</div>

