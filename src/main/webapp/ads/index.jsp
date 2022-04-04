<%--
  Created by IntelliJ IDEA.
  User: bobbyworld
  Date: 4/4/22
  Time: 1:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/ads/" method="POST">
    <label for="name">Name</label>
    <input name="name" id="name" type="text">
    <br>
    <label for="price">Price</label>
    <input name="price" id="price" type="text">
    <br/>
    <input type="submit">
</form>
</body>
</html>
