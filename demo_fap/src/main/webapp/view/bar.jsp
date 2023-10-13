<%-- 
    Document   : hello
    Created on : Oct 10, 2023, 9:18:51 PM
    Author     : kennybk
--%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<nav class="navbar navbar-expand-lg bg-body-tertiary bg-dark text-white">
  <div class="container-fluid ">
    <a class="navbar-brand text-white" href="http://localhost:8080/fap/hello">F A P</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse " id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0 ">
        <li class="nav-item">
           <a class="nav-link text-white" href="http://localhost:8080/fap/user/class">Class</a>
        </li>

        <li class="nav-item">
            <a class="nav-link text-white" href="http://localhost:8080/fap/user/grade/1">Grade</a>
        </li>

        <li class="nav-item">
            <a class="nav-link text-white" href="http://localhost:8080/fap/subject/view/1">Subject</a>
        </li>

      </ul>
      <form class="d-flex" role="search">
        <a class="btn btn-outline-success text-white" href="http://localhost:8080/fap/user/profile">User Profile</a>
      </form>
    </div>
  </div>
</nav>