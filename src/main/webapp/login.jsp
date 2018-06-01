<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%
    if("POST".equals(request.getMethod())){
        String user = request.getParameter("user");
        String password = request.getParameter("password");
        if (user.equalsIgnoreCase("admin") && password.equalsIgnoreCase("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>
<html>
    <head>
        <title>Login Form</title>
    </head>
    <body>
        <div style="text-align: center; border: 1px solid #000000">
        <h1>Log in Form</h1>
        <form action="login.jsp" method="POST">
            <div style="margin-bottom: 25px">
            <label for="login">Enter your User name</label>
            <input id="login" type="text" name="user"><br>
            </div>
            <div>
            <label for="password">Enter your password</label>
            <input id="password" type="password" name="password">
                <input type="submit">
            </div>
        </form>
        </div>
    </body>
</html>