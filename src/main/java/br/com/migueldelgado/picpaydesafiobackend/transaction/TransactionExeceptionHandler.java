package br.com.migueldelgado.picpaydesafiobackend.transaction;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class TransactionExeceptionHandler {

    @ExceptionHandler(InvalidTransactionException.class)
    public ResponseEntity<Object> handle(InvalidTransactionException e){
        return ResponseEntity.badRequest().body(e.getMessage());
    }
}
