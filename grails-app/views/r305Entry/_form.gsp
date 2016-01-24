<%@ page import="los.reports.R305Entry" %>



<div class="fieldcontain ${hasErrors(bean: r305EntryInstance, field: 'student', 'error')} required">
	<label for="student">
		<g:message code="r305Entry.student.label" default="Student" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="student" name="student.id" from="${los.Student.list()}" optionKey="id" required="" value="${r305EntryInstance?.student?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: r305EntryInstance, field: 'r305', 'error')} required">
	<label for="r305">
		<g:message code="r305Entry.r305.label" default="R305" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="r305" name="r305.id" from="${los.reports.R305.list()}" optionKey="id" required="" value="${r305EntryInstance?.r305?.id}" class="many-to-one"/>
</div>

