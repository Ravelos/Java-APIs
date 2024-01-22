package org.api.studies.petadoption.configuration;

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
                    .group("Pet Adoption")
                    .pathsToMatch("/**")
                    .build();
        }

        @Bean
        public OpenAPI apiInfo() {
            return new OpenAPI()
                    .info(new Info().title("Pet Adoption")
                            .description("An Api for registering pets that need tobe adopted")
                            .version("1.0.0")
                            .contact(new Contact()
                                    .name("Pet Adoption")
                                    .email("petadoption@gmail.com")
                                    .url("www.petadoption.org")
                            )
                    );
        }
}
