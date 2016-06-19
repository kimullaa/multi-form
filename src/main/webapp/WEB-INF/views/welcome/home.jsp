<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Home</title>
    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/resources/app/css/styles.css">
</head>
<body>

<div id="wrapper">
    <h1>複数入力画面</h1>
    <form:form method="post" action="${pageContext.request.contextPath}/entry" modelAttribute="parentForm">
        <c:forEach items="${parentForm.userFormList}" varStatus="rowStatus" var="item">
            <form:input path="userFormList[${rowStatus.index}].familyName"/>
            <form:errors path="userFormList[${rowStatus.index}].familyName"/>
            <form:input path="userFormList[${rowStatus.index}].givenName"/>
            <form:errors path="userFormList[${rowStatus.index}].givenName"/>
            <br>
        </c:forEach>
        <input type="submit" value="send"/>
    </form:form>

</div>

</body>
</html>
