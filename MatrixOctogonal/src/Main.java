import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        OctogonalMatrix matriz = new OctogonalMatrix();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insertar vehículo");
            System.out.println("2. Buscar vehículo");
            System.out.println("3. Eliminar vehículo");
            System.out.println("4. Listar vehículos");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    Vehiculo vehiculo = new Vehiculo();
                    System.out.print("Ingrese la placa del vehículo: ");
                    vehiculo.setPlaca(scanner.next());
                    System.out.print("Ingrese el color del vehículo: ");
                    vehiculo.setColor(scanner.next());
                    System.out.print("Ingrese la línea del vehículo: ");
                    vehiculo.setLinea(scanner.next());
                    System.out.print("Ingrese el modelo del vehículo: ");
                    vehiculo.setModelo(scanner.nextInt());
                    System.out.print("Ingrese el propietario del vehículo: ");
                    vehiculo.setPropietario(scanner.next());
                    matriz.insert(vehiculo);
                    System.out.println("Vehículo insertado exitosamente.");
                    break;

                case 2:
                    System.out.print("Ingrese la placa del vehículo a buscar: ");
                    Vehiculo vehiculoBuscado = matriz.search(scanner.next());
                    if (vehiculoBuscado != null) {
                        System.out.println("Placa: " + vehiculoBuscado.getPlaca());
                        System.out.println("Color: " + vehiculoBuscado.getColor());
                        System.out.println("Línea: " + vehiculoBuscado.getLinea());
                        System.out.println("Modelo: " + vehiculoBuscado.getModelo());
                        System.out.println("Propietario: " + vehiculoBuscado.getPropietario());
                    } else {
                        System.out.println("El vehículo no se encontró.");
                    }
                    break;

                case 3:
                    System.out.print("Ingrese la placa del vehículo a eliminar: ");
                    boolean eliminado = matriz.delete(scanner.next());
                    if (eliminado) {
                        System.out.println("Vehículo eliminado exitosamente.");
                    } else {
                        System.out.println("El vehículo no se encontró.");
                    }
                    break;

                case 4:
                    matriz.list();
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opción inválida. Por favor intente de nuevo.");
                    break;
            }
        }
    }
}