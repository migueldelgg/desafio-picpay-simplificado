package br.com.migueldelgado.picpaydesafiobackend.notification;

public class NotificationException extends RuntimeException{
    public NotificationException(String message){
        super(message);
    }
}
