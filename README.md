# Microservices E-Commerce Backend Project

This project is a backend REST API built using Spring Boot and MySQL.
It implements a product service for managing products in an e-commerce system.

## Technologies Used

Java  
Spring Boot  
Spring Data JPA  
MySQL  
Maven  
REST API  

## Project Structure

controller  
service  
repository  
model  
exception  

This layered architecture separates business logic, data access, and API endpoints.

## Features

Create Product  
Get All Products  
Get Product by ID  
Update Product  
Delete Product  
Global Exception Handling  

## API Endpoints

POST /products  
Create a new product

GET /products  
Get all products

GET /products/{id}  
Get product by ID

PUT /products/{id}  
Update product

DELETE /products/{id}  
Delete product

## Database

MySQL database is used to store product data.

Example table structure

id  
name  
price  

## Running the Project

Clone the repository

git clone https://github.com/Laharikatru/Microservices-E-Commerce-Backend-Project.git

Run the Spring Boot application.

The API runs on

http://localhost:8082

## Future Improvements

Add Order Service  
Add User Service  
Add API Gateway  
Add Service Discovery (Eureka)

These will convert the project into a full microservices architecture.
