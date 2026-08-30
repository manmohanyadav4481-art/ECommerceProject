<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">

    <meta name="viewport"
          content="width=device-width, initial-scale=1.0">

    <title>Rapido - Book Ride</title>

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

        .header-text {
            color: white;
            font-size: 15px;
        }

        /* Main */
        .container {
            min-height: calc(100vh - 70px);
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

        /* Booking Card */
        .booking-card {
            width: 450px;
            background: white;
            padding: 35px;
            border-radius: 18px;
            box-shadow: 0 8px 30px rgba(0, 0, 0, 0.12);
        }

        .booking-icon {
            width: 65px;
            height: 65px;
            background: #39d353;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 32px;
            margin: 0 auto 15px;
        }

        .booking-card h1 {
            text-align: center;
            color: #222;
            margin-bottom: 8px;
            font-size: 27px;
        }

        .subtitle {
            text-align: center;
            color: #777;
            font-size: 14px;
            margin-bottom: 28px;
        }

        /* Form */
        .form-group {
            margin-bottom: 18px;
        }

        .form-group label {
            display: block;
            margin-bottom: 7px;
            color: #333;
            font-size: 14px;
            font-weight: bold;
        }

        .form-group input,
        .form-group select {
            width: 100%;
            height: 45px;
            padding: 0 13px;
            border: 1px solid #ccc;
            border-radius: 7px;
            font-size: 14px;
            outline: none;
            transition: 0.2s;
        }

        .form-group input:focus,
        .form-group select:focus {
            border-color: #39d353;
            box-shadow: 0 0 0 2px rgba(57, 211, 83, 0.12);
        }

        /* Book Button */
        .book-btn {
            width: 100%;
            height: 48px;
            border: none;
            border-radius: 8px;
            background: #39d353;
            color: #111;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            margin-top: 5px;
            transition: 0.3s;
        }

        .book-btn:hover {
            background: #28b943;
            transform: translateY(-1px);
            box-shadow: 0 5px 15px rgba(57, 211, 83, 0.3);
        }

        /* Footer */
        .footer {
            text-align: center;
            padding: 15px;
            background: #111111;
            color: #aaa;
            font-size: 12px;
        }

        /* Mobile */
        @media (max-width: 600px) {

            .header {
                padding: 0 20px;
            }

            .booking-card {
                width: 100%;
                padding: 25px 20px;
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

        <div class="header-text">
            Safe &amp; Affordable Rides
        </div>

    </header>


    <!-- Booking Section -->
    <main class="container">

        <div class="booking-card">

            <div class="booking-icon">
                🛵
            </div>

            <h1>Book Your Ride</h1>

            <p class="subtitle">
                Enter your ride details to continue
            </p>


            <form action="bookRide" method="post">

                <!-- Mobile -->
                <div class="form-group">

                    <label for="mobile">
                        Mobile Number
                    </label>

                    <input type="text"
                           id="mobile"
                           name="mobile"
                           placeholder="Enter mobile number"
                           required>

                </div>


                <!-- Source -->
                <div class="form-group">

                    <label for="source">
                        Pickup Location
                    </label>

                    <input type="text"
                           id="source"
                           name="source"
                           placeholder="Enter pickup location"
                           required>

                </div>


                <!-- Destination -->
                <div class="form-group">

                    <label for="destination">
                        Destination
                    </label>

                    <input type="text"
                           id="destination"
                           name="destination"
                           placeholder="Enter destination"
                           required>

                </div>


                <!-- Ride Type -->
                <div class="form-group">

                    <label for="ridetype">
                        Ride Type
                    </label>

                    <select id="ridetype"
                            name="ridetype"
                            required>

                        <option value="">
                            Select Ride Type
                        </option>

                        <option value="Bike">
                            Bike
                        </option>

                        <option value="Auto">
                            Auto
                        </option>

                        <option value="Cab">
                            Cab
                        </option>

                    </select>

                </div>


                <!-- Amount -->
                <div class="form-group">

                    <label for="amount">
                        Amount
                    </label>

                    <input type="text"
                           id="amount"
                           name="amount"
                           placeholder="Enter ride amount"
                           required>

                </div>


                <!-- Submit -->
                <button type="submit" class="book-btn">
                    🚀 Book Ride
                </button>

            </form>

        </div>

    </main>


    <!-- Footer -->
    <footer class="footer">

        © 2026 Rapido Ride Booking App

    </footer>

</body>

</html>