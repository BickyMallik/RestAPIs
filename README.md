# Spring Boot REST API Practice Project

A hands-on practice project built while learning Spring Boot for Java Full Stack development.

## Tech Stack
- Java 25
- Spring Boot 3.4.4
- Spring Data JPA
- MySQL
- Maven

## Features Implemented
- CRUD operations (GET, POST, PUT, PATCH, DELETE)
- ResponseEntity with proper HTTP status codes
- Global Exception Handling with @ControllerAdvice
- DTO Pattern
- Request Validation with @Valid
- Pagination and Sorting

## API Endpoints

| Method | URL                             | Description           |
| ------ | ------------------------------- | --------------------- |
| GET    | /api/students                   | Get all students      |
| GET    | /api/students/{id}              | Get student by ID     |
| POST   | /api/students                   | Create new student    |
| PUT    | /api/students/{id}              | Update entire student |
| PATCH  | /api/students/{id}              | Partial update        |
| DELETE | /api/students/{id}              | Delete student        |
| GET    | /api/students/search?branch=CSE | Search by branch      |


## Learning Reference
Anuj Kumar Sharma - Spring Boot Playlist
