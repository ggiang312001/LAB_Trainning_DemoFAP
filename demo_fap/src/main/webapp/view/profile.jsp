<%-- 
    Document   : hello
    Created on : Oct 10, 2023, 9:18:51 PM
    Author     : kennybk
--%>

<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="fmt" uri="jakarta.tags.fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

    <title>User Profile</title>
    <style>
        body {
            background: rgb(99, 39, 120)
        }

        .form-control:focus {
            box-shadow: none;
            border-color: #BA68C8
        }

        .profile-button {
            background: rgb(99, 39, 120);
            box-shadow: none;
            border: none
        }

        .profile-button:hover {
            background: #682773
        }

        .profile-button:focus {
            background: #682773;
            box-shadow: none
        }

        .profile-button:active {
            background: #682773;
            box-shadow: none
        }

        .back:hover {
            color: #682773;
            cursor: pointer
        }

        .labels {
            font-size: 11px
        }

        .add-experience:hover {
            background: #BA68C8;
            color: #fff;
            cursor: pointer;
            border: solid 1px #BA68C8
        }
    </style>

</head>

<body>
    <div class="container rounded bg-white mt-5 mb-5">
        <div class="row">
            <div class="col-md-3 border-right">
                <div class="d-flex flex-column align-items-center text-center p-3 py-5">
                    <img class="rounded-circle mt-5" width="150px"
                        src="https://st3.depositphotos.com/15648834/17930/v/600/depositphotos_179308454-stock-illustration-unknown-person-silhouette-glasses-profile.jpg">
                        <span class="font-weight-bold">${user.userName}</span>
                        <span class="text-black-50">${user.email}</span>
                        <span> </span>
                </div>
            </div>
            <div class="col-md-5 border-right">
                <div class="p-3 py-5">
                    <div class="d-flex justify-content-between align-items-center mb-3">
                        <h4 class="text-right">Profile</h4>
                    </div>
                    <div class="row mt-2">
                        <div class="col-md-6"><label class="labels">User Code</label><input type="text" class="form-control"
                                placeholder="user code" value="${user.userCode}" disabled></div>

                        <div class="col-md-6"><label class="labels">User Name</label><input type="text"
                                class="form-control" value="${user.userName}" placeholder="user name" disabled></div>
                    </div>

                    <div class="row mt-3">
                        <div class="col-md-12"><label class="labels">Date of birth</label><input type="text"
                                class="form-control" placeholder="enter Date of birth" value="${user.dob}" disabled></div>

                        <div class="col-md-12"><label class="labels">Gender</label><input type="text"
                                class="form-control" placeholder="enter gender" value="${user.gender}" disabled></div>

                        <div class="col-md-12"><label class="labels">Address</label><input type="text"
                                class="form-control" placeholder="enter address" value="${user.address}" disabled></div>

                        <div class="col-md-12"><label class="labels">Role</label><input type="text"
                                class="form-control" placeholder="enter role" value="${user.roleId.roleName}" disabled></div>


                    </div>
                    <div class="row mt-3">
                        <div class="col-md-6"><label class="labels">Country</label><input type="text"
                                class="form-control" placeholder="country" value=""></div>
                        <div class="col-md-6"><label class="labels">State/Region</label><input type="text"
                                class="form-control" value="" placeholder="state"></div>
                    </div>
                    <!-- <div class="mt-5 text-center"><button class="btn btn-primary profile-button" type="button">Save
                            Profile</button></div> -->
                </div>
            </div>

            <div class="col-md-4">
                <div class="p-3 py-5">
                    <div class="d-flex justify-content-between align-items-center experience">
                        <span>Edit
                            Profile
                        </span>
                        <span class="border px-3 p-1 add-experience">
                                <i class="fa fa-plus"></i>&nbsp;Edit
                        </span>
                    </div>
                    <br>

                    <div class="col-md-12"><label class="labels">Other information</label><input type="text"
                            class="form-control" placeholder="___" value=""></div> <br>
                    <div class="col-md-12"><label class="labels">Additional Details</label><input type="text"
                            class="form-control" placeholder="additional details" value=""></div>
                </div>
            </div>
        </div>
    </div>
    </div>
    </div>
</body>

</html>