package org.studies.videoscatalog.configuration;


import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("Video Catalog")
                .pathsToMatch("/**")
                .build();
    }

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info().title("VideoCatalog API")
                        .description("Catalog of videos")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Video Catalog")
                                .email("videocatalog@gmail.org")
                                .url("www.vc.org")
                        )
                );
    }
}