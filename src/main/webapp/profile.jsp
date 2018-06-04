<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
    <title>${param.title}</title>
</head>
<body>
    <jsp:include page="partials/navbar.jsp" />

    <h1 style="text-align: center">Howdy ${username}</h1>
    <div class="container">
        <h1>Viewing your profile.</h1>
    </div>

</body>
</html>
