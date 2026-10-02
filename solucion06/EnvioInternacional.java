// Internacional 60soles base + 8soles por kg + 5% del valor (aranceles/seguro)
public class EnvioInternacional implements EstrategiaEnvio {
    @Override public String getNombre() { return "Internacional"; }
    @Override public double calcularCosto(Pedido pedido) {
        return 60.0 + 8.0 * pedido.getPesoTotalKg() + 0.05 * pedido.getSubtotal();
    }
}
