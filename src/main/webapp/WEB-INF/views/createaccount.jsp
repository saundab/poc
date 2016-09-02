<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Create a new account</h1>
        <p>Create a new account!</p>
        
        <form:form modelAttribute="UserVO" action="account/new">
        	<form:input path="username"/>
        	<form:input path="password"/>
        	<button type="submit">Create</button>
        </form:form>
        
    </body>
</html>
