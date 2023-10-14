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
        <h1>Add Grade</h1>
        <br> 
        <h3>${semester.semesterName}</h3>
        <br> 
        <h3>${subject.subjectName}</h3>
        <br> 
        <h3>${classs.className}</h3>
        <br><!-- comment -->
        <form action="studentGrades/addGrade" >
            <input type="hidden" name="semesterId" value="${semester.semesterId}">
            <input type="hidden" name="subjectId" value="${subject.subjectId}">
            <input type="hidden" name="classId" value="${classs.classId}">
            <table>
                <tr>
                    <td><label>Student</label></td>
                    <td><input type="text" name="studentId"></td>
                </tr>
                <tr>
                    <td><label>Grade</label></td>
                    <td><input type="text" name="gradeId"></td>
                </tr>
                <tr>
                    <td><label>Value</label></td>
                    <td><input type="text" name="value"></td>
                </tr>
            </table>
            <input type="submit" value="Add">
        </form>
    </body>
</html>

