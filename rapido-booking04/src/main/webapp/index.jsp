<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>Rapido - Book a Ride</title>

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
            color: white;
        }

        .logo {
            font-size: 30px;
            font-weight: bold;
            color: #39d353;
        }

        .nav {
            display: flex;
            gap: 30px;
        }

        .nav a {
            color: white;
            text-decoration: none;
            font-size: 15px;
        }

        .nav a:hover {
            color: #39d353;
        }

        /* Hero Section */
        .hero {
            min-height: calc(100vh - 70px);
            display: flex;
            align-items: center;
            justify-content: center;
            padding: 40px 20px;
            background: linear-gradient(
                135deg,
                #eaffea,
                #ffffff
            );
        }

        .booking-card {
            width: 420px;
            background: white;
            padding: 40px;
            border-radius: 18px;
            box-shadow: 0 8px 30px rgba(0, 0, 0, 0.12);
            text-align: center;
        }

        .bike-icon {
            width: 75px;
            height: 75px;
            margin: 0 auto 20px;
            background: #39d353;
            border-radius: 50%;
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 38px;
        }

        .booking-card h1 {
            font-size: 28px;
            color: #222;
            margin-bottom: 10px;
        }

        .booking-card p {
            color: #666;
            font-size: 15px;
            margin-bottom: 30px;
            line-height: 1.6;
        }

        /* Book Button */
        .book-btn {
            display: block;
            width: 100%;
            padding: 15px;
            background: #39d353;
            color: #111;
            text-decoration: none;
            font-size: 17px;
            font-weight: bold;
            border-radius: 8px;
            transition: 0.3s;
        }

        .book-btn:hover {
            background: #28b943;
            transform: translateY(-2px);
            box-shadow: 0 5px 15px rgba(57, 211, 83, 0.3);
        }

        /* Features */
        .features {
            display: flex;
            justify-content: space-between;
            margin-top: 30px;
            gap: 10px;
        }

        .feature {
            flex: 1;
            padding: 12px 5px;
            border-radius: 8px;
            background: #f7f7f7;
        }

        .feature span {
            display: block;
            font-size: 20px;
            margin-bottom: 5px;
        }

        .feature small {
            color: #555;
            font-size: 11px;
        }

        /* Footer */
        .footer {
            text-align: center;
            padding: 18px;
            background: #111;
            color: #aaa;
            font-size: 13px;
        }

        @media (max-width: 600px) {
            .header {
                padding: 0 20px;
            }

            .nav {
                display: none;
            }

            .booking-card {
                width: 100%;
                max-width: 420px;
                padding: 30px 25px;
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

        <nav class="nav">
            <a href="#">Home</a>
            <a href="#">My Rides</a>
            <a href="#">Help</a>
        </nav>

    </header>


    <!-- Main Section -->
    <main class="hero">

        <div class="booking-card">

            <div class="bike-icon">
                🛵
            </div>

            <h1>Rapido Ride</h1>

            <p>
                Quick, affordable and convenient rides.
                Book your bike ride and reach your destination faster.
            </p>

            <a href="showBookingPage" class="book-btn">
                🚀 Book a Ride
            </a>


            <!-- Features -->
            <div class="features">

                <div class="feature">
                    <span>⚡</span>
                    <small>Quick Pickup</small>
                </div>

                <div class="feature">
                    <span>💰</span>
                    <small>Affordable</small>
                </div>

                <div class="feature">
                    <span>🛡️</span>
                    <small>Safe Ride</small>
                </div>

            </div>

        </div>

    </main>


    <!-- Footer -->
    <footer class="footer">
        © 2026 Rapido Ride Booking App
    </footer>

</body>
</html>