<%@ page import="los.Student" %>



<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'firstName', 'error')} required">
	<label for="firstName">
		<g:message code="student.firstName.label" default="First Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="firstName" maxlength="100" required="" value="${studentInstance?.firstName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'middleName', 'error')} required">
	<label for="middleName">
		<g:message code="student.middleName.label" default="Middle Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="middleName" maxlength="100" required="" value="${studentInstance?.middleName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lastName', 'error')} required">
	<label for="lastName">
		<g:message code="student.lastName.label" default="Last Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastName" maxlength="100" required="" value="${studentInstance?.lastName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'husbandsLastName', 'error')} ">
	<label for="husbandsLastName">
		<g:message code="student.husbandsLastName.label" default="Husbands Last Name" />
		
	</label>
	<g:textField name="husbandsLastName" maxlength="100" value="${studentInstance?.husbandsLastName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'spouseName', 'error')} ">
	<label for="spouseName">
		<g:message code="student.spouseName.label" default="Spouse Name" />
		
	</label>
	<g:textField name="spouseName" maxlength="100" value="${studentInstance?.spouseName}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lokal', 'error')} required">
	<label for="lokal">
		<g:message code="student.lokal.label" default="Lokal" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="lokal" name="lokal.id" noSelection="${['null':'Select One...']}" from="${los.Lokal.list()}" optionKey="id" optionValue="lokal" required="" value="${studentInstance?.lokal?.id}"  class="many-to-one"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'birthCertificateRegistrationNumber', 'error')} ">
	<label for="birthCertificateRegistrationNumber">
		<g:message code="student.birthCertificateRegistrationNumber.label" default="Birth Certificate Registration Number" />
		
	</label>
	<g:textField name="birthCertificateRegistrationNumber" value="${studentInstance?.birthCertificateRegistrationNumber}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'marriageContractCertificateRegistrationNumber', 'error')} ">
	<label for="marriageContractCertificateRegistrationNumber">
		<g:message code="student.marriageContractCertificateRegistrationNumber.label" default="Marriage Contract Certificate Registration Number" />
		
	</label>
	<g:textField name="marriageContractCertificateRegistrationNumber" value="${studentInstance?.marriageContractCertificateRegistrationNumber}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'cenomarNumber', 'error')} ">
	<label for="cenomarNumber">
		<g:message code="student.cenomarNumber.label" default="Cenomar Number" />
		
	</label>
	<g:textField name="cenomarNumber" value="${studentInstance?.cenomarNumber}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'birthDate', 'error')} required">
	<label for="birthDate">
		<g:message code="student.birthDate.label" default="Birth Date" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="birthDate" precision="day"  value="${studentInstance?.birthDate}"  />
    %{--<div id="birthDatePicker"   value="${studentInstance?.birthDate}" ></div>--}%
    %{--<input type="hidden"  id="birthDate" name="birthDate"   value="${studentInstance?.birthDate}" >--}%
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'startDate', 'error')} ">
	<label for="startDate">
		<g:message code="student.startDate.label" default="Start Date" />
		
	</label>
	<g:datePicker name="startDate" precision="day"  value="${studentInstance?.startDate}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'gender', 'error')} ">
	<label for="gender">
		<g:message code="student.gender.label" default="Gender" />
		
	</label>
	<g:select name="gender" from="${studentInstance.constraints.gender.inList}" value="${studentInstance?.gender}" valueMessagePrefix="student.gender" noSelection="['': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentType', 'error')} ">
	<label for="studentType">
		<g:message code="student.studentType.label" default="Student Type" />
		
	</label>
	<g:select name="studentType" from="${studentInstance.constraints.studentType.inList}" value="${studentInstance?.studentType}" valueMessagePrefix="student.studentType" noSelection="['': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'address', 'error')} required">
	<label for="address">
		<g:message code="student.address.label" default="Address" />
		<span class="required-indicator">*</span>
	</label>
	<g:textArea name="address" cols="40" rows="5" maxlength="500" required="" value="${studentInstance?.address}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'civilStatus', 'error')} required">
	<label for="civilStatus">
		<g:message code="student.civilStatus.label" default="Civil Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="civilStatus" noSelection="${['null':'Select One...']}" from="${studentInstance.constraints.civilStatus.inList}" required="" value="${studentInstance?.civilStatus}" valueMessagePrefix="student.civilStatus"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'nationality', 'error')} required">
	<label for="nationality">
		<g:message code="student.nationality.label" default="Nationality" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nationality" maxlength="100" required="" value="${studentInstance?.nationality}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'citizenship', 'error')} required">
	<label for="citizenship">
		<g:message code="student.citizenship.label" default="Citizenship" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="citizenship" maxlength="100" required="" value="${studentInstance?.citizenship}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'nagakay', 'error')} required">
	<label for="nagakay">
		<g:message code="student.nagakay.label" default="Nagakay" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nagakay" maxlength="200" required="" value="${studentInstance?.nagakay}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'nagakayAreaGroup', 'error')} required">
	<label for="nagakayAreaGroup">
		<g:message code="student.nagakayAreaGroup.label" default="Nagakay Area Group" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nagakayAreaGroup" maxlength="50" required="" value="${studentInstance?.nagakayAreaGroup}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'nagakayFamilyOrganization', 'error')} required">
	<label for="nagakayFamilyOrganization">
		<g:message code="student.nagakayFamilyOrganization.label" default="Nagakay Family Organization" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="nagakayFamilyOrganization" noSelection="${['null':'Select One...']}" from="${studentInstance.constraints.nagakayFamilyOrganization.inList}" required="" value="${studentInstance?.nagakayFamilyOrganization}" valueMessagePrefix="student.nagakayFamilyOrganization"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'referenceNumber01', 'error')} required">
	<label for="referenceNumber01">
		<g:message code="student.referenceNumber01.label" default="Reference Number01" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="referenceNumber01" required="" value="${studentInstance?.referenceNumber01}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'referenceNumber02', 'error')} ">
	<label for="referenceNumber02">
		<g:message code="student.referenceNumber02.label" default="Reference Number02" />
		
	</label>
	<g:textField name="referenceNumber02" value="${studentInstance?.referenceNumber02}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'referenceNumber03', 'error')} ">
	<label for="referenceNumber03">
		<g:message code="student.referenceNumber03.label" default="Reference Number03" />
		
	</label>
	<g:textField name="referenceNumber03" value="${studentInstance?.referenceNumber03}"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'teacher', 'error')} required">
	<label for="teacher">
		<g:message code="student.teacher.label" default="Teacher" />
		<span class="required-indicator">*</span>
	</label>
	<select id="teacher" class="select2_dropdown bigdrop" >
        <option value="${studentInstance?.teacher?.assignedNumber}" selected="selected"  >${studentInstance?.teacher?.name+'|'+studentInstance?.teacher?.assignedNumber}</option>
    </select>
    <g:hiddenField name="teacher.id" id="teacherId" value="${studentInstance?.teacher?.id}" ></g:hiddenField>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson01DateOfAttendance', 'error')} ">
	<label for="lesson01DateOfAttendance">
		<g:message code="student.lesson01DateOfAttendance.label" default="Lesson01 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson01DateOfAttendance" precision="day"  value="${studentInstance?.lesson01DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson02DateOfAttendance', 'error')} ">
	<label for="lesson02DateOfAttendance">
		<g:message code="student.lesson02DateOfAttendance.label" default="Lesson02 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson02DateOfAttendance" precision="day"  value="${studentInstance?.lesson02DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson03DateOfAttendance', 'error')} ">
	<label for="lesson03DateOfAttendance">
		<g:message code="student.lesson03DateOfAttendance.label" default="Lesson03 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson03DateOfAttendance" precision="day"  value="${studentInstance?.lesson03DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson04DateOfAttendance', 'error')} ">
	<label for="lesson04DateOfAttendance">
		<g:message code="student.lesson04DateOfAttendance.label" default="Lesson04 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson04DateOfAttendance" precision="day"  value="${studentInstance?.lesson04DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson05DateOfAttendance', 'error')} ">
	<label for="lesson05DateOfAttendance">
		<g:message code="student.lesson05DateOfAttendance.label" default="Lesson05 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson05DateOfAttendance" precision="day"  value="${studentInstance?.lesson05DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson06DateOfAttendance', 'error')} ">
	<label for="lesson06DateOfAttendance">
		<g:message code="student.lesson06DateOfAttendance.label" default="Lesson06 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson06DateOfAttendance" precision="day"  value="${studentInstance?.lesson06DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson07DateOfAttendance', 'error')} ">
	<label for="lesson07DateOfAttendance">
		<g:message code="student.lesson07DateOfAttendance.label" default="Lesson07 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson07DateOfAttendance" precision="day"  value="${studentInstance?.lesson07DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson08DateOfAttendance', 'error')} ">
	<label for="lesson08DateOfAttendance">
		<g:message code="student.lesson08DateOfAttendance.label" default="Lesson08 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson08DateOfAttendance" precision="day"  value="${studentInstance?.lesson08DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson09DateOfAttendance', 'error')} ">
	<label for="lesson09DateOfAttendance">
		<g:message code="student.lesson09DateOfAttendance.label" default="Lesson09 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson09DateOfAttendance" precision="day"  value="${studentInstance?.lesson09DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson10DateOfAttendance', 'error')} ">
	<label for="lesson10DateOfAttendance">
		<g:message code="student.lesson10DateOfAttendance.label" default="Lesson10 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson10DateOfAttendance" precision="day"  value="${studentInstance?.lesson10DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson11DateOfAttendance', 'error')} ">
	<label for="lesson11DateOfAttendance">
		<g:message code="student.lesson11DateOfAttendance.label" default="Lesson11 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson11DateOfAttendance" precision="day"  value="${studentInstance?.lesson11DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson12DateOfAttendance', 'error')} ">
	<label for="lesson12DateOfAttendance">
		<g:message code="student.lesson12DateOfAttendance.label" default="Lesson12 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson12DateOfAttendance" precision="day"  value="${studentInstance?.lesson12DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson13DateOfAttendance', 'error')} ">
	<label for="lesson13DateOfAttendance">
		<g:message code="student.lesson13DateOfAttendance.label" default="Lesson13 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson13DateOfAttendance" precision="day"  value="${studentInstance?.lesson13DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson14DateOfAttendance', 'error')} ">
	<label for="lesson14DateOfAttendance">
		<g:message code="student.lesson14DateOfAttendance.label" default="Lesson14 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson14DateOfAttendance" precision="day"  value="${studentInstance?.lesson14DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson15DateOfAttendance', 'error')} ">
	<label for="lesson15DateOfAttendance">
		<g:message code="student.lesson15DateOfAttendance.label" default="Lesson15 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson15DateOfAttendance" precision="day"  value="${studentInstance?.lesson15DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson16DateOfAttendance', 'error')} ">
	<label for="lesson16DateOfAttendance">
		<g:message code="student.lesson16DateOfAttendance.label" default="Lesson16 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson16DateOfAttendance" precision="day"  value="${studentInstance?.lesson16DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson17DateOfAttendance', 'error')} ">
	<label for="lesson17DateOfAttendance">
		<g:message code="student.lesson17DateOfAttendance.label" default="Lesson17 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson17DateOfAttendance" precision="day"  value="${studentInstance?.lesson17DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson18DateOfAttendance', 'error')} ">
	<label for="lesson18DateOfAttendance">
		<g:message code="student.lesson18DateOfAttendance.label" default="Lesson18 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson18DateOfAttendance" precision="day"  value="${studentInstance?.lesson18DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson19DateOfAttendance', 'error')} ">
	<label for="lesson19DateOfAttendance">
		<g:message code="student.lesson19DateOfAttendance.label" default="Lesson19 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson19DateOfAttendance" precision="day"  value="${studentInstance?.lesson19DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson20DateOfAttendance', 'error')} ">
	<label for="lesson20DateOfAttendance">
		<g:message code="student.lesson20DateOfAttendance.label" default="Lesson20 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson20DateOfAttendance" precision="day"  value="${studentInstance?.lesson20DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson21DateOfAttendance', 'error')} ">
	<label for="lesson21DateOfAttendance">
		<g:message code="student.lesson21DateOfAttendance.label" default="Lesson21 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson21DateOfAttendance" precision="day"  value="${studentInstance?.lesson21DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson22DateOfAttendance', 'error')} ">
	<label for="lesson22DateOfAttendance">
		<g:message code="student.lesson22DateOfAttendance.label" default="Lesson22 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson22DateOfAttendance" precision="day"  value="${studentInstance?.lesson22DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson23DateOfAttendance', 'error')} ">
	<label for="lesson23DateOfAttendance">
		<g:message code="student.lesson23DateOfAttendance.label" default="Lesson23 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson23DateOfAttendance" precision="day"  value="${studentInstance?.lesson23DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson24DateOfAttendance', 'error')} ">
	<label for="lesson24DateOfAttendance">
		<g:message code="student.lesson24DateOfAttendance.label" default="Lesson24 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson24DateOfAttendance" precision="day"  value="${studentInstance?.lesson24DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson25DateOfAttendance', 'error')} ">
	<label for="lesson25DateOfAttendance">
		<g:message code="student.lesson25DateOfAttendance.label" default="Lesson25 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson25DateOfAttendance" precision="day"  value="${studentInstance?.lesson25DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson26DateOfAttendance', 'error')} ">
	<label for="lesson26DateOfAttendance">
		<g:message code="student.lesson26DateOfAttendance.label" default="Lesson26 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson26DateOfAttendance" precision="day"  value="${studentInstance?.lesson26DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson27DateOfAttendance', 'error')} ">
	<label for="lesson27DateOfAttendance">
		<g:message code="student.lesson27DateOfAttendance.label" default="Lesson27 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson27DateOfAttendance" precision="day"  value="${studentInstance?.lesson27DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lesson28DateOfAttendance', 'error')} ">
	<label for="lesson28DateOfAttendance">
		<g:message code="student.lesson28DateOfAttendance.label" default="Lesson28 Date Of Attendance" />
		
	</label>
	<g:datePicker name="lesson28DateOfAttendance" precision="day"  value="${studentInstance?.lesson28DateOfAttendance}" default="none" noSelection="['': '']" />
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'type', 'error')} ">
	<label for="type">
		<g:message code="student.type.label" default="Type" />
		
	</label>
	<g:select name="type" noSelection="${['null':'Select One...']}" from="${studentInstance.constraints.type.inList}" value="${studentInstance?.type}" valueMessagePrefix="student.type" noSelection="['': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'status', 'error')} ">
	<label for="status">
		<g:message code="student.status.label" default="Status" />
		
	</label>
	<g:select name="status" from="${studentInstance.constraints.status.inList}" value="${studentInstance?.status}" valueMessagePrefix="student.status" noSelection="['': '']"/>
