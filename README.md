# 📝 Todo Application (Spring boot)

A minimal yet powerful **Task Management Application** built with **Spring Boot**, **Hibernate (JPA)**, and **MySQL**.  
The app follows the MVC architecture and provides an intuitive UI with **Thymeleaf** and **Bootstrap CSS**.

---

## 🚀 Features
- ➕ Add new tasks  
- ✅ Toggle tasks (mark complete/incomplete)  
- ❌ Delete tasks  
- 📊 Persistent storage with MySQL  

---

## 🛠️ Tech Stack

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)  
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)  
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)  
![Lombok](https://img.shields.io/badge/Lombok-CA0C17?style=for-the-badge&logo=java&logoColor=white)  
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)  
![Bootstrap](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)  

---

## 🏗️ Architecture / Workflow
This project follows the **MVC (Model–View–Controller)** pattern:

User → Controller → Service → Repository → Database
↑ ↓
View (Thymeleaf + Bootstrap) <--------

- **Controller**: Handles HTTP requests/responses  
- **Service**: Business logic (task creation, toggle, delete)  
- **Repository**: Data persistence with Hibernate/JPA  
- **Database**: MySQL stores task data  

---

## ⚙️ Setup Instructions

### 1. Clone the Repository
```
git clone https://github.com/your-username/todo-app.git
cd todo-app
```

2. Configure Database

Create a MySQL database, e.g., todo_db

Update application.properties with your DB credentials:

```
spring.datasource.url=jdbc:mysql://localhost:3306/todo_db
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD
spring.jpa.hibernate.ddl-auto=update
```
3. Run the Project
```
mvn spring-boot:run
```
4. Access the App

Open http://localhost:8080
 in your browser 🚀

📸 Screenshot

<img width="1754" height="624" alt="image" src="https://github.com/user-attachments/assets/23b590fa-b36c-4dd8-81d3-4c33ec2765a6" />



📄 License

This project is licensed under the MIT License

