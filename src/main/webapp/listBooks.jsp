<%--
  Created by IntelliJ IDEA.
  User: souravmodak
  To change this template use File | Settings | File Templates.
--%>
<%--<%@ page contentType="text/html;charset=UTF-8" language="java" %>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>Title</title>--%>
<%--</head>--%>
<%--<body>--%>

<%--</body>--%>
<%--</html>--%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
  <title>Book List</title>
</head>
<body>
<h2>Book List</h2>
<c:forEach var="book" items="${books}">
  <p>${book.title} by ${book.author} - $${book.price}</p>
</c:forEach>
<a href="book">Add New Book</a>
</body>
</html>