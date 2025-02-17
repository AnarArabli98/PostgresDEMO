package com.anararabli.PostgresDEMO.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.util.*;

@ControllerAdvice
public class ExceptionHandler {

    private List<String> addMapValue(List<String> list, String newValue){
        list.add(newValue);

        return list ;
}
    @org.springframework.web.bind.annotation.ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> handleMethodArgumentNotValidException(MethodArgumentNotValidException ex){

        Map<String, List<String>> errors = new HashMap<>();

        for (ObjectError objerror : ex.getBindingResult().getAllErrors()) {

            String fieldName = ((FieldError) objerror).getField();

            if (errors.containsKey(fieldName)) {
                errors.put(fieldName, addMapValue(errors.get(fieldName), fieldName));
            } else {
                errors.put(fieldName, addMapValue(new ArrayList<>(), objerror.getDefaultMessage()));

            }
        }
        return ResponseEntity.badRequest().body(createApiError(errors));
    }

    private <T> ApiError<T> createApiError(T errors){

        ApiError<T> apiError = new ApiError<T>();
        apiError.setId(UUID.randomUUID().toString());
        apiError.setErrorTime(new Date());
        apiError.setErrors(errors);
        return apiError;


    }

}
