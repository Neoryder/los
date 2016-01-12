<%@ page import="los.WorshipServiceAttendance" %>



<div class="fieldcontain ${hasErrors(bean: worshipServiceAttendanceInstance, field: 'dateOfAttendance', 'error')} required">
	<label for="dateOfAttendance">
		<g:message code="worshipServiceAttendance.dateOfAttendance.label" default="Date Of Attendance" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="dateOfAttendance" precision="day"  value="${worshipServiceAttendanceInstance?.dateOfAttendance}"  />
</div>

%{--<div class="fieldcontain ${hasErrors(bean: worshipServiceAttendanceInstance, field: 'type', 'error')} ">--}%
	%{--<label for="type">--}%
		%{--<g:message code="worshipServiceAttendance.type.label" default="Type" />--}%
		%{----}%
	%{--</label>--}%
	%{--<g:textField name="type" value="${worshipServiceAttendanceInstance?.type}"/>--}%
%{--</div>--}%

%{--<div class="fieldcontain ${hasErrors(bean: worshipServiceAttendanceInstance, field: 'status', 'error')} ">--}%
	%{--<label for="status">--}%
		%{--<g:message code="worshipServiceAttendance.status.label" default="Status" />--}%
		%{----}%
	%{--</label>--}%
	%{--<g:select name="status" from="${worshipServiceAttendanceInstance.constraints.status.inList}" value="${worshipServiceAttendanceInstance?.status}" valueMessagePrefix="worshipServiceAttendance.status" noSelection="['': '']"/>--}%
%{--</div>--}%

<div class="fieldcontain ${hasErrors(bean: worshipServiceAttendanceInstance, field: 'lokal', 'error')} required">
	<label for="lokal">
		<g:message code="worshipServiceAttendance.lokal.label" default="Lokal" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="lokal" name="lokal.id" from="${los.Lokal.list()}" optionKey="id" required="" optionValue="lokal" value="${worshipServiceAttendanceInstance?.lokal?.id}" class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: worshipServiceAttendanceInstance, field: 'student', 'error')} required">
	<label for="student">
		<g:message code="worshipServiceAttendance.student.label" default="Student" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="student" name="student.id" from="${los.Student.list()}" optionKey="id" optionValue="referenceNumber01" required="" value="${worshipServiceAttendanceInstance?.student?.id}" class="many-to-one"/>
</div>

