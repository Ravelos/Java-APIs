package org.api.studies.petadoption.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
public class InvalidAdoptionException extends RuntimeException{
    public InvalidAdoptionException(String message){
        super(message);
    }
}
