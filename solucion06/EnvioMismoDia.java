// MismoDia 35soles base + 4soles por kg; gratis si el pedido supera 500soles
public class EnvioMismoDia implements EstrategiaEnvio {
    @Override public String getNombre() { return "Mismo dia"; }
    @Override public double calcularCosto(Pedido pedido) {
        if (pedido.getSubtotal() > 500.0) return 0.0;
        return 35.0 + 4.0 * pedido.getPesoTotalKg();
    }
}
