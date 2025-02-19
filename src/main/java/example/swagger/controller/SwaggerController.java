package example.swagger.controller;

import example.swagger.dto.controller.SwaggerRequest;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/swagger")
public class SwaggerController {

    @GetMapping
    public String getSwagger() {
        return "swagger example";
    }

    @PostMapping
    public String postSwagger(@RequestBody SwaggerRequest swaggerRequest) {
        return "swagger example";
    }
}
