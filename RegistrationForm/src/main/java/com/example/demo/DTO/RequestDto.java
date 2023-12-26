package com.example.demo.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class RequestDto {
	

		
        @NotBlank(message = "name shouldn't be null or empty")
        @Pattern(regexp= "^[a-zA-Z]+$", message = "username must contain only letter")
		private String name;

		@Email(message = "invalid email address")
		private String email;

		@NotBlank(message = "password shouldn't be null or empty")
		private String password;
		
		

	}


