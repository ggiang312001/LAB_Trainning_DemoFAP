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
        <title>Class</title>
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


        <br>
        <h1>Subject: </h1>

        <c:forEach items="${listSubject}" var="subject">
            <li>
                <a href="http://localhost:8080/fap/user/grade/${subject.subjectId}">${subject.subjectName}</a>
            </li>
        </c:forEach>


        <h3>Grade of subject : </h3>
                <table>
                                    <tr>
                                        <th>grade category</th>
                                        <th>grade name</th>
                                        <th>weight</th>
                                        <th>Value</th>

                                        <th>subjectName</th>

                                    </tr>
                                    <c:forEach items="${studentGrade}" var="grade">
                                        <tr>
                                            <td>${grade.gradeId.gradeCategoryId.gradeName}</td>
                                            <td>${grade.gradeId.gradeName}</td>
                                            <td>${grade.gradeId.weight}</td>
                                            <td>${grade.value}</td>

                                            <td>${grade.subjectId.subjectName}</td>
                                        </tr>
                                    </c:forEach>
                        </table>
    </body>
</html>
