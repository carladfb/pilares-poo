package Abstracao;

public class Abstracao {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        FacebookMessenger facebook = new FacebookMessenger();
        Telegram telegram = new Telegram();

        System.out.println("MSN: ");
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("\nFacebook: ");
        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("\nTelegram: ");
        telegram.enviarMensagem();
        telegram.receberMensagem();
    }
}
