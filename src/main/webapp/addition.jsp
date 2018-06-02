<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" href="<c:url value="color.css"/>"/>
</head>
<body>
<h1 style="text-align: center">Enter color</h1>
<div style="text-align: center">
    <form action="/addition" method="POST">
        <label for="num1">Enter your first amount</label>
        <input type="number" id="num1" name="num1">
        <label>+</label>
        <label for="num2">Enter you second amount</label>
        <input type="number" id="num2" name="num2">
        <input type="submit">
    </form>
</div>
</body>
</html>