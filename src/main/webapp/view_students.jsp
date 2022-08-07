<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

    <c:forEach var="tempStudent" items="${student_list}">
        ${tempStudent} <br/>
    </c:forEach>
    <p><a href="index.html">Back to list</a></p>
</body>
</html>
