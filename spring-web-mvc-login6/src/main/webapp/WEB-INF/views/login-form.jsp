```jsp
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">

<title>Amazon Login</title>

<style>

    /* Page Background */
    body {
        margin: 0;
        padding: 0;
        font-family: Arial, Helvetica, sans-serif;
        background-color: #eaeded;
    }

    /* Amazon Header */
    .header {
        height: 70px;
        background-color: #131921;
        display: flex;
        align-items: center;
        justify-content: center;
    }

    .logo {
        color: white;
        font-size: 32px;
        font-weight: bold;
    }

    .logo span {
        color: #ff9900;
    }

    /* Login Box */
    .login-box {
        width: 350px;
        margin: 50px auto;
        background-color: white;
        padding: 30px;
        border: 1px solid #ddd;
        border-radius: 8px;
        box-shadow: 0 2px 8px rgba(0, 0, 0, 0.15);
    }

    /* Heading */
    .login-box h1 {
        font-size: 28px;
        font-weight: 400;
        color: #111;
        margin-bottom: 25px;
    }

    /* Labels */
    label {
        display: block;
        font-size: 14px;
        font-weight: bold;
        color: #111;
        margin-bottom: 8px;
    }

    /* Input Fields */
    input[type="text"],
    input[type="password"] {
        width: 100%;
        height: 40px;
        padding: 8px 10px;
        margin-bottom: 20px;
        border: 1px solid #888;
        border-radius: 4px;
        font-size: 15px;
        outline: none;
    }

    input[type="text"]:focus,
    input[type="password"]:focus {
        border: 2px solid #ff9900;
        box-shadow: 0 0 5px rgba(255, 153, 0, 0.5);
    }

    /* Login Button */
    input[type="submit"] {
        width: 100%;
        height: 42px;
        background-color: #ffd814;
        border: 1px solid #fcd200;
        border-radius: 20px;
        font-size: 15px;
        cursor: pointer;
        color: #111;
    }

    input[type="submit"]:hover {
        background-color: #f7ca00;
    }

    /* Terms */
    .terms {
        margin-top: 25px;
        font-size: 12px;
        line-height: 18px;
        color: #555;
    }

    .terms a {
        color: #0066c0;
        text-decoration: none;
    }

    .terms a:hover {
        color: #c45500;
        text-decoration: underline;
    }

    /* Divider */
    .divider {
        display: flex;
        align-items: center;
        margin: 25px 0 20px;
        color: #777;
        font-size: 12px;
    }

    .divider::before,
    .divider::after {
        content: "";
        flex: 1;
        border-top: 1px solid #ddd;
    }

    .divider span {
        padding: 0 10px;
    }

    /* Create Account Button */
    .create-account {
        width: 100%;
        height: 40px;
        background-color: white;
        border: 1px solid #888;
        border-radius: 4px;
        font-size: 14px;
        cursor: pointer;
    }

    .create-account:hover {
        background-color: #f7f7f7;
    }

    /* Footer */
    .footer {
        background-color: #131a22;
        color: #ddd;
        text-align: center;
        padding: 25px;
        font-size: 12px;
    }

    .footer a {
        color: #8eb7d9;
        margin: 0 10px;
        text-decoration: none;
    }

</style>

</head>

<body>

    <!-- Amazon Header -->
    <div class="header">
        <div class="logo">
            amazon<span>.in</span>
        </div>
    </div>


    <!-- Login Box -->
    <div class="login-box">

        <h1>Sign in</h1>

        <form action="" method="post">

            <label for="username">
                Email or mobile phone number
            </label>

            <input type="text"
                   id="username"
                   name="username"
                   placeholder="Enter email or mobile number"
                   required>


            <label for="password">
                Password
            </label>

            <input type="password"
                   id="password"
                   name="password"
                   placeholder="Enter password"
                   required>


            <input type="submit"
                   value="Sign in">


            <div class="terms">
                By continuing, you agree to Amazon's
                <a href="#">Conditions of Use</a>
                and
                <a href="#">Privacy Notice</a>.
            </div>

        </form>


        <div class="divider">
            <span>New to Amazon?</span>
        </div>


        <button class="create-account">
            Create your Amazon account
        </button>

    </div>


    <!-- Footer -->
    <div class="footer">

        <a href="#">Conditions of Use</a>

        <a href="#">Privacy Notice</a>

        <a href="#">Help</a>

        <br><br>

        © 2026 Amazon-style E-Commerce Project

    </div>

</body>
</html>