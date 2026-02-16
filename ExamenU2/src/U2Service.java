public class U2Service {

    // Validar precio
    public static boolean esPrecioValido(double p) {
        return p >= 0;
    }

    // Sumar al subtotal
    public static double calcularSubtotal(double subtotalActual, double precio) {
        return subtotalActual + precio;
    }

    // Calcular descuento
    public static double calcularDescuento(double subtotal, int metodoPago) {
        if (subtotal >= 500) {
            if (metodoPago == 1) { // efectivo
                return subtotal * 0.08;
            } else if (metodoPago == 2) { // tarjeta
                return subtotal * 0.05;
            }
        }
        return 0;
    }

    // Calcular total
    public static double calcularTotal(double subtotal, double descuento) {
        return subtotal - descuento;
    }
}