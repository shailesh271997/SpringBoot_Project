package com.project.StudentRecordManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="StudentRecordSystem API",
				version="v1.0",
				description="This API will register and get you the existing records of students"
				),
		servers=@Server(
				url="/StudentRecordManagementSystemApp",
				description="This API is deployed in the above url"
				)
		)
public class StudentRecordManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentRecordManagementSystemApplication.class, args);
	}

}
