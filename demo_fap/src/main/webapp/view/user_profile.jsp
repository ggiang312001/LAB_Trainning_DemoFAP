<%-- 
    Document   : hello
    Created on : Oct 10, 2023, 9:18:51 PM
    Author     : kennybk
--%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>User profile</title>
        <style>
                    table {
                        border-collapse: collapse;
                    }
                    td, th {
                        width: 10%;
                        border: 1px solid black;

                    }
                </style>
    </head>
    <body>
        <h1>FAP</h1>

        <table>
                    <tr>
                        <th>user code</th>
                        <th>user name</th>
                        <th>img</th>
                        <th>date of birth</th>
                        <th>gender</th>
                        <th>address</th>
                        <th>email</th>
                        <th>role</th>

                    </tr>
                    <c:forEach items="${userList}" var="user">
                        <tr>
                            <td>${user.userCode}</td>
                            <td>${user.userName}</td>
                            <td>${user.img}</td>
                            <td>${user.dob}</td>
                            <td>${user.gender}</td>
                            <td>${user.address}</td>
                            <td>${user.email}</td>
                            <td>${user.roleId.roleName}</td>
                        </tr>
                    </c:forEach>
        </table>

        

    </body>
</html>
