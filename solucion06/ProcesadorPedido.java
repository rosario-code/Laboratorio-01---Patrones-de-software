// Contexto: sin if/else y sin new EmailNotifier()
public class ProcesadorPedido {
    private final Notificador notificador; // (agregacion)

    public ProcesadorPedido(Notificador notificador) {
        if (notificador == null) throw new IllegalArgumentException("Notificador requerido.");
        this.notificador = notificador;
    }

    // La estrategia de envio llega como parametro: el procesador solo conoce la interfaz
    public double procesar(Pedido pedido, EstrategiaEnvio envio) {
        double costoEnvio = envio.calcularCosto(pedido);
        double total = pedido.getSubtotal() + costoEnvio;
        System.out.printf("Pedido %s | Envio: %s | Subtotal: S/. %.2f | Envio: S/. %.2f | Total: S/. %.2f%n",
                pedido.getId(), envio.getNombre(), pedido.getSubtotal(), costoEnvio, total);
        notificador.enviar(pedido.getContactoCliente(),
                String.format("Su pedido %s fue confirmado. Total: S/. %.2f", pedido.getId(), total));
        return total;
    }
}
