package example.swagger.dto.controller;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;

@Getter
public class SwaggerRequest {

    @Schema(name = "이름", description = "회원 이름", example = "tao")
    private String name;
    private String gender;
    @Schema(description = "회원 나이", example = "20", nullable = true)
    private int age;
}
