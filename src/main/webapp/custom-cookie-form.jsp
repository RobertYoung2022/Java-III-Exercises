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
    <h1>Cookies Practice</h1>
<%--    action is the servlet name--%>
    <form action="/cookies-personalize-response.jsp" method="POST">
        <label for="language">Choose your favorite programming language:</label>

        <select name="language" id="language">
            <option value="html">HTML5</option>
            <option value="css">CSS3</option>
            <option value="javascript">Javascript</option>
            <option value="java">Java</option>
        </select>
        <input type="submit" value="Submit">
    </form>
</div>
</body>
</html>
