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

        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

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

    <jsp:include page="bar.jsp" />

        <h1>FAP</h1>

        <h3>Semester: </h3>
        <c:forEach items="${listSemester}" var="semester">
            <a href="http://localhost:8080/fap/subject/view/${semester.semesterId}">${semester.semesterName}</a>
            <br>
        </c:forEach>

        <h1>Subject: </h1>
                <table>
                    <tr>
                        <th>subject code</th>
                        <th>subject name</th>
                        <th>major</th>
                        <th>semester</th>
                    </tr>
                    <c:forEach items="${listSubject}" var="subject">
                        <tr>
                            <td>${subject.subjectCode}</td>
                            <td>${subject.subjectName}</td>
                            <td>${subject.majorId.majorName}</td>
                            <td>${subject.semesterId.semesterName}</td>
                        </tr>
                    </c:forEach>
                </table>
    </body>
</html>
