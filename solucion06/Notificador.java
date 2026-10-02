// Abstraccion: ProcesadorPedido ya no depende de EmailNotifier (DIP)
public interface Notificador {
    void enviar(String destinatario, String mensaje);
}
