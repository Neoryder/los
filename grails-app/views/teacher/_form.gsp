<%@ page import="los.Teacher" %>



<div class="fieldcontain ${hasErrors(bean: teacherInstance, field: 'assignedNumber', 'error')} ">
	<label for="assignedNumber">
		<g:message code="teacher.assignedNumber.label" default="Assigned Number" />
		
	</label>
	<g:textField name="assignedNumber" value="${teacherInstance?.assignedNumber}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: teacherInstance, field: 'name', 'error')} ">
	<label for="name">
		<g:message code="teacher.name.label" default="Name" />
		
	</label>
	<g:textField name="name" value="${teacherInstance?.name}"/>
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
	<g:select name="status" from="${teacherInstance.constraints.status.inList}" value="${teacherInstance?.status}" valueMessagePrefix="teacher.status" noSelection="['': 'Please Choose Status']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: teacherInstance, field: 'lokal', 'error')} ">
	<label for="lokal">
		<g:message code="teacher.lokal.label" default="Lokal" />
		
	</label>
	<g:select id="lokal" name="lokal.id" from="${los.Lokal.list()}" optionKey="id" optionValue="lokal" noSelection="${[null:'Please Choose a lokal']}"  value="${teacherInstance?.lokal?.id}" class="many-to-one" />
</div>

