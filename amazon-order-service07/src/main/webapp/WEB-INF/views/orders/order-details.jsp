
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Amazon - Order Details</title>

    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: Arial, Helvetica, sans-serif;
        }

        body {
            background-color: #eaeded;
            color: #111;
        }

        /* Amazon Header */
        .header {
            height: 65px;
            background-color: #131921;
            display: flex;
            align-items: center;
            padding: 0 40px;
        }

        .logo {
            color: white;
            font-size: 30px;
            font-weight: bold;
        }

        .logo span {
            color: #ff9900;
        }

        /* Main Container */
        .container {
            width: 85%;
            max-width: 1000px;
            margin: 40px auto;
        }

        .page-title {
            font-size: 30px;
            margin-bottom: 25px;
        }

        /* Order Card */
        .order-card {
            background: white;
            border: 1px solid #ddd;
            border-radius: 8px;
            padding: 25px;
            margin-bottom: 20px;
        }

        .order-header {
            background-color: #f7f7f7;
            padding: 15px;
            border-bottom: 1px solid #ddd;
            margin-bottom: 25px;
        }

        .order-header span {
            margin-right: 50px;
            color: #555;
            font-size: 14px;
        }

        .order-header strong {
            color: #111;
        }

        /* Product Section */
        .product {
            display: flex;
            gap: 25px;
            align-items: center;
        }

        .product-image {
            width: 150px;
            height: 150px;
            background-color: #f3f3f3;
            display: flex;
            align-items: center;
            justify-content: center;
            border-radius: 5px;
            font-size: 60px;
        }

        .product-info {
            flex: 1;
        }

        .product-info h3 {
            font-size: 20px;
            margin-bottom: 12px;
        }

        .product-info p {
            margin-bottom: 8px;
            color: #555;
        }

        .price {
            color: #b12704 !important;
            font-size: 22px;
            font-weight: bold;
        }

        /* Delivery Status */
        .status {
            margin-top: 25px;
            padding: 18px;
            border-left: 5px solid #007600;
            background-color: #f3fff3;
        }

        .status h3 {
            color: #007600;
            margin-bottom: 7px;
        }

        /* Buttons */
        .buttons {
            margin-top: 25px;
        }

        .button {
            display: inline-block;
            text-decoration: none;
            padding: 11px 22px;
            border-radius: 20px;
            margin-right: 10px;
            font-weight: bold;
            font-size: 14px;
        }

        .yellow-button {
            background-color: #ffd814;
            border: 1px solid #fcd200;
            color: #111;
        }

        .yellow-button:hover {
            background-color: #f7ca00;
        }

        .white-button {
            background-color: white;
            border: 1px solid #888;
            color: #111;
        }

        .white-button:hover {
            background-color: #f3f3f3;
        }

        /* Footer */
        .footer {
            margin-top: 50px;
            padding: 25px;
            background-color: #131a22;
            color: white;
            text-align: center;
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

    <!-- Main Content -->
    <div class="container">

        <h1 class="page-title">Order Details</h1>

        <div class="order-card">

            <!-- Order Information -->
            <div class="order-header">
                <span>
                    <strong>ORDER PLACED</strong><br>
                    August 9, 2026
                </span>

                <span>
                    <strong>ORDER #</strong><br>
                    1001
                </span>

                <span>
                    <strong>PAYMENT</strong><br>
                    Paid
                </span>
            </div>

            <!-- Product -->
            <div class="product">

                <div class="product-image">
                    📦
                </div>

                <div class="product-info">

                    <h3>Amazon Product</h3>

                    <p>Product delivered with Amazon quality.</p>

                    <p>
                        <strong>Quantity:</strong> 1
                    </p>

                    <p class="price">
                        ₹1,999
                    </p>

                </div>

            </div>

            <!-- Delivery Status -->
            <div class="status">

                <h3>✓ Delivered</h3>

                <p>
                    Your package was delivered successfully.
                </p>

            </div>

            <!-- Buttons -->
            <div class="buttons">

                <a href="../" class="button yellow-button">
                    Back to Orders
                </a>

                <a href="#" class="button white-button">
                    Track Package
                </a>

            </div>

        </div>

    </div>

    <!-- Footer -->
    <div class="footer">
        © 2026 Amazon Clone | All Rights Reserved
    </div>

</body>
</html>
