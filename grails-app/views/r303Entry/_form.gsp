<%@ page import="los.reports.R303Entry" %>


<div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'r303', 'error')} required">
    <label for="r303">
        <g:message code="r303Entry.r303.label" default="R303" />
        <span class="required-indicator">*</span>
    </label>
    %{--<g:select id="r303" name="r303.id" from="${los.reports.R303.list()}" optionKey="id" required="" value="${r303EntryInstance?.r303?.id}" class="many-to-one"/>--}%
    <select id="r303" class="select2_dropdown bigdrop" style="width: 800px" >
        <option value="${r303EntryInstance?.r303?.id}" selected="selected"  >${r303EntryInstance?.r303?.dateFrom?.format("MM/dd/yyyy")+'|'+r303EntryInstance?.r303?.dateTo?.format("MM/dd/yyyy")+'|'+r303EntryInstance?.r303?.lokal?.lokal+'|'+r303EntryInstance?.r303?.teacher?.name}</option>
    </select>
    <g:hiddenField name="r303.id" id="r303Id" value="${r303EntryInstance?.r303?.id}" ></g:hiddenField>

</div>

<div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'student', 'error')} required">
    <label for="student">
        <g:message code="r303Entry.student.label" default="Student" />
        <span class="required-indicator">*</span>
    </label>
    <select id="student" class="select2_dropdown bigdrop" style="width: 600px" >
        <option value="${r303EntryInstance?.student?.referenceNumber01}" selected="selected"  >${r303EntryInstance?.student?.referenceNumber01+'|'+r303EntryInstance?.student?.lastName + (r303EntryInstance?.student?.husbandsLastName?' - ' + r303EntryInstance.student.husbandsLastName:'') +', '+r303EntryInstance?.student?.firstName+' '+r303EntryInstance?.student?.middleName}</option>
    </select>
    <g:hiddenField name="student.id" id="studentId" value="${r303EntryInstance?.student?.id}" ></g:hiddenField>
</div>

<div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonMon', 'error')} required">
	<label for="lessonMon">
		<g:message code="r303Entry.lessonMon.label" default="Lesson Mon" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="lessonMon" type="number" value="${r303EntryInstance.lessonMon}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonTue', 'error')} required">
    <label for="lessonTue">
        <g:message code="r303Entry.lessonTue.label" default="Lesson Tue" />
        <span class="required-indicator">*</span>
    </label>
    <g:field name="lessonTue" type="number" value="${r303EntryInstance.lessonTue}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonWed', 'error')} required">
    <label for="lessonWed">
        <g:message code="r303Entry.lessonWed.label" default="Lesson Wed" />
        <span class="required-indicator">*</span>
    </label>
    <g:field name="lessonWed" type="number" value="${r303EntryInstance.lessonWed}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonThu', 'error')} required">
    <label for="lessonThu">
        <g:message code="r303Entry.lessonThu.label" default="Lesson Thu" />
        <span class="required-indicator">*</span>
    </label>
    <g:field name="lessonThu" type="number" value="${r303EntryInstance.lessonThu}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonFri', 'error')} required">
    <label for="lessonFri">
        <g:message code="r303Entry.lessonFri.label" default="Lesson Fri" />
        <span class="required-indicator">*</span>
    </label>
    <g:field name="lessonFri" type="number" value="${r303EntryInstance.lessonFri}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonSat', 'error')} required">
	<label for="lessonSat">
		<g:message code="r303Entry.lessonSat.label" default="Lesson Sat" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="lessonSat" type="number" value="${r303EntryInstance.lessonSat}" required=""/>
</div>

<div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonSun', 'error')} required">
	<label for="lessonSun">
		<g:message code="r303Entry.lessonSun.label" default="Lesson Sun" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="lessonSun" type="number" value="${r303EntryInstance.lessonSun}" required=""/>
</div>


