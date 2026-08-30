
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

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

        /* Header */
        .header {
            height: 65px;
            background-color: #131921;
            display: flex;
            align-items: center;
            padding: 0 30px;
        }

        .logo {
            color: white;
            font-size: 28px;
            font-weight: bold;
        }

        .logo span {
            color: #ff9900;
        }

        .nav {
            margin-left: auto;
        }

        .nav a {
            color: white;
            text-decoration: none;
            margin-left: 30px;
            font-size: 15px;
        }

        .nav a:hover {
            color: #ff9900;
        }

        /* Container */
        .container {
            width: 85%;
            max-width: 1000px;
            margin: 40px auto;
        }

        .title {
            font-size: 30px;
            margin-bottom: 25px;
        }

        /* Order Card */
        .order-card {
            background: white;
            border: 1px solid #ddd;
            border-radius: 8px;
            padding: 25px;
            box-shadow: 0 2px 5px rgba(0,0,0,0.10);
        }

        .order-header {
            background-color: #f3f3f3;
            padding: 18px;
            border-radius: 5px;
            margin-bottom: 20px;
        }

        .order-header h2 {
            margin-bottom: 8px;
        }

        .order-id {
            color: #555;
        }

        /* Product */
        .product {
            display: flex;
            justify-content: space-between;
            border-bottom: 1px solid #ddd;
            padding: 20px 0;
        }

        .product-info h3 {
            margin-bottom: 10px;
        }

        .product-info p {
            margin: 7px 0;
            color: #555;
        }

        .price {
            font-size: 20px;
            font-weight: bold;
        }

        .status {
            color: green;
            font-weight: bold;
        }

        /* Total */
        .total {
            text-align: right;
            padding-top: 20px;
            font-size: 22px;
            font-weight: bold;
        }

        /* Back Button */
        .back-btn {
            display: inline-block;
            margin-top: 25px;
            padding: 11px 25px;
            background-color: #ff9900;
            color: #111;
            text-decoration: none;
            border-radius: 20px;
            font-weight: bold;
        }

        .back-btn:hover {
            background-color: #e68a00;
        }

        /* Footer */
        .footer {
            margin-top: 80px;
            background-color: #131921;
            color: white;
            text-align: center;
            padding: 25px;
        }
    </style>
</head>

<body>

    <!-- Header -->
    <div class="header">

        <div class="logo">
            amazon<span>.in</span>
        </div>

        <div class="nav">
            <a href="#">Home</a>
            <a href="#">Orders</a>
            <a href="#">Cart</a>
            <a href="#">Account</a>
        </div>

    </div>


    <!-- Main -->
    <div class="container">

        <h1 class="title">Order Details</h1>

        <div class="order-card">

            <!-- Order Information -->
            <div class="order-header">

                <h2>Order #${order.orderId}</h2>

                <p class="order-id">
                    Order Date: ${order.orderDate}
                </p>

            </div>


            <!-- Product Details -->
            <div class="product">

                <div class="product-info">

                    <h3>${order.productName}</h3>

                    <p>
                        Price: ₹${order.price}
                    </p>

                    <p>
                        Quantity: ${order.quantity}
                    </p>

                    <p>
                        Status:
                        <span class="status">
                            ${order.status}
                        </span>
                    </p>

                </div>

                <div class="price">
                    ₹${order.price * order.quantity}
                </div>

            </div>


            <!-- Total -->
            <div class="total">

                Total Amount:
                ₹${order.price * order.quantity}

            </div>


            <a href="../" class="back-btn">
                ← Back to Orders
            </a>

        </div>

    </div>


    <!-- Footer -->
    <div class="footer">
        © 2026 Amazon Orders | All Rights Reserved
    </div>

</body>

</html>

