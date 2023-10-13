<%-- 
    Document   : hello
    Created on : Oct 10, 2023, 9:18:51 PM
    Author     : kennybk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <title>JSP Page</title>
        <style>
            .mainDiv {
                display: flex;
                min-height: 100%;
                align-items: center;
                justify-content: center;
                background-color: #f9f9f9;
                font-family: 'Open Sans', sans-serif;
            }
            .cardStyle {
                width: 500px;
                border-color: white;
                background: #fff;
                padding: 36px 0;
                border-radius: 4px;
                margin: 30px 0;
                box-shadow: 0px 0 2px 0 rgba(0,0,0,0.25);
            }
            #signupLogo {
                max-height: 100px;
                margin: auto;
                display: flex;
                flex-direction: column;
            }
            .formTitle{
                font-weight: 600;
                margin-top: 20px;
                color: #2F2D3B;
                text-align: center;
            }
            .inputLabel {
                font-size: 12px;
                color: #555;
                margin-bottom: 6px;
                margin-top: 24px;
            }
            .inputDiv {
                width: 70%;
                display: flex;
                flex-direction: column;
                margin: auto;
            }
            input {
                height: 40px;
                font-size: 16px;
                border-radius: 4px;
                border: none;
                border: solid 1px #ccc;
                padding: 0 11px;
            }
            input:disabled {
                cursor: not-allowed;
                border: solid 1px #eee;
            }
            .buttonWrapper {
                margin-top: 40px;
            }
            .submitButton {
                width: 70%;
                height: 40px;
                margin: auto;
                display: block;
                color: #fff;
                background-color: #065492;
                border-color: #065492;
                text-shadow: 0 -1px 0 rgba(0, 0, 0, 0.12);
                box-shadow: 0 2px 0 rgba(0, 0, 0, 0.035);
                border-radius: 4px;
                font-size: 14px;
                cursor: pointer;
            }
            .submitButton:disabled,
            button[disabled] {
                border: 1px solid #cccccc;
                background-color: #cccccc;
                color: #666666;
            }
        </style>

    </head>
    <body>
        <div class="mainDiv">
            <div class="cardStyle">
                <form action="/fap/changepassword" method="post" name="signupForm" id="signupForm">

                    <img src="" id="signupLogo"/>

                    <h2 class="formTitle">
                        Change Password
                    </h2>

                    <div class="inputDiv">
                        <label class="inputLabel" for="password">New Password</label>
                        <input type="password" id="password" name="password" required>
                    </div>

                    <div class="inputDiv">
                        <label class="inputLabel" for="confirmPassword">Confirm Password</label>
                        <input type="password" id="confirmPassword" name="confirmPassword">
                    </div>

                    <div class="buttonWrapper">
                        <button type="submit" id="submitButton" onclick="validateSignupForm()" class="submitButton pure-button pure-button-primary">
                            <span>Continue</span>

                        </button>
                    </div>

                </form>
            </div>
        </div>
    </body>
    <script>
        var password = document.getElementById("password")
                , confirm_password = document.getElementById("confirmPassword");


        enableSubmitButton();

        function validatePassword() {
            if (password.value != confirm_password.value) {
                confirm_password.setCustomValidity("Passwords Don't Match");
                return false;
            } else {
                confirm_password.setCustomValidity('');
                return true;
            }
        }

        password.onchange = validatePassword;
        confirm_password.onkeyup = validatePassword;

        function enableSubmitButton() {
            document.getElementById('submitButton').disabled = false;

        }

        function disableSubmitButton() {
            document.getElementById('submitButton').disabled = true;

        }

        function validateSignupForm() {
            var form = document.getElementById('signupForm');

            for (var i = 0; i < form.elements.length; i++) {
                if (form.elements[i].value === '' && form.elements[i].hasAttribute('required')) {
                    console.log('There are some required fields!');
                    return false;
                }
            }

            if (!validatePassword()) {
                return false;
            }


        }


    </script>
</html>
