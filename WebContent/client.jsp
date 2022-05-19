<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Client</title>
</head>
<body>
<jsp:useBean id="client" class="beans.ClientBean" scope="session"></jsp:useBean>
Client crée avec succès ! <br>
<h2>
Nom: <jsp:getProperty property="nom" name="client"/> <br><br>
Prénom: <jsp:getProperty property="prenom" name="client"/> <br><br>
Adresse: <jsp:getProperty property="adresseL" name="client"/> <br><br>
Téléphone: <jsp:getProperty property="numT" name="client"/><br><br>
Email: <jsp:getProperty property="email" name="client"/>
</h2>
</body>
</html>