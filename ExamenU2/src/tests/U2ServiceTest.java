public class U2ServiceTest {

    private static void assertEq(double a, double b, double eps, String msg) {
        if (Math.abs(a - b) > eps) throw new AssertionError("FALLÓ: " + msg);
    }

    public static void main(String[] args) {
        double sub = 0.0;
        sub = U2Service.calcularSubtotal(sub, 100.0);
        sub = U2Service.calcularSubtotal(sub, 50.0);
        assertEq(sub, 150.0, 0.0001, "subtotal");

        assertEq(U2Service.calcularDescuento(600.0, 1), 48.0, 0.0001, "8% efectivo");
        assertEq(U2Service.calcularDescuento(600.0, 2), 30.0, 0.0001, "5% tarjeta");
        assertEq(U2Service.calcularDescuento(400.0, 1), 0.0, 0.0001, "sin descuento");

        assertEq(U2Service.calcularTotal(600.0, 48.0), 552.0, 0.0001, "total");

        System.out.println("✅ Pruebas OK (2D).");
    }
}
