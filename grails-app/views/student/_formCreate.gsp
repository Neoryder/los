<%@ page import="los.Student" %>

<div class="row">
    <div class="span6">
        <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'firstName', 'error')} required">
            <label for="firstName">
                <g:message code="student.firstName.label" default="First Name" />
                <span class="required-indicator">*</span>
            </label>
            <g:textField name="firstName" maxlength="100" required="" value="${studentInstance?.firstName}"/>
        </div>
    </div>

    <div class="span6">
        <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'middleName', 'error')} required">
            <label for="middleName">
                <g:message code="student.middleName.label" default="Middle Name" />
                <span class="required-indicator">*</span>
            </label>
            <g:textField name="middleName" maxlength="100" required="" value="${studentInstance?.middleName}"/>
        </div>
    </div>
</div>

<div class="row">
    <div class="span6">
        <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lastName', 'error')} required">
            <label for="lastName">
                <g:message code="student.lastName.label" default="Last Name" />
                <span class="required-indicator">*</span>
            </label>
            <g:textField name="lastName" maxlength="100" required="" value="${studentInstance?.lastName}"/>
        </div>
    </div>
    <div class="span6">
        <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'husbandsLastName', 'error')} ">
            <label for="husbandsLastName">
                <g:message code="student.husbandsLastName.label" default="Husbands Last Name" />

            </label>
            <g:textField name="husbandsLastName" maxlength="100" value="${studentInstance?.husbandsLastName}"/>
        </div>
    </div>
</div>

<div class="row">
    <div class="span6">
        <div class=" fieldcontain ${hasErrors(bean: studentInstance, field: 'spouseName', 'error')} ">
            <label for="spouseName">
                <g:message code="student.spouseName.label" default="Spouse Name" />
            </label>
            <g:textField class="long-text12" name="spouseName" maxlength="100" value="${studentInstance?.spouseName}"/>
        </div>
    </div>
    <div class="row">
        <div class="span2">
            <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'gender', 'error')} ">
                <label for="gender">
                    <g:message code="student.gender.label" default="Gender" />
                    <span class="required-indicator">*</span>
                </label>
                <g:select name="gender" from="${studentInstance.constraints.gender.inList}" value="${studentInstance?.gender}" valueMessagePrefix="student.gender" noSelection="['': '']"/>
            </div>
        </div>
        <div class="span2">
            <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'studentType', 'error')} ">
                <label for="studentType">
                    <g:message code="student.studentType.label" default="Student Type" />

                </label>
                <g:select name="studentType" from="${studentInstance.constraints.studentType.inList}" value="${studentInstance?.studentType}" valueMessagePrefix="student.studentType" noSelection="['': '']"/>
            </div>
        </div>
        <div class="span2">
            <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'civilStatus', 'error')} required">
                <label for="civilStatus">
                    <g:message code="student.civilStatus.label" default="Civil Status" />
                    <span class="required-indicator">*</span>
                </label>
                <g:select name="civilStatus" noSelection="${['null':'Select One...']}" from="${studentInstance.constraints.civilStatus.inList}" required="" value="${studentInstance?.civilStatus}" valueMessagePrefix="student.civilStatus"/>
            </div>
        </div>
    </div>
</div>


<div class="row">
    <div class="span6">
        <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'lokal', 'error')} required">
            <label for="lokal">
                <g:message code="student.lokal.label" default="Lokal" />
                <span class="required-indicator">*</span>
            </label>
            <g:select id="lokal" name="lokal.id" noSelection="${['null':'Select One...']}" from="${los.Lokal.list()}" optionKey="id" optionValue="lokal" required="" value="${studentInstance?.lokal?.id}"  class="many-to-one"/>
        </div>
    </div>
    %{--<div class="span6">--}%
        %{--<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'birthCertificateRegistrationNumber', 'error')} ">--}%
            %{--<label for="birthCertificateRegistrationNumber">--}%
                %{--<g:message code="student.birthCertificateRegistrationNumber.label" default="Birth Certificate Registration Number" />--}%

            %{--</label>--}%
            %{--<g:textField name="birthCertificateRegistrationNumber" value="${studentInstance?.birthCertificateRegistrationNumber}"/>--}%
        %{--</div>--}%
    %{--</div>--}%
