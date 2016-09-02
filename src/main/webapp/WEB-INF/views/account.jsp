<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
    <head>
      <script type="text/javascript" src="resources/js/home.js"></script>
    
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home</title>
    </head>
    <body>
        <h1>Welcome ${username}</h1>
        <p>This is your homepage!</p>
        
        <label id="sessionKey">${sessionKey}</label>
		
		<br/><br/><br/>

		<button type="button" onclick="window.location='account/logout';">Logout</button>
		<br/><br/><br/>

		<form:form action="account/logout" method="get">
			<button type="submit">Form Logout</button>
		</form:form>
		
    </body>
</html>
