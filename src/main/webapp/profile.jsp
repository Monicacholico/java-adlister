<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<%
    String message = "";
    // check to see if the form was submitted
    if("POST".equals(request.getMethod())) {
        String name = request.getParameter("name");
        if(name.equalsIgnoreCase("bob")) {
            message = "OMG, It's Bob, I've heard so much about you. Welcome!";
        } else {
            message = "Hello, " + name + " it is nice to meet you.";
        }
    }
%>

<html>
<head>
    <title>This is your profile</title>
</head>
    <h1>Hello! This is your profile!</h1>
</html>