# 👤 User Management System

A beginner-friendly **User Management System** built with **Spring Boot** (REST API) and a plain **HTML, CSS, JavaScript** frontend. This project demonstrates how a frontend communicates with a backend over REST APIs using JSON.

---

## 🔧 Tech Stack

| Layer | Technology |
|---|---|
| Language | Java 21 |
| Framework | Spring Boot |
| Database | H2 (in-memory) |
| ORM | Spring Data JPA / Hibernate |
| Build Tool | Maven |
| Frontend | HTML, CSS, JavaScript (Fetch API) |
| Deployment | AWS EC2 (Ubuntu 22.04) |

---

## ✨ Features

- ➕ Create users (POST request)
- 📋 Fetch all users (GET request)
- 🔍 Search users by name
- 🗑️ Delete users
- RESTful API architecture
- JSON-based communication
- Frontend connected using JavaScript `fetch()`

---

## 🚀 Deployment

This project is deployed on an **AWS EC2** VPS running Ubuntu 22.04.

### What was set up on the server:
- Java 21 (openjdk-21-jdk)
- Maven (for building the JAR)
- Git (for cloning the repo)
- systemd service (keeps the app running 24/7)

### Steps to deploy:
```bash
# 1. Clone the project
mkdir ~/projects
cd ~/projects
git clone https://github.com/AsifQamar/springboot-user-management.git
cd springboot-user-management/usermanagement

# 2. Build the JAR
mvn clean package -DskipTests

# 3. Run
java -jar target/*.jar
```

---

## 🏃 Run Locally

### Prerequisites
- Java 17+ installed
- Maven installed

```bash
git clone https://github.com/AsifQamar/springboot-user-management.git
cd springboot-user-management/usermanagement
mvn spring-boot:run
```

Open `http://localhost:8080` in your browser.

---

## 📁 Project Structure

```
usermanagement/
├── src/
│   ├── main/
│   │   ├── java/com/asif/usermanagement/
│   │   │   ├── controller/   # REST Controllers
│   │   │   ├── model/        # Entity classes
│   │   │   ├── repository/   # JPA Repositories
│   │   │   └── service/      # Business logic
│   │   └── resources/
│   │       └── static/       # HTML, CSS, JS frontend
└── pom.xml
```

---

## 📸 Screenshots

<img width="1915" height="1011" alt="image" src="https://github.com/user-attachments/assets/633457fe-7771-45c3-9c78-67f6b44cc505" />


---

## 🌱 What I Learned

- Building REST APIs with Spring Boot
- Connecting a frontend to a backend using `fetch()`
- Linux server basics (file system, permissions, processes)
- Deploying a Java app on a real VPS (AWS EC2)
- Setting up a systemd service for 24/7 uptime

---

## 👨‍💻 Author

**Asif Qamar**  
[GitHub](https://github.com/AsifQamar) • [LinkedIn](https://www.linkedin.com/in/asif-qamar)

---

⭐ If you found this helpful, give it a star!
