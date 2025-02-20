package example.swagger.controller;

import example.swagger.dto.controller.SwaggerRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Swagger", description = "스웨거 API")
@RestController
@RequestMapping("/api/swagger")
public class SwaggerController {

    @Operation(summary = "Swagger 게시물 조회", description = "등록 된 Swagger 게시물을 조회합니다.")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "응답 성공"),
            @ApiResponse(responseCode = "400", description = "잘못된 요청")
    })
    @GetMapping("/{id}")
    public String getSwagger(
            @Parameter(name = "id", description = "사용자 ID", required = true, example = "1")
            @PathVariable Long id
    ) {
        return "swagger example " + id;
    }

    @PostMapping
    public String postSwagger(@RequestBody SwaggerRequest swaggerRequest) {
        return "swagger example";
    }
}
