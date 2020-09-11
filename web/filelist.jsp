<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Chris
  Date: 10/1/2019
  Time: 3:04 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>FileDrop</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.css">
    <script src="bootstrap/js/bootstrap.js"></script>
</head>
<body>
${ipadd}
<table class="table table-striped table-hover" style="text-align: center;width: 100%;" align="center">
    <c:forEach var="file" items="${files}" varStatus="idxStatus">
        <tr>
            <td><p style="font-size: 5em;padding-left: 20px;">${idxStatus.index+1}</p></td>
            <td><p style="font-size: 2em;padding-top: 1.5em"><b>${file}</b></p></td>
            <td><a class="btn btn-success btn-lg" href="http://192.168.137.1:8080/media/${file}" style="width: 200px;height: 1.5em;font-size: 5em;border-radius: 30px;padding-right: 20px;">下载</a></td>
        </tr>
    </c:forEach>
</table>
</body>

</html>
