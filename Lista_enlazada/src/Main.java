import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        ListaEnlazadaSimple lista = new ListaEnlazadaSimple();
        System.out.println("Demostracion de la lista enlazada simple");
        Scanner scanner = new Scanner(System.in);
        int option = -1;

        while(option != 0){
            System.out.println("");
            System.out.println("+--------+----------------------+");
            System.out.printf("| %-6s | %-20s |\n", "Opción", "Acción");
            System.out.println("+--------+----------------------+");
            System.out.printf("| %-6s | %-20s |\n", "1", "Insertar inicio");
            System.out.printf("| %-6s | %-20s |\n", "2", "Insertar final");
            System.out.printf("| %-6s | %-20s |\n", "3", "Eliminar inicio");
            System.out.printf("| %-6s | %-20s |\n", "4", "Eliminar");
            System.out.printf("| %-6s | %-20s |\n", "5", "Buscar");
            System.out.printf("| %-6s | %-20s |\n", "6", "Imprimir");
            System.out.printf("| %-6s | %-20s |\n", "7", "Tamaño lista");
            System.out.printf("| %-6s | %-20s |\n", "8", "Informacion memoria");
            System.out.printf("| %-6s | %-20s |\n", "9", "Lista vacia?");
            System.out.printf("| %-6s | %-20s |\n", "0", "Salir");
            System.out.println("+--------+----------------------+");
            System.out.print("Elige una opcion: ");
            option = scanner.nextInt();

            switch (option){
                case 1:
                    System.out.print("\nIngrese dato a insertar al inicio: ");
                    int datoInicio = scanner.nextInt();
                    lista.insertarAlInicio(datoInicio);
                    break;
                case 2:
                    System.out.print("\nIngrese dato a insertar al final: ");
                    int datoFinal = scanner.nextInt();
                    lista.insertarAlFinal(datoFinal);
                    break;
                case 3:
                    if(lista.eliminarAlInicio()) {
                        System.out.println("Elemento eliminado al inicio.");
                    }else {
                        System.out.println("Lista vacia.");
                    }
                    break;
                case 4:
                    System.out.print("Ingrese el dato a eliminar: ");
                    int datoEliminar = scanner.nextInt();
                    if(lista.eliminar(datoEliminar)) {
                        System.out.println("Elemento eliminado.");
                    }else {
                        System.out.println("Elemento no encontrado.");
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el dato a buscar: ");
                    int datoBuscar = scanner.nextInt();
                    if(lista.buscar(datoBuscar)) {
                        System.out.println("Elemento encontrado.");
                    }else {
                        System.out.println("Elemento no encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("\nElementos registrados.");
                    lista.imprimir();
                    break;
                case 7:
                    System.out.println("Tamaño de la lista: " + lista.tamanio());
                    break;
                case 8:
                    System.out.println("Informacion de la memoria: " + lista.informacionMemoria());
                    break;
                case 9:
                    System.out.println("Es una lista vacia? " + lista.esListaVacia());
                    break;
                case 0:
                    System.out.println("Saliendo del programa.....");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
        scanner.close();
    }



}