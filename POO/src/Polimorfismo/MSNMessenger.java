package Polimorfismo;

public class MSNMessenger extends MensagemInstantanea {
    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo MSN...");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo MSN...");
    }
}
