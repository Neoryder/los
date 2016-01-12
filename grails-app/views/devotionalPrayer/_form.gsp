<%@ page import="los.DevotionalPrayer" %>



<div class="fieldcontain ${hasErrors(bean: devotionalPrayerInstance, field: 'dateOfAttendance', 'error')} required">
	<label for="dateOfAttendance">
		<g:message code="devotionalPrayer.dateOfAttendance.label" default="Date Of Attendance" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dateOfAttendance" precision="day"  value="${devotionalPrayerInstance?.dateOfAttendance}"  />
</div>

%{--<div class="fieldcontain ${hasErrors(bean: devotionalPrayerInstance, field: 'type', 'error')} ">--}%
	%{--<label for="type">--}%
		%{--<g:message code="devotionalPrayer.type.label" default="Type" />--}%
		%{----}%
	%{--</label>--}%
	%{--<g:textField name="type" value="${devotionalPrayerInstance?.type}"/>--}%
%{--</div>--}%

%{--<div class="fieldcontain ${hasErrors(bean: devotionalPrayerInstance, field: 'status', 'error')} ">--}%
	%{--<label for="status">--}%
		%{--<g:message code="devotionalPrayer.status.label" default="Status" />--}%
		%{----}%
	%{--</label>--}%
	%{--<g:select name="status" from="${devotionalPrayerInstance.constraints.status.inList}" value="${devotionalPrayerInstance?.status}" valueMessagePrefix="devotionalPrayer.status" noSelection="['': '']"/>--}%
%{--</div>--}%

<div class="fieldcontain ${hasErrors(bean: devotionalPrayerInstance, field: 'student', 'error')} required">
	<label for="student">
		<g:message code="devotionalPrayer.student.label" default="Student" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="student" name="student.id" from="${los.Student.list()}" optionKey="id" optionValue="referenceNumber01" required="" value="${devotionalPrayerInstance?.student?.id}" class="many-to-one"/>
</div>

