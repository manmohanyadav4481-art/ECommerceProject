
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Amazon Orders</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, Helvetica, sans-serif;
        }

        body {
            background-color: #eaeded;
        }

        /* Amazon Header */
        .header {
            background-color: #131921;
            color: white;
            height: 65px;
            display: flex;
            align-items: center;
            padding: 0 40px;
        }

        .logo {
            font-size: 30px;
            font-weight: bold;
            color: #ffffff;
        }

        .logo span {
            color: #ff9900;
        }

        /* Main Container */
        .container {
            width: 80%;
            max-width: 900px;
            margin: 50px auto;
        }

        .container h2 {
            font-size: 30px;
            color: #111111;
            margin-bottom: 25px;
        }

        /* Order Card */
        .order-card {
            background-color: white;
            border: 1px solid #ddd;
            border-radius: 8px;
            padding: 30px;
            box-shadow: 0 2px 5px rgba(0, 0, 0, 0.08);
        }

        .order-title {
            font-size: 20px;
            font-weight: bold;
            color: #111111;
            margin-bottom: 10px;
        }

        .order-info {
            color: #565959;
            margin-bottom: 25px;
            font-size: 15px;
        }

        /* Amazon Button */
        .order-button {
            display: inline-block;
            text-decoration: none;
            background-color: #ffd814;
            color: #111111;
            padding: 12px 25px;
            border: 1px solid #fcd200;
            border-radius: 20px;
            font-size: 16px;
            font-weight: bold;
        }

        .order-button:hover {
            background-color: #f7ca00;
        }

        /* Footer */
        .footer {
            text-align: center;
            margin-top: 60px;
            padding: 20px;
            background-color: #131a22;
            color: #ffffff;
            font-size: 14px;
        }
    </style>
</head>

<body>

    <!-- Amazon Header -->
    <div class="header">
        <div class="logo">
            amazon<span>➤</span>
        </div>
    </div>

    <!-- Orders Section -->
    <div class="container">

        <h2>Your Orders</h2>

        <div class="order-card">

            <div class="order-title">
                Order Details
            </div>

            <div class="order-info">
                View the details and status of your Amazon order.
            </div>

            <a href="orders/1001" class="order-button">
                View Order #1001
            </a>

        </div>

    </div>

    <!-- Footer -->
    <div class="footer">
        © 2026 Amazon Clone | All Rights Reserved
    </div>

</body>
</html>

