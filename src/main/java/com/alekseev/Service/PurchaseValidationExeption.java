package com.alekseev.Service;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST,reason = "xml document is not valid")
public class PurchaseValidationExeption extends RuntimeException{
    public PurchaseValidationExeption(){
    }
}
