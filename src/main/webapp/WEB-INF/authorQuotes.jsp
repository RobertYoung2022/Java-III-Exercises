<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Quotes from Artist</title>
</head>
<body>
    <c:forEach var="quote" items ="${quoteListView}">
        <p>${quote}</p>
    </c:forEach>
</body>
</html>
