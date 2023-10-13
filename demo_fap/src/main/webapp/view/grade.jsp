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

        <title>Class</title>

    </head>
    <body>

    <jsp:include page="bar.jsp" />
        <h1>FAP</h1>


        <br>
        <h1>Subject: </h1>
        <ul class="nav justify-content-left">
            <c:forEach items="${listSubject}" var="subject">
                    <li class="nav-item">
                        <a class="nav-link h4" href="<c:url value='/user/grade/${subject.subjectId}'/>">${subject.subjectName}</a>

                    </li>
            </c:forEach>
        </ul>

        <h3>Grade of subject : </h3>
        <div class="col-bg-11 text-white container-fluid">
                <table class="table table-borderless table-hover table-border">
                                    <tr class="table-secondary">
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
        </div>
    </body>
</html>
