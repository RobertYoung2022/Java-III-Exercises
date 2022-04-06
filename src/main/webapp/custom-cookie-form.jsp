<%--
  Created by IntelliJ IDEA.
  User: bobbyworld
  Date: 4/5/22
  Time: 12:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customize your Settings</title>
</head>
<body>
<div>
    <h2>Pick Your Language:</h2>
<%--    action is the servlet name--%>

    <div class="radio">
        <label>
            <input type="radio" name="language" value="java" checked>
            Java
        </label>
    </div>
    <div class="radio">
        <label>
            <input type="radio" name="language" value="html">
            HTML
        </label>
    </div>
    <div class="radio">
        <label>
            <input type="radio" name="language" value="css">
            CSS
        </label>
    </div>
    <div class="radio">
        <label>
            <input type="radio" name="language" value="javascript">
            Javascript
        </label>
    </div>
    <button type="submit">Submit</button>
</body>
</html>
