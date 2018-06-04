<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays"%>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<%@ page contentType="text/html; charset=UTF-8" language="java"%>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset =UFT-8">
    <title>ADS!</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous" />
</head>
<body>

<c:forEach var="ad" items="${ads}">
    <h1 class="bg-dark text-light text-center">${ad.title}</h1>
    <p class="bg-primary text-light text-justify">${ad.description}</p>
        </c:forEach>
</body>
</html>