</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'devotionalPrayerList', 'error')} ">
	<label for="devotionalPrayerList">
		<g:message code="student.devotionalPrayerList.label" default="Devotional Prayer List" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${studentInstance?.devotionalPrayerList?}" var="d">
    <li><g:link controller="devotionalPrayer" action="show" id="${d.id}">${d?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="devotionalPrayer" action="create" params="['student.id': studentInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'devotionalPrayer.label', default: 'DevotionalPrayer')])}</g:link>
</li>
</ul>

</div>

<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'worshipServiceAttendanceList', 'error')} ">
	<label for="worshipServiceAttendanceList">
		<g:message code="student.worshipServiceAttendanceList.label" default="Worship Service Attendance List" />
		
	</label>
	
<ul class="one-to-many">
<g:each in="${studentInstance?.worshipServiceAttendanceList?}" var="w">
    <li><g:link controller="worshipServiceAttendance" action="show" id="${w.id}">${w?.encodeAsHTML()}</g:link></li>
</g:each>
<li class="add">
<g:link controller="worshipServiceAttendance" action="create" params="['student.id': studentInstance?.id]">${message(code: 'default.add.label', args: [message(code: 'worshipServiceAttendance.label', default: 'WorshipServiceAttendance')])}</g:link>
</li>
</ul>

</div>

