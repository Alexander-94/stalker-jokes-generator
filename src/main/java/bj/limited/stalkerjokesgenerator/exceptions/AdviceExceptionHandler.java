package bj.limited.stalkerjokesgenerator.exceptions;

import bj.limited.stalkerjokesgenerator.api.dto.ErrorResponse;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.Time;
import java.time.Instant;

@RestControllerAdvice
public class AdviceExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(Exception.class)
    public ErrorResponse handleException(Exception ex, HttpServletRequest req) {
        return ErrorResponse.builder()
                .timestamp(Time.from(Instant.now()).toString())
                .status(HttpStatus.INTERNAL_SERVER_ERROR.value())
                .error(ex.getClass().getSimpleName())
                .message(ex.getMessage())
                .path(req.getRequestURI())
                .build();
    }

}
