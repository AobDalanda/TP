<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://www.springframework.org/tags/
form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${heroliste }</title>
</head>
<body>
<%@ include file="menu.jsp" %>

<form action="/form" method="post">
    <div>
        <label for="name">Pseudo:</label>
        <input type="text" id="name" name="user_pseudoe">
    </div>
        <div>
        <label for="name">Nom:</label>
        <input type="text" id="name" name="user_nom">
    </div>
    <div>
        <label for="surname">Prenom :</label>
        <input type="text" id="surname"  name="user_prenom">
    </div>
    <div>  
		<select name="categorie" id="categorie">
           <c:foreach items="${categories}" var "category">
                <option> ${category.name}</option>
           </c:foreach>
		</select>
		
    </div>
    
    
    
    
    <div class="button">
        <button type="submit">Envoyer</button>
    </div>
</form>



</body>
</html>