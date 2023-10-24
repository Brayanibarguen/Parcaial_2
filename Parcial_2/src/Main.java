import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = Menu.getInstance();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menú:");
            System.out.println("1. Crear Juguete");
            System.out.println("2. Clonar Juguete");
            System.out.println("3. Eliminar Juguete");
            System.out.println("4. Ver Juguetes Actuales");
            System.out.println("5. Imprimir Peluches o Carritos");
            System.out.println("6. Imprimir Carrito con Mayor Número de Puertas");
            System.out.println("7. Convertir Set de Juguetes a Map");
            System.out.println("8. Eliminar Juguetes por Color");
            System.out.println("9. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = Integer.parseInt(scanner.nextLine());

            switch (opcion) {
                case 1:
                    // Implementación para crear juguete
                    break;
                case 2:
                    // Implementación para clonar juguete
                    break;
                case 3:
                    // Implementación para eliminar juguete
                    break;
                case 4:
                    // Implementación para ver juguetes actuales
                    break;
                case 5:
                    // Implementación para imprimir peluches o carritos
                    break;
                case 6:
                    // Implementación para imprimir carrito con mayor número de puertas
                    break;
                case 7:
                    // Implementación para convertir Set de juguetes a Map
                    break;
                case 8:
                    // Implementación para eliminar juguetes por color
                    break;
                case 9:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
                    break;
            }
        }
    }
}

