package pl.marcinsalamandra.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.HttpStatus.*;

@RestControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(AdvertNotFoundException.class)
    public ResponseEntity<Object> handleAdvertNotFoundException(AdvertNotFoundException e) {
        ApiException apiException = new ApiException(
                e.getMessage(),
                NOT_FOUND
        );

        return new ResponseEntity<>(apiException, apiException.getHttpStatus());
    }

}
