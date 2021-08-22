<%--
  Created by IntelliJ IDEA.
  User: bsidy
  Date: 19/08/2021
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
    <title>Add super power</title>
</head>
<body>
<%@ include file="menu.jsp" %>
            <h1>Ajouter un pouvoir</h1>
            <form:form action="submit-superpower" method="POST" modelAttribute="powerFormular">
                <form:label path="name">Nom du pouvoir :</form:label>
                <form:input path="name"  placeholder="Le nom du pouvoir"  maxlength="15" required="required" />
                <br>
                <form:label path="description"  >Description :</form:label>
                <form:textarea  path="description" rows = "5" cols = "30" placeholder="Description du pouvoir " maxlength="75" required="required"  />
                <br>
                <form:label path="maxscore">Points requis :</form:label>
                <form:input path="maxscore" placeholder="Votre nom" type="number" min="50"/>
                <br>
                <form:button class="button">Ajouter</form:button>
            </form:form>
       <c:if test="${not empty  listepower}">
           <h1>Liste des pouvoirs</h1>
       </c:if>
         <table>
             <tr>
                 <c:if test="${not empty  listepower}">
                     <thead>
                     <tr><th>N°</th><th>Nom</th><th>Description</th><th>Points requis</th><th>Action</th></tr>
                     </thead>
                 </c:if>
             </tr>
            <c:forEach items="${listepower}" var="poweritem" varStatus="status">
                <form:form action="delete-superpower" method="POST" modelAttribute="powerFormular">
                    <tbody>
                    <tr>
                        <td>${status.count}</td>
                        <td>${poweritem.name}</td>
                        <td>${poweritem.description}</td>
                        <td>${poweritem.maxscore}</td><form:input path="id"  type="hidden" value="${poweritem.id}"/>
                        <td><form:button class="button">Supprimer</form:button></td>
                    </tr>
                    </tbody>

                </form:form>
            </c:forEach>
    </table>





</body>
</html>
