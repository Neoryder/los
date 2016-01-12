<%@ page import="los.Teacher" %>



<div class="fieldcontain ${hasErrors(bean: teacherInstance, field: 'assignedNumber', 'error')} ">
	<label for="assignedNumber">
		<g:message code="teacher.assignedNumber.label" default="Assigned Number" />
		
	</label>
	<g:textField name="assignedNumber" value="${teacherInstance?.assignedNumber}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: teacherInstance, field: 'firstName', 'error')} ">
	<label for="firstName">
		<g:message code="teacher.firstName.label" default="First Name" />
		
	</label>
	<g:textField name="firstName" value="${teacherInstance?.firstName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: teacherInstance, field: 'middleName', 'error')} ">
	<label for="middleName">
		<g:message code="teacher.middleName.label" default="Middle Name" />
		
	</label>
	<g:textField name="middleName" value="${teacherInstance?.middleName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: teacherInstance, field: 'lastName', 'error')} ">
	<label for="lastName">
		<g:message code="teacher.lastName.label" default="Last Name" />
		
	</label>
	<g:textField name="lastName" value="${teacherInstance?.lastName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: teacherInstance, field: 'type', 'error')} ">
	<label for="type">
		<g:message code="teacher.type.label" default="Type" />
		
	</label>
	<g:textField name="type" value="${teacherInstance?.type}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: teacherInstance, field: 'status', 'error')} ">
	<label for="status">
		<g:message code="teacher.status.label" default="Status" />
		
	</label>
	<g:select name="status" from="${teacherInstance.constraints.status.inList}" value="${teacherInstance?.status}" valueMessagePrefix="teacher.status" noSelection="['': '']"/>
</div>

