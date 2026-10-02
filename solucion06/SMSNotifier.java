//  Nuevo canal
public class SMSNotifier implements Notificador {
    @Override public void enviar(String destinatario, String mensaje) {
        System.out.println("  [SMS -> " + destinatario + "] " + mensaje);
    }
}
