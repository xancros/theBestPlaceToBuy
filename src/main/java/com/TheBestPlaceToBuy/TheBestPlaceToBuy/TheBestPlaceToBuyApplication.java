package com.TheBestPlaceToBuy.TheBestPlaceToBuy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2
@EnableEurekaClient
public class TheBestPlaceToBuyApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheBestPlaceToBuyApplication.class, args);
	}

	@Bean
	public Docket swaggerConfiguration(){
		//Return configuration of swagger site
		return new Docket(DocumentationType.SWAGGER_2).select()
				//Add the properties necessaries for swagger documentation
				.paths(PathSelectors.ant("/products/*")) //endPoints of the controllers
				.apis(RequestHandlerSelectors.basePackage("com.TheBestPlaceToBuy")) //package to look at of the models
				.build()
				.apiInfo(apiInfoConfiguration());

	}

	/*
	public ApiInfo(java.lang.String title,
       java.lang.String description,
       java.lang.String version,
       java.lang.String termsOfServiceUrl,
       Contact contact,
       java.lang.String license,
       java.lang.String licenseUrl)
	 */
	private ApiInfo apiInfoConfiguration(){
		return new ApiInfo("Product API","All the functions available for the products","Version 1.0.0","Prove of concept",
				new Contact("Aitor Subirat","https://github.com/xancros","aitor.subirat@gmail.com"),
				"free 4 all","none", Collections.emptyList());

	}
}
