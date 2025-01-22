package com.example.ClientManagerAPI.DTO;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends CustomError {
    List<FieldMessage> errors = new ArrayList<>();

    public ValidationError() { }

    public ValidationError(Integer status, String error, String path) {
        super(status, error, path);
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addError(String fieldName, String message) {
        errors.add(new FieldMessage(fieldName, message));
    }
}
