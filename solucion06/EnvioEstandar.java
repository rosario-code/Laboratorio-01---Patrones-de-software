// Estandar 10soles base + 2soles por kg
public class EnvioEstandar implements EstrategiaEnvio {
    @Override public String getNombre() { return "Estandar (3-5 dias)"; }
    @Override public double calcularCosto(Pedido pedido) {
        return 10.0 + 2.0 * pedido.getPesoTotalKg();
    }
}
