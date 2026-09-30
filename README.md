# Course Registration System

A full-stack **Course Registration System** built with **Spring Boot** and a **HTML/CSS/JavaScript frontend**. The application allows users to view available courses and register for a course by providing their details.

## 🚀 Features

* View available courses
* Register for a course
* Store registration details in MySQL
* REST APIs using Spring Boot
* Frontend communicates with backend using JavaScript `fetch()`
* Database operations using Spring Data JPA
* Clean separation of Controller, Service, Repository, and Model layers

## 🛠️ Tech Stack

### Backend

* Java
* Spring Boot
* Spring Web
* Spring Data JPA
* Hibernate
* Maven
* MySQL

### Frontend

* HTML5
* CSS3
* JavaScript
* Fetch API

### Tools

* IntelliJ IDEA
* Visual Studio Code
* MySQL
* Git & GitHub

## 📂 Project Structure

```text
Course-Registration-System/
│
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/example/Course/Registration/System/
│   │   │   │       ├── controller/
│   │   │   │       ├── model/
│   │   │   │       ├── repository/
│   │   │   │       ├── service/
│   │   │   │       └── CourseRegistrationSystemApplication.java
│   │   │   │
│   │   │   └── resources/
│   │   │       └── application.properties
│   │   │
│   │   └── test/
│   │
│   ├── pom.xml
│   ├── mvnw
│   └── mvnw.cmd
│
├── frontend/
│   ├── index.html
│   ├── available.html
│   ├── register.html
│   ├── entroll.html
│   └── myscript.js
│
└── README.md
```

## 🔄 Application Flow

```text
User
  ↓
Frontend (HTML/CSS/JavaScript)
  ↓
Fetch API
  ↓
Spring Boot REST Controller
  ↓
Service Layer
  ↓
Repository Layer
  ↓
MySQL Database
```

## 🔌 Backend API

The backend exposes REST endpoints for interacting with the course registration system.

Example:

```text
GET /course
```

This endpoint retrieves the available courses.

The frontend uses JavaScript to communicate with the backend:

```javascript
fetch("http://localhost:8080/course")
```

## 🗄️ Database

The project uses **MySQL** for storing course and registration information.

Configure your database connection in:

```text
backend/src/main/resources/application.properties
```

Example:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/course_registration
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

> Never commit real database passwords, API keys, or other secrets to GitHub.

## ▶️ How to Run

### 1. Clone the repository

```bash
git clone https://github.com/aravind614/Course-Registration-System.git
```

```bash
cd Course-Registration-System
```

### 2. Configure MySQL

Create a MySQL database:

```sql
CREATE DATABASE course_registration;
```

Update the database credentials in:

```text
backend/src/main/resources/application.properties
```

### 3. Run the Backend

Move into the backend directory:

```bash
cd backend
```

Run the Spring Boot application:

```bash
./mvnw spring-boot:run
```

On Windows:

```bash
mvnw.cmd spring-boot:run
```

The backend will run on:

```text
http://localhost:8080
```

### 4. Run the Frontend

Open the `frontend` folder in **VS Code**.

You can use **Live Server** or another local development server to run the HTML files.

Make sure the Spring Boot backend is running before using features that communicate with the API.

## 📚 What I Learned

Through this project, I practiced:

* Building REST APIs with Spring Boot
* Understanding Controller → Service → Repository architecture
* Using Spring Data JPA
* Connecting Spring Boot with MySQL
* Creating entity/model classes
* Performing database operations
* Connecting a JavaScript frontend with a Spring Boot backend
* Using the JavaScript Fetch API
* Handling HTTP requests and responses
* Using Git and GitHub for version control

## 🔮 Future Improvements

* Add user authentication and authorization
* Add JWT-based authentication
* Add course search and filtering
* Add admin dashboard
* Add course capacity management
* Add validation and better error handling
* Improve frontend UI/UX
* Deploy the frontend, backend, and database

## 👨‍💻 Author

**Aravind G**

Computer Science Engineering Student
Interested in **Backend Development, Java, Spring Boot, AI & ML, and Agentic AI**.

GitHub: [aravind614](https://github.com/aravind614)

---

⭐ If you find this project useful, consider giving it a star!
