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
    <div class="container">
        <div class="mt-4 p-5 bg-secondary text-white rounded">
          <h1>Class member</h1>

        </div>

        <div class="col-bg-11 p-5 text-white">
                <table class="table table-borderless table-hover table-striped ">
                                    <tr class="table-secondary">
                                        <th>img</th>
                                        <th>student code</th>
                                        <th>student name</th>
                                        <th>date of birth</th>
                                        <th>gender</th>
                                        <th>address</th>
                                        <th>email</th>
                                        <th>class</th>

                                    </tr>
                                    <c:forEach items="${classMember}" var="member">
                                        <tr>
                                            <td>
                                                <img class="rounded-circle" width="80px" src="${member.img}">
                                            </td>
                                            <td>${member.userCode}</td>
                                            <td>${member.username}</td>
                                            <td>${member.dob}</td>
                                            <td>${member.gender}</td>
                                            <td>${member.address}</td>
                                            <td>${member.email}</td>
                                            <td>${member.classId.className}</td>
                                        </tr>
                                    </c:forEach>
                        </table>
        </div>
    </div>
    </body>
</html>
