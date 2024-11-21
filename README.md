# School Management Application
## Overview
The School Management Application is a microservices-based system designed for efficient management of students, teachers, and exams. Built with Spring Boot, the application leverages modern frameworks and tools like Eureka Server, API Gateway, Keycloak, Docker Compose, PostgreSQL, and MongoDB for a seamless and scalable architecture.

## Architecture
The application follows a microservices architecture and includes the following components:

### Teacher Service
### Student Service
### Exam Service
### API Gateway
Acts as a single entry point for all requests.
Configured for load balancing and routing.
### Eureka Server
Service discovery for all microservices.
### Keycloak
Provides authentication and authorization.
## Databases
### PostgreSQL: Relational data.
### MongoDB: NoSQL data.
# Features
### Microservices: 
Modular, scalable, and maintainable architecture.
### Authentication & Authorization: 
Secured endpoints using Keycloak.
### Service Discovery: 
Automatic registration and discovery with Eureka Server.
### API Gateway: 
Centralized request routing with Spring Cloud Gateway.
### Dockerized Deployment:
Simplified deployment using Docker Compose.
### Hybrid Database: 
Combines the strengths of SQL and NoSQL databases.

# Prerequisites
Make sure you have the following installed:
* Java 17+
* Maven 3.8+
* Docker & Docker Compose

# Getting Started
1. Clone the Repository
```bash
git clone https://github.com/rayennebr/school-management.git
cd school-management-application
```
2. Build the Project

* Use Maven to build all services:

```bash
mvn clean install
```
3. Setup Keycloak, MongoDB, and PostgreSQL with Docker Compose
* Navigate to the docker directory and run the following:
```bash
cd docker
docker-compose up -d
```
This will start:
* Keycloak on http://localhost:7080
* MongoDB on localhost:27017
* PostgreSQL on localhost:5432
## Technologies Used
* Spring Boot
* Spring Cloud (Eureka, Gateway)
* Keycloak
* Docker & Docker Compose
* PostgreSQL
* MongoDB
# Contributors
## Rayenne BRIK
### Full Stack Developer with expertise in Spring Boot and Angular
# License
This project is licensed under the MIT License. 
