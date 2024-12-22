package com.tradingplatform.Exception;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomExceptionHandler {
    private String message;
    private boolean success;
    private HttpStatus httpStatus;
    private LocalDate localDate;
}
