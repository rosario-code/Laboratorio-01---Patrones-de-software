import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Pedido - Agregado del dominio: controla el ciclo de vida de sus lineas
public class Pedido {
    private final String id;
    private final String contactoCliente;
    private final String paisDestino;
    private final List<LineaPedido> lineas = new ArrayList<>(); // Composicion

    public Pedido(String id, String contactoCliente, String paisDestino) {
        this.id = id;
        this.contactoCliente = contactoCliente;
        this.paisDestino = paisDestino;
    }

    // Pedido crea sus partes internamente (composicion fuerte)
    public void agregarLinea(String producto, int cantidad, double precio, double pesoKg) {
        lineas.add(new LineaPedido(producto, cantidad, precio, pesoKg));
    }

    // Delegacion (ley de Demeter): los clientes piden el dato al Pedido, no recorren sus lineas
    public double getSubtotal() {
        return lineas.stream().mapToDouble(LineaPedido::getSubtotal).sum();
    }

    public double getPesoTotalKg() {
        return lineas.stream().mapToDouble(LineaPedido::getPeso).sum();
    }

    public String getId()              { return id; }
    public String getContactoCliente() { return contactoCliente; }
    public String getPaisDestino()     { return paisDestino; }
    public List<LineaPedido> getLineas() { return Collections.unmodifiableList(lineas); }
}
