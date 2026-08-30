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
        color: #333;
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
        font-size: 28px;
        font-weight: bold;
        color: #e31837;
    }

    .logo span {
        color: #003b71;
    }

    .header-title {
        color: #003b71;
        font-size: 18px;
        font-weight: bold;
    }

    /* Main */

    .main {
        min-height: 75vh;
        padding: 40px 20px;
    }

    .container {
        max-width: 900px;
        margin: auto;
    }

    /* Page heading */

    .page-heading {
        background: #003b71;
        color: white;
        padding: 18px 25px;
        border-radius: 6px 6px 0 0;
    }

    .page-heading h2 {
        margin: 0;
        font-size: 23px;
    }

    .page-heading p {
        margin: 6px 0 0;
        font-size: 14px;
    }

    /* Content */

    .content {
        background: white;
        padding: 25px;
        box-shadow: 0 3px 12px rgba(0,0,0,0.12);
    }

    .pnr-box {
        border: 1px solid #ddd;
        border-radius: 5px;
        padding: 18px;
        margin-bottom: 22px;
    }

    .pnr-label {
        color: #666;
        font-size: 14px;
    }

    .pnr-number {
        color: #003b71;
        font-size: 22px;
        font-weight: bold;
        margin-top: 5px;
    }

    /* Status */

    .status-title {
        color: #003b71;
        font-size: 19px;
        font-weight: bold;
        margin-bottom: 12px;
    }

    .status-box {
        background: #fff4d6;
        border: 1px solid #e5c76b;
        border-left: 6px solid #e31837;
        padding: 20px;
        border-radius: 5px;
        margin-bottom: 25px;
    }

    .status-label {
        font-size: 14px;
        color: #666;
    }

    .status-value {
        color: #e31837;
        font-size: 26px;
        font-weight: bold;
        margin-top: 5px;
    }

    /* Passenger table */

    .section-title {
        color: #003b71;
        font-size: 19px;
        font-weight: bold;
        margin-bottom: 12px;
    }

    table {
        width: 100%;
        border-collapse: collapse;
    }

    th {
        background: #003b71;
        color: white;
        padding: 13px;
        text-align: center;
        font-size: 14px;
    }

    td {
        border: 1px solid #ddd;
        padding: 13px;
        text-align: center;
        font-size: 14px;
    }

    .waiting {
        color: #e31837;
        font-weight: bold;
    }

    /* Button */

    .button-area {
        text-align: center;
        margin-top: 25px;
    }

    .back-button {
        display: inline-block;
        padding: 11px 25px;
        background: #003b71;
        color: white;
        text-decoration: none;
        border-radius: 4px;
        font-weight: bold;
        font-size: 14px;
    }

    .back-button:hover {
        background: #002b52;
    }

    /* Information */

    .information {
        margin-top: 25px;
        padding: 15px;
        background: #f1f6fb;
        border-left: 4px solid #003b71;
        font-size: 13px;
        color: #555;
    }

    /* Footer */

    .footer {
        background: #003b71;
        color: white;
        text-align: center;
        padding: 16px;
        font-size: 13px;
    }

    /* Mobile */

    @media (max-width: 600px) {

        .header {
            padding: 12px 20px;
        }

        .logo {
            font-size: 22px;
        }

        .header-title {
            display: none;
        }

        .main {
            padding: 20px 10px;
        }

        .content {
            padding: 15px;
        }

        table {
            font-size: 12px;
        }

        th, td {
            padding: 9px 5px;
        }

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


<!-- Main Content -->

<div class="main">

    <div class="container">


        <!-- Heading -->

        <div class="page-heading">

            <h2>PNR STATUS</h2>

            <p>Passenger Reservation Enquiry</p>

        </div>


        <div class="content">


            <!-- PNR Number -->

            <div class="pnr-box">

                <div class="pnr-label">
                    PNR Number
                </div>

                <div class="pnr-number">
                    ${param.pnrNumber}
                </div>

            </div>


            <!-- Current Status -->

            <div class="status-title">
                Current Reservation Status
            </div>

            <div class="status-box">

                <div class="status-label">
                    Current Status
                </div>

                <div class="status-value">
                    WL - 49
                </div>

            </div>


            <!-- Passenger Details -->

            <div class="section-title">
                Passenger Details
            </div>

            <table>

                <tr>
                    <th>Passenger</th>
                    <th>Booking Status</th>
                    <th>Current Status</th>
                </tr>

                <tr>
                    <td>Passenger 1</td>
                    <td>WL - 49</td>
                    <td class="waiting">WL - 49</td>
                </tr>

            </table>


            <!-- Information -->

            <div class="information">

                <strong>Note:</strong>
                This is a sample PNR status display for your
                Spring MVC project. The displayed status
                <strong>WL - 49</strong> is currently static.

            </div>


            <!-- Back Button -->

            <div class="button-area">

                <a href="${pageContext.request.contextPath}/"
                   class="back-button">
                    Check Another PNR
                </a>

            </div>

        </div>

    </div>

</div>


<!-- Footer -->

<div class="footer">

    Indian Railway Catering and Tourism Corporation

</div>
```

</body>
</html>
