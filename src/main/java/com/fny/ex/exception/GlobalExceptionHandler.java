package com.fny.ex.exception;

import com.fny.ex.core.R;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(UserNotFoundException.class)
    public R<String> handleUserNotFoundException(UserNotFoundException ex) {
        return new R<String>(405, "user error: " + ex.getMessage(), HttpStatus.NOT_FOUND.getReasonPhrase());
    }

    @ExceptionHandler(Exception.class)
    public R<String> handleGenericException(Exception ex) {
        return new R<String>(404, "An error occurred: " + ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR.getReasonPhrase());
    }
}
