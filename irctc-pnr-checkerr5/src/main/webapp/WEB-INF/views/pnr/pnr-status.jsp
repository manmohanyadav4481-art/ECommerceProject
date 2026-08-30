<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>PNR Status</title>

<style>

body {
    margin: 0;
    font-family: Arial, sans-serif;
    background-color: #eef4fb;
}

.header {
    background-color: #0b3d91;
    color: white;
    text-align: center;
    padding: 20px;
}

.status-box {
    width: 550px;
    margin: 80px auto;
    padding: 40px;
    background-color: white;
    text-align: center;
    border-radius: 10px;
    box-shadow: 0px 4px 18px rgba(0,0,0,0.18);
}

.status-box h2 {
    color: #0b3d91;
}

.status {
    display: inline-block;
    margin-top: 20px;
    padding: 12px 30px;
    background-color: #fff3cd;
    color: #856404;
    border-radius: 6px;
    font-size: 24px;
    font-weight: bold;
}

.back-button {
    display: inline-block;
    margin-top: 30px;
    padding: 12px 30px;
    background-color: #0b3d91;
    color: white;
    text-decoration: none;
    border-radius: 5px;
}

</style>

</head>

<body>

<div class="header">

    <h1>INDIAN RAILWAYS</h1>
    <p>IRCTC - PNR STATUS</p>

</div>

<div class="status-box">

    <h2>PNR STATUS</h2>

    <p>Your current status is:</p>

    <div class="status">
        WL - 49
    </div>

    <br>

    <a href="index.jsp" class="back-button">
        Check Another PNR
    </a>

</div>

</body>
</html>