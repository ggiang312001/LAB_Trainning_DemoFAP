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
        <h1>List Grade</h1>
        <br> 
        <h3>${semester.semesterName}</h3>
        <br> 
        <h3>${subject.subjectName}</h3>
        <br> 
        <h3>${class.className}</h3>
        <br> 
        <table>
            <tr>
                <th>Header</th>
                <th>Header2</th>
            </tr>
            <tr>
                <td>Cell1</td>
                <td>Cell2</td>
            </tr>
            <tr>
                <td>Cell3</td>
                <td>Cell4</td>
            </tr>
        </table>
        
    </body>
</html>

