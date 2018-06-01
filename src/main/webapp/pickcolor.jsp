<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <link rel="stylesheet" href="<c:url value="color.css"/>"/>
</head>
<body>
<h1 style="text-align: center">Enter color</h1>
<div style="text-align: center">
    <form action="/pickcolor" method="POST">
        <label for="color">Enter your color</label>
        <input type="text" id="color" name="color">
        <input type="submit">
    </form>
</div>
</body>
</html>