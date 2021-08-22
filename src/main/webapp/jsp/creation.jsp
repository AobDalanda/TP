<%--
  Created by IntelliJ IDEA.
  User: bsidy
  Date: 19/08/2021
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <title> Add user</title>
</head>
<body>
<%@ include file="menu.jsp" %>
<h1>Crée un utilisateur</h1>
<form:form action="submit-superhero" method="POST" modelAttribute="heroFormular">
    <form:label path="pseudonyme">Pseudo :</form:label>
    <form:input path="pseudonyme" placeholder="Votre pseudo" required="required"/>
    <br>
    <form:label path="prenom">Prenom :</form:label>
    <form:input path="prenom" placeholder="Votre prenom" required="required"/>
    <br>
    <form:label path="nom">Nom :</form:label>
    <form:input path="nom" placeholder="Votre nom" required="required"/>
    <br>
    <form:label path="categorie">Categorie:</form:label>
    <form:select path="categorie" placeholder="Votre " required="required">
        <form:option value=" ">Votre catégorie </form:option>
        <c:forEach items="${categories}" var="categoryitem">
            <form:option value="${categoryitem}">${categoryitem.name} </form:option>
        </c:forEach>
    </form:select>
    <br>
    <form:label path="birthday">Date de naissance :</form:label>
    <form:input path="birthday" type="Date" required="required"/>
    <br>
    <form:button class="button">Ajouter</form:button>
</form:form>
</body>
</html>