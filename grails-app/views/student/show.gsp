
<%@ page import="los.Student" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'student.label', default: 'Student')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
        <r:require module="jquery"/>
        <r:require module="jquery-ui-dev"/>
        <r:require modules="bootstrap"/>
	</head>
	<body>
		<a href="#show-student" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="list"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-student" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list student">
			
				<g:if test="${studentInstance?.firstName}">
				<li class="fieldcontain">
					<span id="firstName-label" class="property-label"><g:message code="student.firstName.label" default="First Name" /></span>
					
						<span class="property-value" aria-labelledby="firstName-label"><g:fieldValue bean="${studentInstance}" field="firstName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.middleName}">
				<li class="fieldcontain">
					<span id="middleName-label" class="property-label"><g:message code="student.middleName.label" default="Middle Name" /></span>
					
						<span class="property-value" aria-labelledby="middleName-label"><g:fieldValue bean="${studentInstance}" field="middleName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lastName}">
				<li class="fieldcontain">
					<span id="lastName-label" class="property-label"><g:message code="student.lastName.label" default="Last Name" /></span>
					
						<span class="property-value" aria-labelledby="lastName-label"><g:fieldValue bean="${studentInstance}" field="lastName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.husbandsLastName}">
				<li class="fieldcontain">
					<span id="husbandsLastName-label" class="property-label"><g:message code="student.husbandsLastName.label" default="Husbands Last Name" /></span>
					
						<span class="property-value" aria-labelledby="husbandsLastName-label"><g:fieldValue bean="${studentInstance}" field="husbandsLastName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.spouseName}">
				<li class="fieldcontain">
					<span id="spouseName-label" class="property-label"><g:message code="student.spouseName.label" default="Spouse Name" /></span>
					
						<span class="property-value" aria-labelledby="spouseName-label"><g:fieldValue bean="${studentInstance}" field="spouseName"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lokal}">
				<li class="fieldcontain">
					<span id="lokal-label" class="property-label"><g:message code="student.lokal.label" default="Lokal" /></span>
					
						<span class="property-value" aria-labelledby="lokal-label"><g:link controller="lokal" action="show" id="${studentInstance?.lokal?.id}">${studentInstance?.lokal?.lokal?.encodeAsHTML()}</g:link></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.birthCertificateRegistrationNumber}">
				<li class="fieldcontain">
					<span id="birthCertificateRegistrationNumber-label" class="property-label"><g:message code="student.birthCertificateRegistrationNumber.label" default="Birth Certificate Registration Number" /></span>
					
						<span class="property-value" aria-labelledby="birthCertificateRegistrationNumber-label"><g:fieldValue bean="${studentInstance}" field="birthCertificateRegistrationNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.marriageContractCertificateRegistrationNumber}">
				<li class="fieldcontain">
					<span id="marriageContractCertificateRegistrationNumber-label" class="property-label"><g:message code="student.marriageContractCertificateRegistrationNumber.label" default="Marriage Contract Certificate Registration Number" /></span>
					
						<span class="property-value" aria-labelledby="marriageContractCertificateRegistrationNumber-label"><g:fieldValue bean="${studentInstance}" field="marriageContractCertificateRegistrationNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.cenomarNumber}">
				<li class="fieldcontain">
					<span id="cenomarNumber-label" class="property-label"><g:message code="student.cenomarNumber.label" default="Cenomar Number" /></span>
					
						<span class="property-value" aria-labelledby="cenomarNumber-label"><g:fieldValue bean="${studentInstance}" field="cenomarNumber"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.birthDate}">
				<li class="fieldcontain">
					<span id="birthDate-label" class="property-label"><g:message code="student.birthDate.label" default="Birth Date" /></span>
					
						<span class="property-value" aria-labelledby="birthDate-label"><g:formatDate date="${studentInstance?.birthDate}" format="yyyy-MMM-dd"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.startDate}">
				<li class="fieldcontain">
					<span id="startDate-label" class="property-label"><g:message code="student.startDate.label" default="Start Date" /></span>
					
						<span class="property-value" aria-labelledby="startDate-label"><g:formatDate date="${studentInstance?.startDate}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.gender}">
				<li class="fieldcontain">
					<span id="gender-label" class="property-label"><g:message code="student.gender.label" default="Gender" /></span>
					
						<span class="property-value" aria-labelledby="gender-label"><g:fieldValue bean="${studentInstance}" field="gender"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.studentType}">
				<li class="fieldcontain">
					<span id="studentType-label" class="property-label"><g:message code="student.studentType.label" default="Student Type" /></span>
					
						<span class="property-value" aria-labelledby="studentType-label"><g:fieldValue bean="${studentInstance}" field="studentType"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.address}">
				<li class="fieldcontain">
					<span id="address-label" class="property-label"><g:message code="student.address.label" default="Address" /></span>
					
						<span class="property-value" aria-labelledby="address-label"><g:fieldValue bean="${studentInstance}" field="address"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.civilStatus}">
				<li class="fieldcontain">
					<span id="civilStatus-label" class="property-label"><g:message code="student.civilStatus.label" default="Civil Status" /></span>
					
						<span class="property-value" aria-labelledby="civilStatus-label"><g:fieldValue bean="${studentInstance}" field="civilStatus"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.nationality}">
				<li class="fieldcontain">
					<span id="nationality-label" class="property-label"><g:message code="student.nationality.label" default="Nationality" /></span>
					
						<span class="property-value" aria-labelledby="nationality-label"><g:fieldValue bean="${studentInstance}" field="nationality"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.citizenship}">
				<li class="fieldcontain">
					<span id="citizenship-label" class="property-label"><g:message code="student.citizenship.label" default="Citizenship" /></span>
					
						<span class="property-value" aria-labelledby="citizenship-label"><g:fieldValue bean="${studentInstance}" field="citizenship"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.nagakay}">
				<li class="fieldcontain">
					<span id="nagakay-label" class="property-label"><g:message code="student.nagakay.label" default="Nagakay" /></span>
					
						<span class="property-value" aria-labelledby="nagakay-label"><g:fieldValue bean="${studentInstance}" field="nagakay"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.nagakayAreaGroup}">
				<li class="fieldcontain">
					<span id="nagakayAreaGroup-label" class="property-label"><g:message code="student.nagakayAreaGroup.label" default="Nagakay Area Group" /></span>
					
						<span class="property-value" aria-labelledby="nagakayAreaGroup-label"><g:fieldValue bean="${studentInstance}" field="nagakayAreaGroup"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.nagakayFamilyOrganization}">
				<li class="fieldcontain">
					<span id="nagakayFamilyOrganization-label" class="property-label"><g:message code="student.nagakayFamilyOrganization.label" default="Nagakay Family Organization" /></span>
					
						<span class="property-value" aria-labelledby="nagakayFamilyOrganization-label"><g:fieldValue bean="${studentInstance}" field="nagakayFamilyOrganization"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.referenceNumber01}">
				<li class="fieldcontain">
					<span id="referenceNumber01-label" class="property-label"><g:message code="student.referenceNumber01.label" default="Reference Number01" /></span>
					
						<span class="property-value" aria-labelledby="referenceNumber01-label"><g:fieldValue bean="${studentInstance}" field="referenceNumber01"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.referenceNumber02}">
				<li class="fieldcontain">
					<span id="referenceNumber02-label" class="property-label"><g:message code="student.referenceNumber02.label" default="Reference Number02" /></span>
					
						<span class="property-value" aria-labelledby="referenceNumber02-label"><g:fieldValue bean="${studentInstance}" field="referenceNumber02"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.referenceNumber03}">
				<li class="fieldcontain">
					<span id="referenceNumber03-label" class="property-label"><g:message code="student.referenceNumber03.label" default="Reference Number03" /></span>
					
						<span class="property-value" aria-labelledby="referenceNumber03-label"><g:fieldValue bean="${studentInstance}" field="referenceNumber03"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.teacher}">
				<li class="fieldcontain">
					<span id="teacher-label" class="property-label"><g:message code="student.teacher.label" default="Teacher" /></span>
					<span class="property-value" aria-labelledby="teacher-label"><g:link controller="teacher" action="show" id="${studentInstance?.teacher?.id}">${(studentInstance?.teacher?.name+' - '+studentInstance?.teacher?.assignedNumber).encodeAsHTML() }</g:link></span>
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson01DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson01DateOfAttendance-label" class="property-label"><g:message code="student.lesson01DateOfAttendance.label" default="Lesson01 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson01DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson01DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson02DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson02DateOfAttendance-label" class="property-label"><g:message code="student.lesson02DateOfAttendance.label" default="Lesson02 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson02DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson02DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson03DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson03DateOfAttendance-label" class="property-label"><g:message code="student.lesson03DateOfAttendance.label" default="Lesson03 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson03DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson03DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson04DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson04DateOfAttendance-label" class="property-label"><g:message code="student.lesson04DateOfAttendance.label" default="Lesson04 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson04DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson04DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson05DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson05DateOfAttendance-label" class="property-label"><g:message code="student.lesson05DateOfAttendance.label" default="Lesson05 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson05DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson05DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson06DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson06DateOfAttendance-label" class="property-label"><g:message code="student.lesson06DateOfAttendance.label" default="Lesson06 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson06DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson06DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson07DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson07DateOfAttendance-label" class="property-label"><g:message code="student.lesson07DateOfAttendance.label" default="Lesson07 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson07DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson07DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson08DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson08DateOfAttendance-label" class="property-label"><g:message code="student.lesson08DateOfAttendance.label" default="Lesson08 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson08DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson08DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson09DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson09DateOfAttendance-label" class="property-label"><g:message code="student.lesson09DateOfAttendance.label" default="Lesson09 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson09DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson09DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson10DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson10DateOfAttendance-label" class="property-label"><g:message code="student.lesson10DateOfAttendance.label" default="Lesson10 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson10DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson10DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson11DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson11DateOfAttendance-label" class="property-label"><g:message code="student.lesson11DateOfAttendance.label" default="Lesson11 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson11DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson11DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson12DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson12DateOfAttendance-label" class="property-label"><g:message code="student.lesson12DateOfAttendance.label" default="Lesson12 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson12DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson12DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson13DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson13DateOfAttendance-label" class="property-label"><g:message code="student.lesson13DateOfAttendance.label" default="Lesson13 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson13DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson13DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson14DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson14DateOfAttendance-label" class="property-label"><g:message code="student.lesson14DateOfAttendance.label" default="Lesson14 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson14DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson14DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson15DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson15DateOfAttendance-label" class="property-label"><g:message code="student.lesson15DateOfAttendance.label" default="Lesson15 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson15DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson15DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson16DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson16DateOfAttendance-label" class="property-label"><g:message code="student.lesson16DateOfAttendance.label" default="Lesson16 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson16DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson16DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson17DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson17DateOfAttendance-label" class="property-label"><g:message code="student.lesson17DateOfAttendance.label" default="Lesson17 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson17DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson17DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson18DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson18DateOfAttendance-label" class="property-label"><g:message code="student.lesson18DateOfAttendance.label" default="Lesson18 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson18DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson18DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson19DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson19DateOfAttendance-label" class="property-label"><g:message code="student.lesson19DateOfAttendance.label" default="Lesson19 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson19DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson19DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson20DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson20DateOfAttendance-label" class="property-label"><g:message code="student.lesson20DateOfAttendance.label" default="Lesson20 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson20DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson20DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson21DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson21DateOfAttendance-label" class="property-label"><g:message code="student.lesson21DateOfAttendance.label" default="Lesson21 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson21DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson21DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson22DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson22DateOfAttendance-label" class="property-label"><g:message code="student.lesson22DateOfAttendance.label" default="Lesson22 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson22DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson22DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson23DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson23DateOfAttendance-label" class="property-label"><g:message code="student.lesson23DateOfAttendance.label" default="Lesson23 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson23DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson23DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson24DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson24DateOfAttendance-label" class="property-label"><g:message code="student.lesson24DateOfAttendance.label" default="Lesson24 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson24DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson24DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson25DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson25DateOfAttendance-label" class="property-label"><g:message code="student.lesson25DateOfAttendance.label" default="Lesson25 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson25DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson25DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson26DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson26DateOfAttendance-label" class="property-label"><g:message code="student.lesson26DateOfAttendance.label" default="Lesson26 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson26DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson26DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson27DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson27DateOfAttendance-label" class="property-label"><g:message code="student.lesson27DateOfAttendance.label" default="Lesson27 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson27DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson27DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.lesson28DateOfAttendance}">
				<li class="fieldcontain">
					<span id="lesson28DateOfAttendance-label" class="property-label"><g:message code="student.lesson28DateOfAttendance.label" default="Lesson28 Date Of Attendance" /></span>
					
						<span class="property-value" aria-labelledby="lesson28DateOfAttendance-label"><g:formatDate date="${studentInstance?.lesson28DateOfAttendance}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.type}">
				<li class="fieldcontain">
					<span id="type-label" class="property-label"><g:message code="student.type.label" default="Type" /></span>
					
						<span class="property-value" aria-labelledby="type-label"><g:fieldValue bean="${studentInstance}" field="type"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="student.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:fieldValue bean="${studentInstance}" field="status"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.devotionalPrayerList}">
				<li class="fieldcontain">
					<span id="devotionalPrayerList-label" class="property-label"><g:message code="student.devotionalPrayerList.label" default="Devotional Prayer List" /></span>
						[Total: ${studentInstance?.devotionalPrayerList?.size()}] - 
						<g:each in="${studentInstance.devotionalPrayerList}" var="d">
						<span class="property-value" aria-labelledby="devotionalPrayerList-label"><g:link controller="devotionalPrayer" action="show" id="${d.id}">${d?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
				<g:if test="${studentInstance?.worshipServiceAttendanceList}">
				<li class="fieldcontain">
					<span id="worshipServiceAttendanceList-label" class="property-label"><g:message code="student.worshipServiceAttendanceList.label" default="Worship Service Attendance List" /></span>
						[Total: ${studentInstance?.worshipServiceAttendanceList?.size()}] - 
						<g:each in="${studentInstance.worshipServiceAttendanceList}" var="w">
						<span class="property-value" aria-labelledby="worshipServiceAttendanceList-label"><g:link controller="worshipServiceAttendance" action="show" id="${w.id}">${w?.encodeAsHTML()}</g:link></span>
						</g:each>
					
				</li>
				</g:if>
			
			</ol>
			<g:form>
				<fieldset class="buttons">
					<g:hiddenField name="id" value="${studentInstance?.id}" />
					<g:link class="edit" action="edit" id="${studentInstance?.id}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
