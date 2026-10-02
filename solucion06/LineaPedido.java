// Parte compuesta: solo la crea y la posee un Pedido (composicion)
public class LineaPedido {
    private final String producto;
    private final int cantidad;
    private final double precioUnitario;
    private final double pesoUnitarioKg;

    LineaPedido(String producto, int cantidad, double precioUnitario, double pesoUnitarioKg) {
        if (producto == null || cantidad <= 0 || precioUnitario < 0 || pesoUnitarioKg < 0) {
            throw new IllegalArgumentException("Datos de linea invalidos.");
        }
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
        this.pesoUnitarioKg = pesoUnitarioKg;
    }

    public double getSubtotal() { return cantidad * precioUnitario; }
    public double getPeso()     { return cantidad * pesoUnitarioKg; }
    public String getProducto() { return producto; }
}
