package com.programming.restapi.Swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

public class SwaggerConfig {
	
public OpenAPI customOpenAPI() {
		
		return new OpenAPI()
				.info(new Info()
						.title("Product Category API")
						.description("API documentation for Product and Category")
						.version("2.6.0")
						.contact(new Contact()
								.name("Snehal Nepte")
								.email("neptesnhal@gmail.com")
								.url("https://google.com"))
						);
					}
}
