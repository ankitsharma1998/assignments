package com.springrestapi.Springrestapi;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "employee with provided id is not found")
public class EmployeeNotFoundException extends Throwable {
    public EmployeeNotFoundException(String incorrect_id) {
        super(incorrect_id);
    }
}
