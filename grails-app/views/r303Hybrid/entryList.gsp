<%@ page import="los.Student; los.reports.R303Entry" %>
<%@ page import="los.reports.R303" %>

<!DOCTYPE html>
<html>
<head>
    <meta name="layout" content="main">
    <g:set var="entityName" value="${message(code: 'r303Entry.label', default: 'R303Entry')}"/>
    <title><g:message code="default.list.label" args="[entityName]"/></title>
    <r:require module="jquery"/>
    <r:require module="jquery-ui-dev"/>
    <r:require modules="bootstrap"/>
</head>

<body>

<div class="nav" role="navigation">
    <ul>
        <li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
        <li><g:link class="create" action="create"><g:message code="default.new.label"
                                                              args="[entityName]"/></g:link></li>
    </ul>
</div>

<g:form >

    <div class="row">
        <div class="span3">
            <div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'r303', 'error')} required">
                <label for="r303">
                    <g:message code="r303Entry.r303.label" default="R303"/>
                    <span class="required-indicator">*</span>
                </label>
                %{--<g:select id="r303" name="r303.id" from="${los.reports.R303.list()}" optionKey="id" optionValue="weekNo" required="" value="${r303EntryInstance?.r303?.id}" class="many-to-one"/>--}%
                <los:r303Taglib  id="r303" name="r303.id" class="middle200" value="${r303Instance?.id}"></los:r303Taglib>
            </div>
        </div>
        <div class="span2">
            <div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'student', 'error')} required">
                <label for="student">
                    <g:message code="r303Entry.student.label" default="Student"/>
                    <span class="required-indicator">*</span>
                </label>
                %{--<g:select id="student" name="student.id" from="${los.Student.list()}" optionKey="id" required=""--}%
                %{--value="${r303EntryInstance?.student?.id}" class="many-to-one"/>--}%
                <g:textField class="short150" id="student"  name="student.id" />

            </div>
        </div>
        <div class="span1">
            <div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonMon', 'error')} required">
                <label for="lessonMon">
                    <g:message code="r303Entry.lessonMon.label" default="Mon"/>
                    <span class="required-indicator">*</span>
                </label>
                <g:field class="short100" name="lessonMon" type="number" value="${r303EntryInstance.lessonMon}" required=""/>
            </div>
        </div>
        <div class="span1">
            <div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonTue', 'error')} required">
                <label for="lessonTue">
                    <g:message code="r303Entry.lessonTue.label" default="Tue"/>
                    <span class="required-indicator">*</span>
                </label>
                <g:field class="short100" name="lessonTue" type="number" value="${r303EntryInstance.lessonTue}" required=""/>
            </div>
        </div>
        <div class="span1">
            <div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonWed', 'error')} required">
                <label for="lessonWed">
                    <g:message code="r303Entry.lessonWed.label" default="Wed"/>
                    <span class="required-indicator">*</span>
                </label>
                <g:field class="short100" name="lessonWed" type="number" value="${r303EntryInstance.lessonWed}" required=""/>
            </div>
        </div>
        <div class="span1">
            <div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonThu', 'error')} required">
                <label for="lessonThu">
                    <g:message code="r303Entry.lessonThu.label" default="Thu"/>
                    <span class="required-indicator">*</span>
                </label>
                <g:field class="short100" name="lessonThu" type="number" value="${r303EntryInstance.lessonThu}" required=""/>
            </div>
        </div>
        <div class="span1">
            <div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonFri', 'error')} required">
                <label for="lessonFri">
                    <g:message code="r303Entry.lessonFri.label" default="Fri"/>
                    <span class="required-indicator">*</span>
                </label>
                <g:field class="short100" name="lessonFri" type="number" value="${r303EntryInstance.lessonFri}" required=""/>
            </div>
        </div>
        <div class="span1">
            <div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonSat', 'error')} required">
                <label for="lessonSat">
                    <g:message code="r303Entry.lessonSat.label" default="Sat"/>
                    <span class="required-indicator">*</span>
                </label>
                <g:field class="short100" name="lessonSat" type="number" value="${r303EntryInstance.lessonSat}" required=""/>
            </div>
        </div>
        <div class="span1">
            <div class="fieldcontain ${hasErrors(bean: r303EntryInstance, field: 'lessonSun', 'error')} required">
                <label for="lessonSun">
                    <g:message code="r303Entry.lessonSun.label" default="   Sun"/>
                    <span class="required-indicator">*</span>
                </label>
                <g:field class="short100" name="lessonSun" type="number" value="${r303EntryInstance.lessonSun}" required=""/>
            </div>
        </div>
    </div>


















</g:form>

<div id="list-r303Entry" class="content scaffold-list" role="main">
    <h1><g:message code="default.list.label" args="[entityName]"/></h1>
    <g:if test="${flash.message}">
        <div class="message" role="status">${flash.message}</div>
    </g:if>
    <div class="table-responsive">
        <table class="table table-striped table-bordered table-condensed">
            <thead>
            <tr>

                <g:sortableColumn property="lessonMon"
                                  title="${message(code: 'r303Entry.student.label', default: 'Student')}"/>

                <g:sortableColumn property="lessonMon"
                                  title="${message(code: 'r303Entry.lessonMon.label', default: 'Lesson Mon')}"/>

                <g:sortableColumn property="lessonTue"
                                  title="${message(code: 'r303Entry.lessonTue.label', default: 'Lesson Tue')}"/>

                <g:sortableColumn property="lessonTue"
                                  title="${message(code: 'r303Entry.lessonWed.label', default: 'Lesson Wed')}"/>

                <g:sortableColumn property="lessonThu"
                                  title="${message(code: 'r303Entry.lessonThu.label', default: 'Lesson Thu')}"/>

                <g:sortableColumn property="lessonFri"
                                  title="${message(code: 'r303Entry.lessonFri.label', default: 'Lesson Fri')}"/>

                <g:sortableColumn property="lessonSat"
                                  title="${message(code: 'r303Entry.lessonSat.label', default: 'Lesson Sat')}"/>

                <g:sortableColumn property="lessonSun"
                                  title="${message(code: 'r303Entry.lessonSun.label', default: 'Lesson Sun')}"/>

            </tr>
            </thead>
            <tbody>
            <g:each in="${r303EntryInstanceList}" status="i" var="r303EntryInstance">
                <tr class="${(i % 2) == 0 ? 'even' : 'odd'}">

                    <td><g:link action="show"
                                id="${r303EntryInstance.id}">${fieldValue(bean: r303EntryInstance, field: "lessonFri")}</g:link></td>

                    <td>${fieldValue(bean: r303EntryInstance, field: "student")}</td>

                    <td>${fieldValue(bean: r303EntryInstance, field: "lessonMon")}</td>

                    <td>${fieldValue(bean: r303EntryInstance, field: "lessonTue")}</td>

                    <td>${fieldValue(bean: r303EntryInstance, field: "lessonWed")}</td>

                    <td>${fieldValue(bean: r303EntryInstance, field: "lessonThu")}</td>

                    <td>${fieldValue(bean: r303EntryInstance, field: "lessonFri")}</td>

                    <td>${fieldValue(bean: r303EntryInstance, field: "lessonSat")}</td>

                    <td>${fieldValue(bean: r303EntryInstance, field: "lessonSun")}</td>

                </tr>
            </g:each>
            </tbody>
        </table>
    </div>


    <div class="pagination">
        <g:paginate total="${r303EntryInstanceTotal}"/>
    </div>
</div>
</body>
</html>
