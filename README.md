# 🛒 Microservices E-Commerce Backend

A production-style backend for an e-commerce platform built using a **Microservices Architecture** with Spring Boot. The system handles users, products, and orders as independent services that communicate via REST APIs.

---

## 🚀 Features

- Independent microservices for User, Product, and Order management
- RESTful API design with full CRUD operations
- Inter-service communication via REST
- Centralized data management with MySQL
- API testing with Postman
- Clean separation of concerns following OOP principles

---

## 🏗️ Architecture

```
┌─────────────────┐     ┌─────────────────┐     ┌─────────────────┐
│   User Service  │     │ Product Service  │     │  Order Service  │
│  (Spring Boot)  │     │  (Spring Boot)   │     │  (Spring Boot)  │
└────────┬────────┘     └────────┬─────────┘     └────────┬────────┘
         │                       │                         │
         └───────────────────────┼─────────────────────────┘
                                 │ REST APIs
                        ┌────────▼────────┐
                        │     MySQL DB    │
                        └─────────────────┘
```

---

## 🛠️ Tech Stack

| Layer | Technology |
|-------|-----------|
| Backend Framework | Spring Boot |
| Language | Java |
| Database | MySQL |
| API Style | REST / JSON |
| API Testing | Postman |
| Build Tool | Maven |
| Version Control | Git |

---

## 📁 Project Structure

```
Microservices-E-Commerce-Backend/
├── user-service/
│   ├── src/main/java/
│   │   └── com/ecommerce/user/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── repository/
│   │       └── model/
│   └── pom.xml
├── product-service/
│   ├── src/main/java/
│   │   └── com/ecommerce/product/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── repository/
│   │       └── model/
│   └── pom.xml
├── order-service/
│   ├── src/main/java/
│   │   └── com/ecommerce/order/
│   │       ├── controller/
│   │       ├── service/
│   │       ├── repository/
│   │       └── model/
│   └── pom.xml
└── README.md
```

---

## 📌 API Endpoints

### User Service
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/users/register` | Register a new user |
| POST | `/api/users/login` | User login |
| GET | `/api/users/{id}` | Get user by ID |
| PUT | `/api/users/{id}` | Update user details |
| DELETE | `/api/users/{id}` | Delete user |

### Product Service
| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/products` | Get all products |
| GET | `/api/products/{id}` | Get product by ID |
| POST | `/api/products` | Add new product |
| PUT | `/api/products/{id}` | Update product |
| DELETE | `/api/products/{id}` | Delete product |

### Order Service
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/orders` | Place a new order |
| GET | `/api/orders/{id}` | Get order by ID |
| GET | `/api/orders/user/{userId}` | Get all orders by user |
| PUT | `/api/orders/{id}/status` | Update order status |

---

## ⚙️ Getting Started

### Prerequisites
- Java 17+
- Maven 3.6+
- MySQL 8.0+
- Postman (for API testing)

### Installation

1. **Clone the repository**
```bash
git clone https://github.com/Laharikatru/Microservices-E-Commerce-Backend-Project.git
cd Microservices-E-Commerce-Backend-Project
```

2. **Set up the database**
```sql
CREATE DATABASE user_db;
CREATE DATABASE product_db;
CREATE DATABASE order_db;
```

3. **Configure each service** — update `application.properties` in each service:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/user_db
spring.datasource.username=root
spring.datasource.password=your_password
```

4. **Run each service** (in separate terminals)
```bash
cd user-service && mvn spring-boot:run
cd product-service && mvn spring-boot:run
cd order-service && mvn spring-boot:run
```

5. **Test APIs** using Postman or any REST client.

---

## 🧠 Key Concepts Demonstrated

- **Microservices Architecture** — loosely coupled, independently deployable services
- **REST API Design** — standard HTTP methods, status codes, JSON responses
- **OOP Principles** — encapsulation, abstraction across service layers
- **Database per Service** — each microservice owns its own MySQL database
- **Spring Boot** — auto-configuration, dependency injection, JPA/Hibernate

---

## 👩‍💻 Author

**Katru Lahari Navya Tejaswi**  
Java Backend Developer | CDAC PGDAC Graduate  
📧 klaharinavya@gmail.com  
🔗 [LinkedIn](https://www.linkedin.com/in/lahari-navya-ba7361216)  
🐙 [GitHub](https://github.com/Laharikatru)

---

## 📄 License

This project is open source and available under the [MIT License](LICENSE).
