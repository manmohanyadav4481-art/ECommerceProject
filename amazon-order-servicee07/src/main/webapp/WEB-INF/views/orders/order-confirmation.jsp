
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <title>Amazon - Order Confirmation</title>

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

        /* ================= HEADER ================= */

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
            letter-spacing: -1px;
        }

        .logo span {
            color: #ff9900;
            font-size: 24px;
        }

        /* ================= MAIN ================= */

        .container {
            width: 90%;
            max-width: 1000px;
            margin: 35px auto;
        }

        /* ================= SUCCESS BOX ================= */

        .success-box {
            background-color: white;
            border: 1px solid #ddd;
            border-radius: 8px;
            padding: 35px;
            text-align: center;
            margin-bottom: 25px;
        }

        .success-icon {
            width: 65px;
            height: 65px;
            margin: 0 auto 15px;
            border-radius: 50%;
            background-color: #e7f6e7;
            color: #067d62;
            font-size: 40px;
            font-weight: bold;
            display: flex;
            align-items: center;
            justify-content: center;
        }

        .success-box h1 {
            color: #067d62;
            font-size: 28px;
            margin-bottom: 10px;
        }

        .success-box p {
            color: #555;
            font-size: 16px;
        }

        /* ================= ORDER CARD ================= */

        .card {
            background-color: white;
            border: 1px solid #ddd;
            border-radius: 8px;
            margin-bottom: 20px;
            overflow: hidden;
        }

        .card-title {
            background-color: #f7f7f7;
            padding: 18px 22px;
            border-bottom: 1px solid #ddd;
            font-size: 20px;
            font-weight: bold;
        }

        .card-content {
            padding: 25px;
        }

        /* ================= ORDER DETAILS ================= */

        .order-details {
            display: flex;
            justify-content: space-between;
            flex-wrap: wrap;
            gap: 25px;
        }

        .detail {
            min-width: 180px;
        }

        .detail-title {
            color: #555;
            font-size: 13px;
            font-weight: bold;
            margin-bottom: 6px;
            text-transform: uppercase;
        }

        .detail-value {
            font-size: 16px;
            color: #111;
        }

        .paid {
            color: #067d62;
            font-weight: bold;
        }

        /* ================= PRODUCT ================= */

        .product {
            display: flex;
            align-items: center;
            gap: 25px;
        }

        .product-image {
            width: 130px;
            height: 130px;
            background-color: #f3f3f3;
            border-radius: 6px;
            display: flex;
            align-items: center;
            justify-content: center;
            font-size: 55px;
        }

        .product-info {
            flex: 1;
        }

        .product-name {
            font-size: 20px;
            font-weight: bold;
            margin-bottom: 10px;
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

        /* ================= DELIVERY ================= */

        .delivery-box {
            border-left: 5px solid #067d62;
            background-color: #f3fff3;
            padding: 18px;
        }

        .delivery-box h3 {
            color: #067d62;
            margin-bottom: 8px;
        }

        .delivery-box p {
            color: #444;
            line-height: 1.6;
        }

        /* ================= ADDRESS ================= */

        .address {
            line-height: 1.7;
            color: #444;
        }

        .address strong {
            color: #111;
        }

        /* ================= BUTTONS ================= */

        .buttons {
            margin-top: 25px;
            text-align: center;
        }

        .button {
            display: inline-block;
            padding: 12px 25px;
            margin: 5px;
            border-radius: 20px;
            text-decoration: none;
            font-size: 14px;
            font-weight: bold;
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

        /* ================= FOOTER ================= */

        .footer {
            margin-top: 50px;
            padding: 30px;
            background-color: #131a22;
            color: #ddd;
            text-align: center;
            font-size: 14px;
        }

        /* ================= MOBILE ================= */

        @media (max-width: 600px) {

            .header {
                padding: 0 20px;
            }

            .container {
                width: 94%;
            }

            .product {
                flex-direction: column;
                align-items: flex-start;
            }

            .order-details {
                flex-direction: column;
            }

            .success-box {
                padding: 25px 15px;
            }

        }

    </style>

</head>

<body>

    <!-- ================= HEADER ================= -->

    <div class="header">

        <div class="logo">
            amazon<span>➤</span>
        </div>

    </div>


    <!-- ================= MAIN CONTAINER ================= -->

    <div class="container">


        <!-- ================= SUCCESS MESSAGE ================= -->

        <div class="success-box">

            <div class="success-icon">
                ✓
            </div>

            <h1>Order Confirmed!</h1>

            <p>
                Thank you for your purchase. Your order has been placed successfully.
            </p>

        </div>


        <!-- ================= ORDER INFORMATION ================= -->

        <div class="card">

            <div class="card-title">
                Order Information
            </div>

            <div class="card-content">

                <div class="order-details">

                    <div class="detail">

                        <div class="detail-title">
                            Order Placed
                        </div>

                        <div class="detail-value">
                            August 11, 2026
                        </div>

                    </div>


                    <div class="detail">

                        <div class="detail-title">
                            Order #
                        </div>

                        <div class="detail-value">
                            1001
                        </div>

                    </div>


                    <div class="detail">

                        <div class="detail-title">
                            Payment
                        </div>

                        <div class="detail-value paid">
                            Paid
                        </div>

                    </div>

                </div>

            </div>

        </div>


        <!-- ================= PRODUCT ================= -->

        <div class="card">

            <div class="card-title">
                Your Order
            </div>

            <div class="card-content">

                <div class="product">

                    <div class="product-image">
                        📦
                    </div>


                    <div class="product-info">

                        <div class="product-name">
                            ${item}
                        </div>

                        <p>
                            <strong>Quantity:</strong>
                            ${quantity}
                        </p>

                        <p class="price">
                            ₹${price}
                        </p>

                    </div>

                </div>

            </div>

        </div>


        <!-- ================= DELIVERY ================= -->

        <div class="card">

            <div class="card-title">
                Delivery Information
            </div>

            <div class="card-content">

                <div class="delivery-box">

                    <h3>
                        ✓ Order Successfully Placed
                    </h3>

                    <p>
                        Your order has been confirmed and will be delivered
                        to your address.
                    </p>

                </div>

            </div>

        </div>


        <!-- ================= ADDRESS ================= -->

        <div class="card">

            <div class="card-title">
                Shipping Address
            </div>

            <div class="card-content">

                <div class="address">

                    <strong>${user}</strong><br>

                    ${address}<br>

                    Mobile: ${mobile}

                </div>

            </div>

        </div>


        <!-- ================= BUTTONS ================= -->

        <div class="buttons">

            <a href="../" class="button yellow-button">
                Continue Shopping
            </a>

            <a href="../orders" class="button white-button">
                View Your Orders
            </a>

        </div>


    </div>


    <!-- ================= FOOTER ================= -->

    <div class="footer">

        © 2026 Amazon Clone | All Rights Reserved

    </div>


</body>
</html>