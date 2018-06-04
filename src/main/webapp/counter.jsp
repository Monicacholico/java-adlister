<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Welcome to my site!" />
    </jsp:include>
</head>
<body>
<h1>Count: ${counter}</h1>

<h2><a href="/count?reset=true">Reset the counter</a></h2>

</div>
</body>
</html>
