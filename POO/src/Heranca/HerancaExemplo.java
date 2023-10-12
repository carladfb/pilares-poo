package Heranca;

public class HerancaExemplo {
    public static void main(String[] args) {
        FacebookMessenger facebook = new FacebookMessenger();
        Telegram telegram = new Telegram();
        MSNMessenger msn = new MSNMessenger();

        System.out.println("Facebook: ");
        facebook.enviarMensagem();
        facebook.receberMensagem();

        System.out.println("\nTelegram: ");
        telegram.enviarMensagem();
        telegram.receberMensagem();

        System.out.println("\nMSN: ");
        msn.enviarMensagem();
        msn.receberMensagem();
    }
}
