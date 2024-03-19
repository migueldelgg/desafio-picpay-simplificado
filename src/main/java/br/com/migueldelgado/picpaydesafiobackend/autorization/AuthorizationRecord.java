package br.com.migueldelgado.picpaydesafiobackend.autorization;

public record AuthorizationRecord(
        String message
) {
    public boolean isAuthorized(){
        return message.equals("Autorizado");
    }
}
