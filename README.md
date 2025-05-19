StudentRecordManagementSystem
This is a Spring Boot application for managing student records with MySQL as the database.

Prerequisites
Java 17

Maven

MySQL Server

Docker (optional, if running with Docker)

Running the Application
Option 1: Using Docker Compose (Recommended)
Clone the repository:

bash
Copy
Edit
git clone https://github.com/shailesh271997/SpringBoot_Project.git
cd SpringBoot_Project/StudentRecordManagementSystem
Build the project package:

bash
Copy
Edit
mvn clean package
Start the application with Docker Compose:

bash
Copy
Edit
docker compose up -d
Access the API:

cpp
Copy
Edit
http://<your-server-ip>:8484/StudentRecordManagementSystemApp
Option 2: Running Locally Without Docker
Create a MySQL database named studentdb on your local MySQL server:

sql
Copy
Edit
CREATE DATABASE studentdb;
Edit the src/main/resources/application.properties file and update the datasource URL, username, and password:

properties
Copy
Edit
spring.datasource.url=jdbc:mysql://localhost:3306/studentdb
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
Build and run the Spring Boot application:

bash
Copy
Edit
mvn clean package
java -jar target/StudentRecordManagementSystem-0.0.1-SNAPSHOT.war
Access the API at:

arduino
Copy
Edit
http://localhost:8484/StudentRecordManagementSystemApp
Notes
The application port is set to 8484 by default.

When running via Docker, ensure you update any IP-related settings if hosting on a different machine.

CORS configuration is included for cross-origin access.
