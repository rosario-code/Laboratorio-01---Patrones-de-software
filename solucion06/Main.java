// Main
public class Main {
    public static void main(String[] args) {
        Pedido pedido = new Pedido("P-001", "ana@correo.com", "Peru");
        pedido.agregarLinea("Teclado", 1, 150.00, 1.2);
        pedido.agregarLinea("Mouse", 2, 45.00, 0.3);

        ProcesadorPedido procesador = new ProcesadorPedido(new EmailNotifier());

        System.out.println("=== Estrategias existentes ===");
        procesador.procesar(pedido, new EnvioEstandar());
        procesador.procesar(pedido, new EnvioExpress());
        procesador.procesar(pedido, new EnvioInternacional());

        System.out.println("\n=== Nueva estrategia y nuevo canal (sin modificar clases existentes) ===");
        Pedido pedido2 = new Pedido("P-002", "+51 987 654 321", "Peru");
        pedido2.agregarLinea("Audifonos", 1, 180.00, 0.4);
        Pedido pedido3 = new Pedido("P-003", "+51 952 123 456", "Peru");
        pedido3.agregarLinea("Monitor 24\"", 1, 620.00, 4.5);

        ProcesadorPedido procesadorSMS = new ProcesadorPedido(new SMSNotifier());
        procesadorSMS.procesar(pedido2, new EnvioMismoDia());
        procesadorSMS.procesar(pedido3, new EnvioMismoDia()); // > S/. 500: envio gratis
    }
}
