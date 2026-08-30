<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!DOCTYPE html>

<html>
<head>

<meta charset="UTF-8">

<title>IRCTC PNR Status</title>

<style>

    * {
        box-sizing: border-box;
    }

    body {
        margin: 0;
        font-family: Arial, Helvetica, sans-serif;
        background: #f2f4f7;
    }

    /* Header */

    .header {
        background: #ffffff;
        border-bottom: 4px solid #e31837;
        padding: 14px 7%;
        display: flex;
        align-items: center;
        justify-content: space-between;
    }

    .logo {
        color: #e31837;
        font-size: 28px;
        font-weight: bold;
    }

    .logo span {
        color: #003b71;
    }

    .header-title {
        color: #003b71;
        font-size: 18px;
        font-weight: bold;
    }

    /* Main container */

    .main {
        min-height: 75vh;
        display: flex;
        justify-content: center;
        align-items: center;
        padding: 40px 20px;
    }

    .card {
        width: 500px;
        background: white;
        border-radius: 8px;
        box-shadow: 0 5px 20px rgba(0,0,0,0.15);
        overflow: hidden;
    }

    .card-header {
        background: #003b71;
        color: white;
        text-align: center;
        padding: 20px;
    }

    .card-header h2 {
        margin: 0;
        font-size: 24px;
    }

    .card-header p {
        margin: 8px 0 0;
        font-size: 14px;
    }

    .card-body {
        padding: 30px;
    }

    .label {
        display: block;
        color: #333;
        font-size: 16px;
        font-weight: bold;
        margin-bottom: 10px;
    }

    /* PNR input */

    .pnr-input {
        width: 100%;
        height: 48px;
        padding: 10px 14px;
        border: 1px solid #b8b8b8;
        border-radius: 5px;
        font-size: 16px;
        outline: none;
    }

    .pnr-input:focus {
        border-color: #003b71;
        box-shadow: 0 0 4px rgba(0,59,113,0.3);
    }

    /* Button */

    .check-button {
        width: 100%;
        height: 48px;
        margin-top: 22px;
        background: #e31837;
        color: white;
        border: none;
        border-radius: 5px;
        font-size: 17px;
        font-weight: bold;
        cursor: pointer;
    }

    .check-button:hover {
        background: #c9142f;
    }

    .info {
        margin-top: 20px;
        padding: 12px;
        background: #f1f6fb;
        border-left: 4px solid #003b71;
        color: #555;
        font-size: 13px;
    }

    /* Footer */

    .footer {
        background: #003b71;
        color: white;
        text-align: center;
        padding: 15px;
        font-size: 13px;
    }

</style>


</head>

<body>

```
<!-- Header -->

<div class="header">

    <div class="logo">
        IRCTC <span>PNR</span>
    </div>

    <div class="header-title">
        Passenger Reservation Enquiry
    </div>

</div>


<!-- Main -->

<div class="main">

    <div class="card">

        <div class="card-header">

            <h2>PNR STATUS</h2>

            <p>Check your train reservation status</p>

        </div>


        <div class="card-body">

            <form action="${pageContext.request.contextPath}/pnrCheck"
                  method="get">

                <label class="label">
                    Enter PNR Number
                </label>

                <input type="text"
                       name="pnrNumber"
                       class="pnr-input"
                       placeholder="Enter 10 digit PNR"
                       maxlength="10"
                       minlength="10"
                       pattern="[0-9]{10}"
                       inputmode="numeric"
                       required>

                <input type="submit"
                       value="CHECK PNR STATUS"
                       class="check-button">

            </form>


            <div class="info">
                Please enter your 10-digit PNR number to check
                your reservation status.
            </div>

        </div>

    </div>

</div>


<!-- Footer -->

<div class="footer">

    Indian Railway Catering and Tourism Corporation

</div>


</body>
</html>
