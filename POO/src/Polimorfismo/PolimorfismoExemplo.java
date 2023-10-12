package Polimorfismo;

public class PolimorfismoExemplo {
    public static void main(String[] args) {
        MensagemInstantanea mi = null;

        String appEscolhido = "Facebook";

        if (appEscolhido.equals("MSN"))
            mi = new MSNMessenger();
        else if (appEscolhido.equals("Facebook"))
            mi = new FacebookMessenger();
        else if (appEscolhido.equals("Telegram"))
            mi = new Telegram();

        mi.enviarMensagem();
        mi.receberMensagem();
    }
}
