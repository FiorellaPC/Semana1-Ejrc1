import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Cliente: ");
        scan.next();
        System.out.print("Producto: ");
        scan.next();
        System.out.print("Precio: ");
        int precio = scan.nextInt();
        System.out.print("Cantidad: ");
        int cantidad =scan.nextInt();

        int subtotal = precio * cantidad;
        double igv = (subtotal * 0.18);
        double total = subtotal - igv;

        System.out.println("Subtotal: s/ "+subtotal);
        System.out.println("IGV: s/ "+igv);
        System.out.println("Total: s/ "+total);
    }
}
