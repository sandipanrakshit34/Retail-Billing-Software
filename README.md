# 🧾 Retail Billing Software

A **Full-Stack Retail Billing Software** built with **Spring Boot** (Backend) and **React.js + Bootstrap** (Frontend) tailored for small to mid-sized retail stores.

---

## 📌 Table of Contents
- [🧠 About the Project](#-about-the-project)
- [💡 Problem Statement](#-problem-statement)
- [✅ Features](#-features)
- [🛠️ Technologies Used](#-technologies-used)
- [🚀 Setup Instructions](#-setup-instructions)
- [🔐 AWS & Razorpay Integration](#-aws--razorpay-integration)
- [📸 Screenshots](#-screenshots)
- [✨ Unique Points](#-unique-points)
- [📬 Contact](#-contact)

---

## 🧠 About the Project

Retail Billing Software is a full-fledged billing system developed for a real-world retail client. It allows store admins and employees to:
- Add/manage products and categories
- Track sales in real-time
- Print order receipts
- Accept payments via UPI or Cash
- Maintain order history and statuses

---

## 💡 Problem Statement

Retail stores often struggle with manual billing, inventory tracking, and maintaining historical records. They need a digital solution that:
- Works in real-time
- Supports category-wise product listings
- Supports online & offline payment modes
- Enables easy invoice generation
- Allows central monitoring by store admins

---

## ✅ Features

### 1. 🔐 Login & Authentication

![Login Page](screenshots/login.png)

Secure login system for admin and employees.

---

### 2. 📊 Dashboard with Sales Insights

![Dashboard](screenshots/dashboard.png)

- Total sales for the day
- Number of orders
- Order status (Pending / Completed)
- Recent orders list

---

### 3. 🛒 Explore Products & Place Orders

![Explore Section](screenshots/explore.png)

- View all available products
- Filter by categories (Mouse, Keyboard, etc.)
- Search products by name
- Add to cart and checkout
- Cash/UPI payment options
- Automatically calculates tax and total

---

### 4. 🧾 Order Receipt Generation

![Receipt](screenshots/receipt.png)

Auto-generated order receipt on successful payment with print option.

---

### 5. 📂 Manage Categories (Admin Only)

![Manage Categories](screenshots/manage-categories.png)

- Add / delete categories
- Assign background color, image, description

---

### 6. 📦 Manage Products (Admin Only)

![Manage Items](screenshots/manage-items.png)

- Add / remove products under categories
- Set product image, price, description, and name

---

### 7. 👥 Manage Users (Admin Only)

![Manage Users](screenshots/manage-users.png)

- Add employees who can login and bill customers
- Delete inactive users

---

### 8. 🧾 Order History (Admin Only)

![Order History](screenshots/order-history.png)

- View all past orders
- Includes customer name, phone, items, total, payment status & date

---

## 🛠️ Technologies Used

### 🔹 Frontend:
- React.js
- Bootstrap 5
- Axios

### 🔹 Backend:
- Spring Boot
- JPA
- MySQL
- Maven

### 🔹 File Handling:
- Local file system (for product/category image uploads)

### 🔹 Payments:
- Razorpay (UPI integration)

### 🔹 Deployment:
- AWS S3 (for media storage integration)

---

## 🚀 Setup Instructions

### 🧩 Backend Setup (Spring Boot)

1. Open the project in IntelliJ IDEA
2. Configure your `application.properties`:
   ```properties
   aws.access.key=YOUR_AWS_KEY
   aws.secret.key=YOUR_SECRET_KEY
   aws.region=ap-south-1
   aws.bucket.name=billing-software-scbushan05
   razorpay.key=YOUR_RAZORPAY_KEY
   razorpay.secret=YOUR_RAZORPAY_SECRET

### 🧩 Frontend Setup (React)

1. Open client folder in VS Code
2. Update constants.js with your Razorpay key
3. Run the React app:
   ```properties
   npm install --save-dev ajv@^7
   npm install
   npm run dev
   ```
## 🔐 AWS & Razorpay Integration
- AWS S3 is used to store images for products & categories
- Razorpay is used for online UPI-based payment collection
- Payment status is reflected in dashboard/order history

## ✨ Unique Points
- Real-time order management and sales tracking
- AWS integration for image upload and access
- Razorpay UPI support
- Clean UI with Bootstrap & responsive layout
- Admin/user role-based access
- All actions backed by RESTful APIs

## 📬 Contact
For setup issues or business inquiries:

📧 Email: sandipanrakshit6@gmail.com
