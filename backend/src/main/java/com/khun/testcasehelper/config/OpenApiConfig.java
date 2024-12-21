package com.khun.testcasehelper.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeIn;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Testcase Helper API",
                description = "API documentation for TestcaseHelper",
                version = "1.0.0",
                contact = @Contact(
                        name = "Developer Team",
                        url = "https://contact.testcasehelper.com",
                        email = "email@testcasehelper.com"
                ),
                termsOfService = "Term of service"
        ),
        servers = {
                @Server(
                        description = "local ENV",
                        url = "http://localhost:8080"
                ),
                @Server(
                        description = "PROD ENV",
                        url = "https://testcasehelper.org"
                )
        }
)
// the following is for security
@SecurityScheme(
        name = "bearerAuth",
        description = "add description",
        scheme = "bearer",
        type = SecuritySchemeType.HTTP,
        bearerFormat = "JWT",
        in = SecuritySchemeIn.HEADER
)
public class OpenApiConfig {}

