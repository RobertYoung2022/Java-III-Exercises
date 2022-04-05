<%--
  Created by IntelliJ IDEA.
  User: bobbyworld
  Date: 4/5/22
  Time: 2:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    // the default ... if there are no cookies
    String favLang = "Java";

    // get the cookies from the browser request
    Cookie[] theCookies = request.getCookies();

    // find our favorite language cookie
    if(theCookies != null) {
        for (Cookie tempCookie : theCookies) {
            if ("language".equals(tempCookie.getName())) {
                favLang = tempCookie.getValue();
                break;
            }
        }
    }

%>
</body>
</html>
