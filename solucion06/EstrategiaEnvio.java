// Estrategia de Envio- Contrato (tipo) de las estrategias de envio
public interface EstrategiaEnvio {
    String getNombre();
    double calcularCosto(Pedido pedido);
}
