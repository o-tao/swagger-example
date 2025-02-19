package example.swagger.controller;

import example.swagger.dto.controller.SwaggerRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Swagger", description = "스웨거 API")
@RestController
@RequestMapping("/api/swagger")
public class SwaggerController {

    @Operation(summary = "Swagger 게시물 조회", description = "등록 된 Swagger 게시물을 조회합니다.")
    @GetMapping
    public String getSwagger() {
        return "swagger example";
    }

    @PostMapping
    public String postSwagger(@RequestBody SwaggerRequest swaggerRequest) {
        return "swagger example";
    }
}
