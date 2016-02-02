<%@ page import="los.reports.R305" %>



<div class="fieldcontain ${hasErrors(bean: r305Instance, field: 'dateFrom', 'error')} required">
	<label for="dateFrom">
		<g:message code="r305.dateFrom.label" default="Date From" />
		<span class="required-indicator">*</span>
	</label>
	%{--<g:datePicker name="dateFrom" precision="day"  value="${r305Instance?.dateFrom}"  />--}%
    <g:textField name="dateFrom" value="${formatDate(date:r305Instance?.dateFrom,format: 'MM/dd/yyyy')}"
                 class="form-control input-sm" placeholder="MM/DD/YYYY"/>
</div>

%{--<div class="fieldcontain ${hasErrors(bean: r305Instance, field: 'dateTo', 'error')} required">--}%
	%{--<label for="dateTo">--}%
		%{--<g:message code="r305.dateTo.label" default="Date To" />--}%
		%{--<span class="required-indicator">*</span>--}%
	%{--</label>--}%
	%{--<g:datePicker name="dateTo" precision="day"  value="${r305Instance?.dateTo}"  />--}%
%{--</div>--}%

<div class="fieldcontain ${hasErrors(bean: r305Instance, field: 'entry', 'error')} ">
	<label for="entry">
		<g:message code="r305.entry.label" default="Entry" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${r305Instance?.entry?}" var="e">
    <li><g:link controller="r305Entry" action="show" id="${e.id}">${e?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="r305Entry" action="create" params="['r305.id': r305Instance?.id]">${message(code: 'default.add.label', args: [message(code: 'r305Entry.label', default: 'R305Entry')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: r305Instance, field: 'lokal', 'error')} required">
	<label for="lokal">
		<g:message code="r305.lokal.label" default="Lokal" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="lokal" name="lokal.id" from="${los.Lokal.list()}" optionKey="id" optionValue="lokal" noSelection="${[null:'Please Choose a lokal']}"  required="" value="${r305Instance?.lokal?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: r305Instance, field: 'teacher', 'error')} required">
	<label for="teacher">
		<g:message code="r305.teacher.label" default="Teacher" />
		<span class="required-indicator">*</span>
	</label>
	%{--<g:select id="teacher" name="teacher.id" from="${los.Teacher.list()}" optionKey="id"  optionValue="assignedNumber" noSelection="${[null:'Please Choose a assigned number']}" required="" value="${r305Instance?.teacher?.id}" class="many-to-one"/>--}%

    <select id="teacher" class="select2_dropdown bigdrop" >
        <option value="${r305Instance?.teacher?.assignedNumber}" selected="selected"  >${r305Instance?.teacher?.name+'|'+r305Instance?.teacher?.assignedNumber}</option>
    </select>
    <g:hiddenField name="teacher.id" id="teacherId" value="${r305Instance?.teacher?.id}" ></g:hiddenField>
</div>

<div class="fieldcontain ${hasErrors(bean: r305Instance, field: 'weekNo', 'error')} required">
	<label for="weekNo">
		<g:message code="r305.weekNo.label" default="Week No" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="weekNo" type="number" value="${r305Instance.weekNo}" required=""/>
</div>

