import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
        Contacto cont1Predeterminado = new Contacto("Juan Perez", "Calle Falsa 123", "5551234");

        LinkedList<Contacto> listaContactos = new LinkedList<>();
        listaContactos.insert(cont1Predeterminado);


        int opcion = 0;
        while (opcion != 4) {
         System.out.println("Menu:");
        System.out.println("Elige opciones");
        System.out.println("1. Lista de integers");
        System.out.println("2. Hacer operaciones");
        System.out.println("3. Mostrar tipos de datos");
        System.out.println("4. Salir");

        opcion = Integer.parseInt(entrada.readLine());

        switch (opcion) {
            case 1:
                System.out.println("Lista de contactos actual");
                System.out.println("----------------------------");
                listaContactos.display();
                break;
            case 2:
                System.out.println("----------------------------");
                System.out.println("Que operacion desea realizar?");
                System.out.println("1. Insertar Contacto");
                System.out.println("2. Eliminar Contacto por Numero de Telefono");
                System.out.println("----------------------------");

                Byte subOpcion = Byte.parseByte(entrada.readLine());

                if(subOpcion ==1){
                    System.out.println("Contacto a insertar:");
                    String nombre = entrada.readLine();
                    System.out.println("Direccion:");
                    String direccion = entrada.readLine();
                    System.out.println("Telefono:");
                    String telefono = entrada.readLine();

                    Contacto cont = new Contacto(nombre, direccion, telefono);
                    listaContactos.insert(cont);
                    listaContactos.display();
                } else if(subOpcion == 2){
                    System.out.println("Telefono del contacto a eliminar: (EJEMPLO: 8112345678)");
                    String telefonoaEliminar = entrada.readLine();
                    listaContactos.eliminarPorTelefono(telefonoaEliminar);
                    listaContactos.display();
                }
                break;
                case 3:
                    System.out.println("----------------------------");
                    System.out.println("Mostrar tipos de datos:");
                    DataTypeExamples.ejemploPrimitivo();
                    DataTypeExamples.ejemploComplejo();
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
            default:
                break;
        }
    }
    }
      
}


