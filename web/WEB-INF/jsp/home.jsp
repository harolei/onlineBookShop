<%--
  Created by IntelliJ IDEA.
  User: leiyu
  Date: 13-1-9
  Time: 下午2:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Online Book Shop</title>
</head>
<body>
   <h2>Welcome to Online Book Shop!</h2>
   <h3>Books in the store:</h3>
   <ul>
       <c:forEach items="${books}" var="Book">
           <li>
               <c:out value="${Book.bookName}"/> /
               <c:out value="${Book.price}"/> /
               <c:out value="${Book.author}"/>
           </li>
       </c:forEach>
   </ul>
</body>
</html>