import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        U2Service codigo=new U2Service();
        Scanner sc = new Scanner(System.in);
        double subtotal = 0;

        // Captura de precios
        while (true) {
            System.out.print("Ingresa precio (0 para terminar): ");

            if (!sc.hasNextDouble()) {
                System.out.println("Entrada inválida");
                return;
            }

            double precio = sc.nextDouble();

            if (precio == 0) break;

            if (!codigo.esPrecioValido(precio)) {
                System.out.println("Precio inválido");
                continue;
            }

            subtotal = codigo.calcularSubtotal(subtotal, precio);
        }

        // Método de pago
        System.out.println("Método de pago: 1) Efectivo  2) Tarjeta");

        if (!sc.hasNextInt()) {
            return;
        }

        int metodo = sc.nextInt();

        if (metodo != 1 && metodo != 2) {
            return;
        }

        // Cálculos finales
        double descuento = codigo.calcularDescuento(subtotal, metodo);
        double total = codigo.calcularTotal(subtotal, descuento);

        // Ticket final
        System.out.println("\n--- TICKET ---");
        System.out.printf("Subtotal: %.2f\n", subtotal);
        System.out.printf("Descuento: %.2f\n", descuento);
        System.out.printf("Total: %.2f\n", total);
    }
}