<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="UTF-8">

    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">

    <title>Booking Confirmation</title>

    <style>

        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, Helvetica, sans-serif;
        }

        body {
            background: #f5f5f5;
            min-height: 100vh;
        }

        /* Header */
        .header {
            height: 70px;
            background: #111111;
            display: flex;
            align-items: center;
            justify-content: space-between;
            padding: 0 60px;
        }

        .logo {
            color: #39d353;
            font-size: 30px;
            font-weight: bold;
        }

        .header-title {
            color: white;
            font-size: 15px;
        }

        /* Main */
        .container {
            min-height: calc(100vh - 120px);
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 40px 20px;
            background: linear-gradient(
                135deg,
                #eaffea,
                #ffffff
            );
        }

        /* Confirmation Card */
        .confirmation-card {
            width: 450px;
            background: white;
            border-radius: 18px;
            padding: 35px;
            text-align: center;
            box-shadow: 0 8px 30px rgba(0, 0, 0, 0.12);
        }

        /* Success Icon */
        .success-icon {
            width: 70px;
            height: 70px;
            margin: 0 auto 20px;

            background: #39d353;
            color: #111;

            border-radius: 50%;

            display: flex;
            align-items: center;
            justify-content: center;

            font-size: 38px;
            font-weight: bold;
        }

        .confirmation-card h1 {
            color: #222;
            font-size: 27px;
            margin-bottom: 10px;
        }

        .success-message {
            color: #555;
            font-size: 15px;
            margin-bottom: 28px;
        }

        /* Ride Details */
        .ride-details {
            text-align: left;
            border: 1px solid #e0e0e0;
            border-radius: 10px;
            overflow: hidden;
            margin-bottom: 25px;
        }

        .detail-row {
            display: flex;
            justify-content: space-between;
            align-items: center;

            padding: 16px;

            border-bottom: 1px solid #eeeeee;
        }

        .detail-row:last-child {
            border-bottom: none;
        }

        .detail-label {
            color: #777;
            font-size: 14px;
        }

        .detail-value {
            color: #222;
            font-size: 15px;
            font-weight: bold;
        }

        /* OTP */
        .otp-box {
            background: #eaffea;
            border: 1px dashed #39d353;
            border-radius: 10px;
            padding: 15px;
            margin-bottom: 25px;
        }

        .otp-title {
            color: #555;
            font-size: 13px;
            margin-bottom: 7px;
        }

        .otp {
            color: #111;
            font-size: 25px;
            font-weight: bold;
            letter-spacing: 5px;
        }

        /* Thank You */
        .thank-you {
            color: #666;
            font-size: 14px;
        }

        /* Footer */
        .footer {
            height: 50px;
            background: #111111;

            display: flex;
            align-items: center;
            justify-content: center;

            color: #aaa;
            font-size: 12px;
        }

        /* Mobile */
        @media (max-width: 600px) {

            .header {
                padding: 0 20px;
            }

            .header-title {
                display: none;
            }

            .confirmation-card {
                width: 100%;
                padding: 28px 20px;
            }

        }

    </style>

</head>


<body>

    <!-- Header -->
    <header class="header">

        <div class="logo">
            rapido
        </div>

        <div class="header-title">
            Your Ride is Ready
        </div>

    </header>


    <!-- Main -->
    <main class="container">

        <div class="confirmation-card">

            <!-- Success Icon -->
            <div class="success-icon">
                ✓
            </div>


            <!-- Heading -->
            <h1>
                Booking Confirmed!
            </h1>

            <p class="success-message">
                Your ride has been successfully booked.
            </p>


            <!-- Rider Details -->
            <div class="ride-details">

                <div class="detail-row">

                    <span class="detail-label">
                        Rider Name
                    </span>

                    <span class="detail-value">
                        ${riderName}
                    </span>

                </div>


                <div class="detail-row">

                    <span class="detail-label">
                        Vehicle Number
                    </span>

                    <span class="detail-value">
                        ${carNo}
                    </span>

                </div>


                <div class="detail-row">

                    <span class="detail-label">
                        Estimated Arrival
                    </span>

                    <span class="detail-value">
                        ${eta}
                    </span>

                </div>

            </div>


            <!-- OTP -->
            <div class="otp-box">

                <div class="otp-title">
                    Share this OTP with your rider
                </div>

                <div class="otp">
                    ${otp}
                </div>

            </div>


            <p class="thank-you">
                Thank you for choosing Rapido. Have a safe ride! 🛵
            </p>

        </div>

    </main>


    <!-- Footer -->
    <footer class="footer">

        © 2026 Rapido Ride Booking App

    </footer>

</body>

</html>