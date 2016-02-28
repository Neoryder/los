<%--
  Created by IntelliJ IDEA.
  User: IPC_LaptopA
  Date: 2/28/2016
  Time: 6:00 PM
--%>
<g:applyLayout name="page">
    <head>
        <title><g:layoutTitle/></title>
        <g:layoutHead/>
    </head>
    <body>
    <div id="banner">
        <g:pageProperty name="page.banner"/>
    </div>

    <content tag="left">
        <g:pageProperty name="page.left1"/>
        <g:pageProperty name="page.left2"/>
        <g:pageProperty name="page.left3"/>
    </content>

    <content tag="right">
        <g:pageProperty name="page.right1"/>
        <g:pageProperty name="page.right2"/>
        <g:pageProperty name="page.right3"/>
    </content>
    </body>
</g:applyLayout>