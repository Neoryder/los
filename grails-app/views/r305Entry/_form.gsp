<%@ page import="los.reports.R305Entry" %>





<div class="fieldcontain ${hasErrors(bean: r305EntryInstance, field: 'r305', 'error')} required">
	<label for="r305">
		<g:message code="r305Entry.r305.label" default="R305" />
		<span class="required-indicator">*</span>
	</label>
	%{--<g:select id="r305" name="r305.id" from="${los.reports.R305.list()}" optionKey="id" required="" value="${r305EntryInstance?.r305?.id}" class="many-to-one"/>--}%
    <select id="r305" class="select2_dropdown bigdrop" style="width: 800px" >
        <option value="${r305EntryInstance?.r305?.id}" selected="selected"  >${r305EntryInstance?.r305?.dateFrom?.format("MM/dd/yyyy")+'|'+r305EntryInstance?.r305?.dateTo?.format("MM/dd/yyyy")+'|'+r305EntryInstance?.r305?.lokal?.lokal+'|'+r305EntryInstance?.r305?.teacher?.name}</option>
    </select>
    <g:hiddenField name="r305.id" id="r305Id" value="${r305EntryInstance?.r305?.id}" ></g:hiddenField>
</div>


<div class="fieldcontain ${hasErrors(bean: r305EntryInstance, field: 'student', 'error')} required">
    <label for="student">
        <g:message code="r305Entry.student.label" default="Student" />
        <span class="required-indicator">*</span>
    </label>
    %{--<g:select id="student" name="student.id" from="${los.Student.list()}" optionKey="id" required="" value="${r305EntryInstance?.student?.id}" class="many-to-one"/>--}%
    <select id="student" class="select2_dropdown bigdrop" style="width: 600px" >
        <option value="${r305EntryInstance?.student?.referenceNumber01}" selected="selected"  >${r305EntryInstance?.student?.referenceNumber01+'|'+r305EntryInstance?.student?.lastName + (r305EntryInstance?.student?.husbandsLastName?' - ' + r305EntryInstance.student.husbandsLastName:'') +', '+r305EntryInstance?.student?.firstName+' '+r305EntryInstance?.student?.middleName}</option>
    </select>
    <g:hiddenField name="student.id" id="studentId" value="${r305EntryInstance?.student?.id}" ></g:hiddenField>
</div>
