<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>

</head>
<body>
<h1 style="text-align: center">Enter Name</h1>
<div style="text-align: center">
<form action="/name" method="POST">
    <label for="name">Enter your name</label>
    <input type="text" id="name" name="name">
    <input type="submit">
</form>
</div>
</body>
</html>