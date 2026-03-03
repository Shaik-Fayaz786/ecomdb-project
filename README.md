# 🛒 EcomDB - Simple Spring Boot E-Commerce API

## 📌 Project Description

EcomDB is a simple Spring Boot REST API project developed to manage basic e-commerce operations such as Customers, Products, Orders, and Address management.

This project demonstrates CRUD operations using Spring Boot, JPA, and MySQL database integration.

---

## 🚀 Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Hibernate
* Maven
* Postman (API Testing)

---

## 🗂️ Project Structure

The project includes the following modules:

* Customer
* Address
* Product
* Orders

Each module contains:

* Entity Class
* Repository Interface
* Service Layer
* Controller Layer

---

## 🛠️ Database Configuration

Database Name: `ecomdb`

Update your `application.properties` file:

```
spring.datasource.url=jdbc:mysql://localhost:3306/ecomdb
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## 📡 API Endpoints (Sample)

### ➤ Customer APIs

* POST /api/customer
* GET /api/customer
* GET /api/customer/{id}
* DELETE /api/customer/{id}

### ➤ Product APIs

* POST /api/product
* GET /api/product

### ➤ Order APIs

* POST /api/order
* GET /api/order

---

## 🧪 Testing

All APIs were tested using Postman.

---

## 🎯 Features

* RESTful API design
* Entity relationships (One-to-One, One-to-Many)
* Auto table creation using Hibernate
* Clean layered architecture
* MySQL database integration

---

## 📚 Learning Outcome

This project helped in understanding:

* Spring Boot project setup
* REST API development
* JPA entity relationships
* Database connectivity
* CRUD operations implementation

---

## 👨‍💻 Author

Shaik Fayaz
Final Year B.Tech Student
Java & Spring Boot Learner

---

⭐ If you like this project, feel free to fork and improve it!
