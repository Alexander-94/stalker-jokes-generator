package bj.limited.stalkerjokesgenerator.api.dto;

import lombok.*;

@Getter
@Setter
@ToString
@Builder
public class ErrorResponse {
    private String timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;
}
