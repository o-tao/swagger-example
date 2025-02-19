package example.swagger.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openAPI() {
        Server devServer = new Server();
        devServer.setUrl("/");

        Server prodServer = new Server();
        prodServer.setUrl("운영 URL");

        Info info = new Info()
                .title("Swagger API")
                .version("1.0.0")
                .description("Swagger API Description");

        return new OpenAPI()
                .info(info)
                .servers(List.of(devServer, prodServer));
    }
}
