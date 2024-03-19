package br.com.migueldelgado.picpaydesafiobackend.autorization;

public class UnauthorizedTransactionException extends RuntimeException{
    public UnauthorizedTransactionException (String message) {
        super(message);
    }

}
