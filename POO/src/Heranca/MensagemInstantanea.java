package Heranca;

public class MensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();

        System.out.println("Enviando mensagem...");

        salvarHistoricoMensagem();
    }

    public void receberMensagem() {
        System.out.println("Recebendo mensagem...");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se setá concectado a internet...");
    }

    private void salvarHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem...");
    }
}
