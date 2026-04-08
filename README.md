# 📚 Library Management System

A RESTful Library Management application built with Spring Boot, Hibernate ORM, and MySQL.

---

## 🛠️ Tech Stack

![Java](https://img.shields.io/badge/Java-22-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.0-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-7.1.5-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-9.5.0-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-Build_Tool-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)

---

## 🚀 Getting Started

### Prerequisites

- Java 22+
- Maven 3.x
- MySQL Server

### Setup

1. **Clone the repository**
   ```bash
   git clone https://github.com/BuddheemaRyan/Library_Management.git
   cd Library_Management
   ```

2. **Configure the database**  
   Update your MySQL connection details in `src/main/resources/application.properties`:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/library_db
   spring.datasource.username=your_username
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. **Build & Run**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

---

## 📁 Project Structure

```
Library_Management/
├── src/
│   └── main/
│       └── java/edu/icet/ecom/
│           └── Main.java
├── pom.xml
└── README.md
```

---

## 📄 License

This project is open-source and available under the [MIT License](LICENSE).
