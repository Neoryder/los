<%@ page import="los.reports.R304Entry" %>



<div class="fieldcontain ${hasErrors(bean: r304EntryInstance, field: 'student', 'error')} required">
	<label for="student">
		<g:message code="r304Entry.student.label" default="Student" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="student" name="student.id" from="${los.Student.list()}" optionKey="id" required="" value="${r304EntryInstance?.student?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: r304EntryInstance, field: 'r304', 'error')} required">
	<label for="r304">
		<g:message code="r304Entry.r304.label" default="R304" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="r304" name="r304.id" from="${los.reports.R304.list()}" optionKey="id" required="" value="${r304EntryInstance?.r304?.id}" class="many-to-one"/>
</div>

