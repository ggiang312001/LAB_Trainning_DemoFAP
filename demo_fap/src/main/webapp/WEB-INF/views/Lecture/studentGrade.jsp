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
        <h3>${classs.className}</h3>
        <br> 
        <form action="studentGrades/add" method="get">
            <input type="hidden" name="semesterId" value = "${semester.semesterId}">
            <input type="hidden" name="subjectId" value = "${subject.subjectId}">
            <input type="hidden" name="classId" value = "${classs.classId}">
            <input type="submit" value="Add Grade">
        </form>
        <br>
        <table border="1px">
            <tr>
                <th>Student ID</th>
                <th>Student Name</th>
                <c:forEach items="${listGrade}" var="grade">
                    <th>${grade.gradeName}</th>
                </c:forEach>
<!--                <th>Assignment 1</th>
                <th>Assignment 2</th>
                <th>Assignment 3</th>
                <th>Progress Test 1</th>
                <th>Progress Test 2</th>
                <th>Group Project</th>
                <th>Practical Exam</th>
                <th>Final Exam</th>-->
                <th>Action</th>
            </tr>
            
            <c:forEach items="${listStudent}" var="student">
                <tr>
                    <td>${student.userCode}</td>
                    <td>${student.username}</td>
                    <c:forEach items="${listGrade}" var="grade">
                        
                        <c:forEach items="${listStudentGrade}" var="studentgrade">
                            <c:if test="${studentgrade.studentId.userId == student.userId && studentgrade.gradeId.gradeId == grade.gradeId }">
                                <td>${studentgrade.value}</td>
                            </c:if>
                            
                        </c:forEach>
                    </c:forEach>
                    <td><a>Edit</a></td>           
                </tr>
            </c:forEach>
        </table>
        
    </body>
</html>

