<%@ page import="los.reports.R303" %>


<div class="fieldcontain ${hasErrors(bean: r303Instance, field: 'dateFrom', 'error')} required">
	<label for="dateFrom">
		<g:message code="r303.dateFrom.label" default="Date From" />
		<span class="required-indicator">*</span>
	</label>
    <g:textField name="dateFrom" value="${formatDate(date:r303Instance?.dateFrom,format: 'MM/dd/yyyy')}"
                 class="form-control input-sm" placeholder="MM/DD/YYYY"/>
	%{--<g:datePicker name="dateFrom" precision="day"  value="${r303Instance?.dateFrom}"  />--}%
</div>

%{--<div class="fieldcontain ${hasErrors(bean: r303Instance, field: 'dateTo', 'error')} required">--}%
	%{--<label for="dateTo">--}%
		%{--<g:message code="r303.dateTo.label" default="Date To" />--}%
		%{--<span class="required-indicator">*</span>--}%
	%{--</label>--}%
	%{--<g:datePicker name="dateTo" precision="day"  value="${r303Instance?.dateTo}"  />--}%
%{--</div>--}%

<div class="fieldcontain ${hasErrors(bean: r303Instance, field: 'entry', 'error')} ">
	<label for="entry">
		<g:message code="r303.entry.label" default="Entry" />
	</label>
	
<ul class="one-to-many">
<g:each in="${r303Instance?.entry?}" var="e">
    <li><g:link controller="r303Entry" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="r303Entry" action="create" params="['r303.id': r303Instance?.id]">${message(code: 'default.add.label', args: [message(code: 'r303Entry.label', default: 'R303Entry')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: r303Instance, field: 'lokal', 'error')} required">
	<label for="lokal">
		<g:message code="r303.lokal.label" default="Lokal" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="lokal" name="lokal.id" from="${los.Lokal.list()}" optionKey="id" optionValue="lokal" noSelection="${[null:'Please Choose a lokal']}"  required="" value="${r303Instance?.lokal?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: r303Instance, field: 'teacher', 'error')} required">
	<label for="teacher">
		<g:message code="r303.teacher.label" default="Teacher" />
		<span class="required-indicator">*</span>
	</label>
	%{--<g:select id="teacher" name="teacher.id" from="${los.Teacher.list()}" optionKey="id"  optionValue="assignedNumber" noSelection="${[null:'Please Choose a assigned number']}" required="" value="${r303Instance?.teacher?.id}" class="many-to-one"/>--}%

    <select id="teacher" class="select2_dropdown bigdrop" >
        <option value="${r303Instance?.teacher?.assignedNumber}" selected="selected"  >${r303Instance?.teacher}</option>
    </select>
    <g:hiddenField name="teacher.id" id="teacherId" value="${r303Instance?.teacher?.id}" ></g:hiddenField>
</div>

<div class="fieldcontain ${hasErrors(bean: r303Instance, field: 'weekNo', 'error')} required">
	<label for="weekNo">
		<g:message code="r303.weekNo.label" default="Week No" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="weekNo" type="number" value="${r303Instance.weekNo}" required=""/>
</div>

