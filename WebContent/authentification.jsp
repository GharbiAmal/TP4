<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Bienvenu a votre session</h1>

<% if ((request.getParameter("Nom").equals(""))&& (request.getParameter("Prenom").equals(""))) { %>
<jsp:useBean id="ab" class="beans.AuthentificationBean" scope="session"></jsp:useBean>
Nom: <jsp:getProperty property="nom" name="ab"/> <br><br>
Prénom: <jsp:getProperty property="prenom" name="ab"/> <br><br>
<%} else { %>


<h2>
Nom: <%= request.getParameter("Nom") %> <br><br>
Prénom: <%= request.getParameter("Prenom") %> <br><br>

<%} %>
</body>
</html>