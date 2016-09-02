<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
      	<script type="text/javascript" src="resources/js/home.js"></script>
      	<script src="http://code.jquery.com/jquery-1.11.0.min.js"></script>
    	<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js"></script>
    	
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Welcome</h1>
        
	    Session Key - <label id="sessionKey" >${sessionKey}</label>
        <br/><br/><br/>
        <form:form id="userlogin" modelAttribute="UserVO" action="login">
        	<form:input path="username"/>
        	<form:input path="password"/>
        	<button type="submit">Login</button>
        </form:form>
        
        <form:form action="createAccount" method="get">
        	<button type="submit" >Create Account</button>
        </form:form>
    </body>
</html>

<script>
	$('document').ready(function(){
		account.login();	
	});
</script>