</div>

<div class="row">
    <div class="span6">
        <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'birthDate', 'error')} required">
            <label for="birthDate">
                <g:message code="student.birthDate.label" default="Birth Date" />
                <span class="required-indicator">*</span>
            </label>
            <g:datePicker name="birthDate" precision="day"  value="${studentInstance?.birthDate}" class="test"  />
            %{--<div id="birthDatePicker"   value="${studentInstance?.birthDate}" ></div>--}%
            %{--<input type="hidden"  id="birthDate" name="birthDate"   value="${studentInstance?.birthDate}" >--}%
        </div>
    </div>
    <div class="span6">
        <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'startDate', 'error')} ">
            <label for="startDate">
                <g:message code="student.startDate.label" default="Start Date" />

            </label>
            <g:datePicker name="startDate" precision="day"  value="${studentInstance?.startDate}" default="none" noSelection="['': '']" />
        </div>
    </div>
</div>


<div class="row">
    <div class="span12">
        <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'address', 'error')}">
            <label for="address">
                <g:message code="student.address.label" default="Address" />
            </label>
            <g:textArea class="long1000" name="address" cols="40" rows="5" maxlength="500" value="${studentInstance?.address}"/>
        </div>
    </div>
</div>

<div class="row">
    <div class="span6">
        <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'nagakay', 'error')} ">
            <label for="nagakay">
                <g:message code="student.nagakay.label" default="Nagakay" />
            </label>
            <g:textField name="nagakay" maxlength="200"  value="${studentInstance?.nagakay}"/>
        </div>
    </div>
    <div class="span6">
        <div class="row">
            <div class="span3">
                <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'nagakayAreaGroup', 'error')} ">
                    <label for="nagakayAreaGroup">
                        <g:message code="student.nagakayAreaGroup.label" default="Nagakay Area Group" />
                    </label>
                    <g:textField class="short200" name="nagakayAreaGroup" maxlength="50"  value="${studentInstance?.nagakayAreaGroup}"/>
                </div>
            </div>
            <div class="span3">
                <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'nagakayFamilyOrganization', 'error')} ">
                    <label for="nagakayFamilyOrganization">
                        <g:message code="student.nagakayFamilyOrganization.label" default="Nagakay Family Organization" />
                    </label>
                    <g:select name="nagakayFamilyOrganization" noSelection="${['':'Select One...']}" from="${studentInstance.constraints.nagakayFamilyOrganization.inList}"  value="${studentInstance?.nagakayFamilyOrganization}" valueMessagePrefix="student.nagakayFamilyOrganization"/>
                </div>
            </div>
        </div>
    </div>
</div>

%{--<div class="row">--}%
    %{--<div class="span6">--}%
        %{--<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'citizenship', 'error')}">--}%
            %{--<label for="citizenship">--}%
                %{--<g:message code="student.citizenship.label" default="Citizenship" />--}%
            %{--</label>--}%
            %{--<g:textField name="citizenship" maxlength="100"  value="${studentInstance?.citizenship}"/>--}%
        %{--</div>--}%
    %{--</div>--}%
    %{--<div class="span6">--}%
        %{--<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'nationality', 'error')}">--}%
            %{--<label for="nationality">--}%
                %{--<g:message code="student.nationality.label" default="Nationality" />--}%
            %{--</label>--}%
            %{--<g:textField name="nationality" maxlength="100"  value="${studentInstance?.nationality}"/>--}%
        %{--</div>--}%
    %{--</div>--}%
%{--</div>--}%

