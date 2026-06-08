# 🔐 Secure Enterprise Signup Module (Backend API)

**An enterprise-grade authentication and registration backend built for a modern e-commerce platform.**

---

### 🔗 Related Repositories
* **Backend API (This Repo):** [https://github.com/JayHarsha/secure-signup-module-backend](https://github.com/JayHarsha/secure-signup-module-backend)
* **Frontend UI Client:** [https://github.com/JayHarsha/secure-signup-module-frontend](https://github.com/JayHarsha/secure-signup-module-frontend)

---

## 📖 Project Overview
This repository contains the backend architecture for a secure user registration and authentication module. Designed for an e-commerce platform, the system prioritizes data privacy, robust security standards, and seamless frontend integration. It handles the complete user onboarding lifecycle, from credential creation to secure session authorization.

## 🛠️ Technology Stack
* **Core Framework:** Java (17), Spring Boot
* **Database & ORM:** PostgreSQL, Spring Data JPA, Hibernate
* **Security Layer:** Spring Security, JWT (JSON Web Tokens), AES-GCM Encryption
* **API Documentation:** Swagger / OpenAPI 3.0
* **Containerization & DevOps:** Docker, Docker Secrets
* **Frontend Integration:** React.js (HTML, CSS, JavaScript) - *[View Client Repo](https://github.com/JayHarsha/secure-signup-module-frontend)*

## ✨ Key Features
* **Advanced Cryptography:** Implemented AES-GCM encryption for highly sensitive user data, ensuring zero-knowledge storage of critical information alongside standard password hashing.
* **Stateless Authentication:** Engineered a robust authorization layer using Spring Security and JWT, allowing scalable, stateless session management for the frontend client.
* **Database Integrity:** Utilized Spring Data JPA to interact seamlessly with a PostgreSQL database, ensuring ACID compliance and efficient database interactions.
* **Interactive API Docs:** Fully documented RESTful endpoints using Swagger UI, providing a transparent and interactive integration contract for frontend consumption.
* **Secure Containerization:** Packaged the application using Docker. Engineered a secure deployment strategy utilizing Docker Secrets to manage sensitive environment variables, database credentials, and cryptographic keys without exposing them in the source code.

## 🚀 Quick Start (Running via Docker)

### 1. Prerequisites
* Docker and Docker Compose installed on your machine.
* Git

### 2. Clone the Repository
```bash
git clone https://github.com/JayHarsha/ECOM-SignupModule.git
cd ECOM-SignupModule
```

### 3. Setup Environment & Secrets
Ensure your Docker secrets or `.env` files are configured to hold the necessary database credentials and AES encryption keys before launching the containers.

### 4. Build and Run
```bash
docker-compose up --build
```
*The Spring Boot backend will start on `http://localhost:8080` (or your configured port), and the PostgreSQL database will initialize alongside it.*

## 📚 API Documentation
Once the application is running, you can access the interactive Swagger UI to view and test the authentication endpoints:
* **Swagger UI:** `http://localhost:8080/swagger-ui.html`
* **OpenAPI Specs:** `http://localhost:8080/v3/api-docs`

---
*Architected and developed by [Jay Harsha](https://github.com/JayHarsha)*
