// Express 25soles base + 3.50soles por kg
public class EnvioExpress implements EstrategiaEnvio {
    @Override public String getNombre() { return "Express (24-48 h)"; }
    @Override public double calcularCosto(Pedido pedido) {
        return 25.0 + 3.5 * pedido.getPesoTotalKg();
    }
}
