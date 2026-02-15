import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double subtotal = 0.0;

        while (true) {
            System.out.print("Precio (0 para terminar): ");

            if (!sc.hasNextDouble()) {
                System.out.println("Entrada inválida");
                return;
            }
            double p = sc.nextDouble();

             //Si p es 0 entonces break

            if (!U2Service.esPrecioValido(p)) {
                System.out.println("Precio inválido");
                continue;
            }

            subtotal = U2Service.calcularSubtotal(subtotal, p);
        }

        System.out.println("Método de pago: 1) Efectivo  2) Tarjeta");

        if (!sc.hasNextInt()) {
            System.out.println("Entrada inválida");
            return;
        }
        int metodo = sc.nextInt();

        if () { //Validacion de metodo de pago de 1 o 2
            System.out.println("Método inválido");
            return;
        }

        double descuento = U2Service.calcularDescuento(subtotal, metodo);
        double total = U2Service.calcularTotal(subtotal, descuento);

        System.out.println("=== TICKET ===");
        System.out.println("Subtotal: "+subtotal);
        System.out.println("Descuento: "+ descuento);
        System.out.println("Total: "+ total);
    }
}
