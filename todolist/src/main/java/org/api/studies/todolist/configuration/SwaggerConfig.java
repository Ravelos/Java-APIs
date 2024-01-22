package org.api.studies.todolist.configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
 public class SwaggerConfig {
        @Bean
        public GroupedOpenApi api(){
            return GroupedOpenApi.builder()
                    .group("OlaMundo")
                    .pathsToMatch("/**")
                    .build();
        }

        @Bean
        public OpenAPI apiInfo() {
            return new OpenAPI()
                    .info(new Info().title("To do list")
                            .description("To do list API")
                            .version("1.0.0")
                            .contact(new Contact()
                                    .name("To do list")
                                    .email("todolist@gmail.com")
                                    .url("www.todolist.org")
                            )
                    );
        }

}
