package pl.marcinsalamandra;

import lombok.NonNull;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AutaApplication {

    public static void main(String[] args) {
        SpringApplication.run(AutaApplication.class, args);
    }

    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addCorsMappings(@NonNull CorsRegistry registry) {
                registry.addMapping("/api/adverts").allowedOrigins("http://localhost:8081");
                registry.addMapping("/api/adverts/**").allowedOrigins("http://localhost:8081");
                registry.addMapping("/api/brands").allowedOrigins("http://localhost:8081");
                registry.addMapping("/api/models").allowedOrigins("http://localhost:8081");
                registry.addMapping("/api/models/**").allowedOrigins("http://localhost:8081");
                registry.addMapping("/api/**").allowedOrigins("http://localhost:8081");
            }
        };
    }
}
