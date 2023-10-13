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
        <title>Subject</title>
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

        <h3>Class member: </h3>


        <h1>Subject: </h1>
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
                                    <c:forEach items="${classMember}" var="member">
                                        <tr>
                                            <td>${member.userCode}</td>
                                            <td>${member.username}</td>
                                            <td>${member.img}</td>
                                            <td>${member.dob}</td>
                                            <td>${member.gender}</td>
                                            <td>${member.address}</td>
                                            <td>${member.email}</td>
                                            <td>${member.roleId.roleName}</td>
                                        </tr>
                                    </c:forEach>
                        </table>
    </body>
</html>
