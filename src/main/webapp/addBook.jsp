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
    <title>Add Book</title>
</head>
<body>
<form action="book" method="post">
    <input type="hidden" name="method" value="cdi" />
    <input type="text" name="isbn" placeholder="ISBN" required />
    <input type="text" name="title" placeholder="Title" required />
    <input type="text" name="author" placeholder="Author" required />
    <input type="number" name="price" placeholder="Price" required />
    <button type="submit">Add Book Using CDI</button>
</form>
<a href="book?action=list">View Book List</a>
</body>
</html>