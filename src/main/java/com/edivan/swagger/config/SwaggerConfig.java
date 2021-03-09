package com.edivan.swagger.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

//	@Bean
//	public Docket productApi() {
//		return new Docket(DocumentationType.SWAGGER_2).select()
//				.apis(RequestHandlerSelectors.basePackage("com.edivan.swagger")).paths(PathSelectors.any()).build()
//				.apiInfo(metaInfo());
//	}
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select()
				.apis(RequestHandlerSelectors.basePackage("com.edivan.swagger"))
				.paths(PathSelectors.any())
				.build()
				.apiInfo(metaInfo());
	}
	
	private ApiInfo metaInfo() {

		ApiInfo apiInfo = new ApiInfo("Produto API REST", "API REST de Cadastro de Escola,"
				+ " Turma, Disciplina, matriculaDisciplinaPessoa e Aluno.", "1.0",
				"Terms of Service",
				new Contact("Edivan Carvalho", "edivancarvalho2008@hotmail.com","https://github.com/edivancarvalho"),
				"Apache License Version 2.0", "https://www.apache.org/licesen.html", new ArrayList<VendorExtension>());

		return apiInfo;
	}
}
