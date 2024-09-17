

package cola;

import java.util.Scanner;


public class ImpresoraSimulator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServerRequest server = new ServerRequest();

        while (true) {
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Agregar solicitud de impresión");
            System.out.println("2. Imprimir solicitud");
            System.out.println("3. Ver número de solicitudes pendientes");
            System.out.println("4. Mostrar todas las solicitudes pendientes");
            System.out.println("5. Imprimir todas las solicitudes pendientes");
            System.out.println("6. Salir");

            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el ID de la máquina: ");
                    String id = scanner.next();
                    System.out.print("Ingrese el nombre del documento: ");
                    String nombreDocumento = scanner.next();
                    System.out.print("Ingrese el número de páginas: ");
                    int numPaginas = scanner.nextInt();
                    System.out.print("Ingrese el número de copias: ");
                    int numCopias = scanner.nextInt();
                    RequestImpresion request = new RequestImpresion(id, nombreDocumento, numPaginas, numCopias);
                    server.addRequest(request);
                    System.out.println("Solicitud agregada exitosamente");
                    break;
                case 2:
                    server.printWork();
                    break;
                case 3:
                    System.out.println("Número de solicitudes pendientes: " + server.getNumRequest());
                    break;
                case 4:
                    System.out.println("Solicitudes pendientes:");
                    server.showAll();
                    break;
                case 5:
                    System.out.println("Imprimiendo todas las solicitudes pendientes:");
                    server.printAll();
                    break;
                case 6:
                    System.out.println("Saliendo del programa.");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        }
    }
}
    
    

