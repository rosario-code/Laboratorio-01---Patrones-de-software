// EmailNotifier.java
public class EmailNotifier implements Notificador {
    @Override public void enviar(String destinatario, String mensaje) {
        System.out.println("  [EMAIL -> " + destinatario + "] " + mensaje);
    }
}
