<%-- 
    Document   : Subject
    Created on : Oct 12, 2023, 3:22:27 AM
    Author     : phamminhgiang
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <h1>List Subject</h1>
            <br><!-- comment -->
            <h3>${semester.semesterName}</h3>
            <br>><!-- comment -->
            <ul>
            <c:forEach items="${listSubject}" var="item">
                <li>
                    <a href=""<c:url value='/subject/${item.subjectId}'/>"">${item.subjectName}</a>  
                </li>
            </c:forEach>
        </ul>
        </body>
    </html>

