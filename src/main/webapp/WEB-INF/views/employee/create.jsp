<%--
  Created by IntelliJ IDEA.
  User: binhnguyen
  Date: 6/2/20
  Time: 8:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Create Employee</title>
</head>
<body>
<h1>Create Employee</h1>
<form:form action="addEmployee" method="post" modelAttribute="employee">
    <form:label path="id">ID:</form:label><form:input path="id"/>
    <form:label path="name">Name:</form:label><form:input path="name"/>
    <form:label path="contactNumber">Contact Number:</form:label><form:input path="contactNumber"/>
    <input type="submit" value="Submit">
</form:form>
</body>
</html>
