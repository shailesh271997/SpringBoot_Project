# StudentRecordManagementSystem

This is a Spring Boot application for managing student records using MySQL as the database.

---

## Prerequisites

- Java 17  
- Maven  
- MySQL Server  
- Docker (optional, for containerized deployment)  

---

## Running the Application

### Using Docker Compose (Recommended)

1. Clone the repository:  
   `git clone https://github.com/shailesh271997/SpringBoot_Project.git`

2. Navigate to the application directory:  
   `cd SpringBoot_Project/StudentRecordManagementSystem`

3. Build the application package:  
   `mvn clean package`

4. Start the services using Docker Compose:  
   `docker compose up -d`

5. Access the application API at:  
   `http://<your-server-ip>:8484/StudentRecordManagementSystemApp`

**Note:** Replace `<your-server-ip>` with your server’s public IP address.

---

### Running Locally Without Docker

1. Create a MySQL database named `studentdb` on your local MySQL server.

2. Update the `application.properties` file located at `src/main/resources/application.properties` with your MySQL credentials and ensure the datasource URL points to:  
   `spring.datasource.url=jdbc:mysql://localhost:3306/studentdb`

3. Build the application package:  
   `mvn clean package`

4. Run the application:  
   `java -jar target/StudentRecordManagementSystem-0.0.1-SNAPSHOT.war`

5. Access the application API at:  
   `http://localhost:8484/StudentRecordManagementSystemApp`

---

## Important Notes

- The application runs on port `8484` by default.

- The Swagger UI for API documentation is available at:  
  `http://<your-server-ip>:8484/StudentRecordManagementSystemApp/swagger-ui.html`

- For environment flexibility, the base API URL in the code uses a relative path (`/StudentRecordManagementSystemApp`) rather than a hardcoded IP address.

- CORS configuration is included to allow cross-origin requests when accessing the API from different domains.

---

## Contribution

Feel free to fork the repository, open issues, or submit pull requests to improve the project.

---

Thank you for using StudentRecordManagementSystem!
