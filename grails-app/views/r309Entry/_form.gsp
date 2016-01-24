<%@ page import="los.reports.R309Entry" %>



<div class="fieldcontain ${hasErrors(bean: r309EntryInstance, field: 'student', 'error')} required">
	<label for="student">
		<g:message code="r309Entry.student.label" default="Student" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="student" name="student.id" from="${los.Student.list()}" optionKey="id" required="" value="${r309EntryInstance?.student?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: r309EntryInstance, field: 'r309', 'error')} required">
	<label for="r309">
		<g:message code="r309Entry.r309.label" default="R309" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="r309" name="r309.id" from="${los.reports.R309.list()}" optionKey="id" required="" value="${r309EntryInstance?.r309?.id}" class="many-to-one"/>
</div>