%{--<div class="row">--}%
    %{--<div class="span6">--}%
        %{--<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'marriageContractCertificateRegistrationNumber', 'error')} ">--}%
            %{--<label for="marriageContractCertificateRegistrationNumber">--}%
                %{--<g:message code="student.marriageContractCertificateRegistrationNumber.label"--}%
                           %{--default="Marriage Contract Certificate Registration Number"/>--}%

            %{--</label>--}%
            %{--<g:textField name="marriageContractCertificateRegistrationNumber"--}%
                         %{--value="${studentInstance?.marriageContractCertificateRegistrationNumber}"/>--}%
        %{--</div>--}%
    %{--</div>--}%
    %{--<div class="span6">--}%
        %{--<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'cenomarNumber', 'error')} ">--}%
            %{--<label for="cenomarNumber">--}%
                %{--<g:message code="student.cenomarNumber.label" default="Cenomar Number" />--}%

            %{--</label>--}%
            %{--<g:textField name="cenomarNumber" value="${studentInstance?.cenomarNumber}"/>--}%
        %{--</div>--}%
    %{--</div>--}%
%{--</div>--}%


<div class="row">
    <div class="span6">
        <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'teacher', 'error')} required">
        <label for="teacher">
            <g:message code="student.teacher.label" default="Teacher" />
            <span class="required-indicator">*</span>
        </label>
        <select id="teacher" class="select2_dropdown bigdrop" >
            <option value="${studentInstance?.teacher?.assignedNumber}" selected="selected"  >${studentInstance?.teacher}</option>
        </select>
        <g:hiddenField name="teacher.id" id="teacherId" value="${studentInstance?.teacher?.id}" ></g:hiddenField>
    </div>
    </div>
    <div class="span6">
        <div class="row">
            <div class="span3">
                <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'type', 'error')} ">
                    <label for="type">
                        <g:message code="student.type.label" default="Type" />
                    </label>
                    <g:select name="type" noSelection="${['null':'Select One...']}" from="${studentInstance.constraints.type.inList}" value="${studentInstance?.type}" valueMessagePrefix="student.type" noSelection="['': '']"/>
                </div>
            </div>
            <div class="span3">
                <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'status', 'error')} ">
                    <label for="status">
                        <g:message code="student.status.label" default="Status" />

                    </label>
                    <g:select name="status" from="${studentInstance.constraints.status.inList}" value="${studentInstance?.status}" valueMessagePrefix="student.status" noSelection="['': '']"/>
                </div>
            </div>
        </div>
    </div>
</div>


<div class="row">
    <div class="span4">
        <div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'referenceNumber01', 'error')} required">
            <label for="referenceNumber01">
                <g:message code="student.referenceNumber01.label" default="Reference Number01" />
                <span class="required-indicator">*</span>
            </label>
            <g:textField class="short300"  name="referenceNumber01" required="" value="${studentInstance?.referenceNumber01}"/>
        </div>
    </div>
    %{--<div class="span4">--}%
        %{--<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'referenceNumber02', 'error')} ">--}%
            %{--<label for="referenceNumber02">--}%
                %{--<g:message code="student.referenceNumber02.label" default="Reference Number02" />--}%

            %{--</label>--}%
            %{--<g:textField class="short300" name="referenceNumber02" value="${studentInstance?.referenceNumber02}"/>--}%
        %{--</div>--}%
    %{--</div>--}%
    %{--<div class="span4">--}%
        %{--<div class="fieldcontain ${hasErrors(bean: studentInstance, field: 'referenceNumber03', 'error')} ">--}%
            %{--<label for="referenceNumber03">--}%
                %{--<g:message code="student.referenceNumber03.label" default="Reference Number03" />--}%

            %{--</label>--}%
            %{--<g:textField class="short300" name="referenceNumber03" value="${studentInstance?.referenceNumber03}"/>--}%
        %{--</div>--}%
    %{--</div>--}%
</div>








