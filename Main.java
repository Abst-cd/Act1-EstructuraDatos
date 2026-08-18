import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   
        Contacto cont1Predeterminado = new Contacto("pepito", "24/07/2000", "ave real 123", "52810978121");
        Contacto cont2Predeterminado = new Contacto("juanito", "25/07/2001", "ave real 456", "52840978121");
        Contacto cont3Predeterminado = new Contacto("maria", "26/07/2002", "ave real 789", "52810945321");


        System.out.println("EJEMPLOS LISTA FUNCIONANDO");
        System.out.println("--------------");

        System.out.println("Lista enlazada normal:");
        LinkedList<Contacto> listaContactos = new LinkedList<>();
        listaContactos.insert(cont1Predeterminado);
        listaContactos.insert(cont2Predeterminado);
        listaContactos.insert(cont3Predeterminado);

        listaContactos.display();

        System.out.println("--------------");
        System.out.println("--------------");
        System.out.println("--------------");


            System.out.println("Doble lista");      
            DoubleLinkedList<Contacto> listaContactos2 = new DoubleLinkedList<>();
            listaContactos2.insert(cont1Predeterminado);
            listaContactos2.insert(cont2Predeterminado);
            listaContactos2.insert(cont3Predeterminado);
            
            System.out.println("Hacia adelante:");
            System.out.println("--------------");

            listaContactos2.goForward();


            System.out.println("--------------");
            System.out.println("Hacia atras");


            listaContactos2.goBackward();

            
 
        int opcion = 0;
        while (opcion != 4) {
         System.out.println("Menu:");
        System.out.println("Elige opciones");
        System.out.println("1. Mostrar listas");
        System.out.println("2. Hacer operaciones en las listas");
        System.out.println("3. Mostrar tipos de datos");
        System.out.println("4. Salir");

        opcion = Integer.parseInt(entrada.readLine());

        switch (opcion) {
            case 1:
                System.out.println("Lista de contactos actual LinkedList");
                System.out.println("----------------------------");
                listaContactos.display();
                System.out.println("----------------------------");
                System.out.println("----------------------------");
                System.out.println("Lista de contactos actual DoubleLinkedList");
                listaContactos2.display();
                System.out.println("----------------------------");

                break;
            case 2:
               menuOperacionesCaso2(listaContactos, listaContactos2, entrada);
               break;
            case 3:

                System.out.println("Ejemplos de tipos de datos metidos a lista:");
                DataTypeExamples listas = new DataTypeExamples<>();
                listas.ejemploPrimitivo();
                listas.meterObjetoaLista();
                listas.meterStringsDoubleL();
                break;
        }
        
    }
    
  

    }


    public static void menuOperacionesCaso2(
        LinkedList<Contacto> listaContactos,
        DoubleLinkedList<Contacto> listaContactos2,
        BufferedReader entrada) throws IOException {

    System.out.println("----------------------------");
    System.out.println("Que lista desea modificar?");
    System.out.println("1. LinkedList");
    System.out.println("2. DoubleLinkedList");
    System.out.println("----------------------------");

    byte subOpcion = Byte.parseByte(entrada.readLine());

    switch (subOpcion) {
        case 1:
            System.out.println("Elegiste LinkedList");
            System.out.println("Lista:");
            listaContactos.display();

            System.out.println("----------------------------");
            System.out.println("Que desea hacer?");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar por Telefono");
            System.out.println("3. Obtener el primer dato");
            System.out.println("4. Regresar");


            byte subOpcionMenuOperacionesCaso2 = Byte.parseByte(entrada.readLine());
            
            switch (subOpcionMenuOperacionesCaso2) {
                case 1:
                    System.out.println("\nContacto a insertar:");
                    System.out.println("Nombre:");
                    String nombre = entrada.readLine();
                    System.out.println("Fecha de nacimiento:");
                    String fechaNacimiento = entrada.readLine();
                    System.out.println("Direccion:");
                    String direccion = entrada.readLine();
                    System.out.println("Telefono:");
                    String telefono = entrada.readLine();

                    Contacto cont = new Contacto(nombre, fechaNacimiento, direccion, telefono);
                    listaContactos.insert(cont);

                    System.out.println("\nContacto insertado.");
                    System.out.println("Lista actualizada:");
                    System.out.println("----------------------------");
                    listaContactos.display();
                    break;

                case 2:
                    System.out.println("Opción de eliminar en LinkedList");
                    System.out.println("Telefono del contacto a eliminar: (EJEMPLO: 8112345678)");
                    String telefonoaEliminar = entrada.readLine();
                    listaContactos.eliminarPorTelefono(telefonoaEliminar);
                    listaContactos.display();

                    break;
                case 3:
                    System.out.println("El primer dato de la lista es:");
                    System.out.println(listaContactos.getHead());
                break;

                default:
                    System.out.println("Opción no válida");
                    break;
            }
            break; 

        case 2:
            System.out.println("Elegiste DoubleLinkedList");
            System.out.println("Que desea hacer?");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar por Telefono");
            System.out.println("3. Obtener el primer dato");
            System.out.println("4. Obtener el ultimo dato");
            System.out.println("5. Regresar");

            byte subOpcionMenuOperacionesCaso2DOUBLE = Byte.parseByte(entrada.readLine());
            
            switch (subOpcionMenuOperacionesCaso2DOUBLE) {
                case 1:
                    System.out.println("\nContacto a insertar:");
                    System.out.println("Nombre:");
                    String nombreD = entrada.readLine();
                    System.out.println("Fecha de nacimiento:");
                    String fechaNacimientoD = entrada.readLine();
                    System.out.println("Direccion:");
                    String direccionD = entrada.readLine();
                    System.out.println("Telefono:");
                    String telefonoD = entrada.readLine();

                    Contacto contD = new Contacto(nombreD, fechaNacimientoD, direccionD, telefonoD);
                    listaContactos2.insert(contD);

                    System.out.println("\nContacto insertado.");
                    System.out.println("Lista actualizada:");
                    System.out.println("----------------------------");
                    listaContactos2.display();
                    break;

                case 2:
                    System.out.println("Opción de eliminar en DoubleLinkedList por Telefono");
                    System.out.println("Telefono del contacto a eliminar: (EJEMPLO: 8112345678)");
                    String telefonoaEliminarDouble = entrada.readLine();
                    listaContactos.eliminarPorTelefono(telefonoaEliminarDouble);
                    listaContactos.display();
                    break;
                case 3:
                    System.out.println("El primer dato de la lista es:");
                    System.out.println(listaContactos2.getHead());
                    break;
                case 4:
                    System.out.println("El primer dato de la lista es:");
                    System.out.println(listaContactos2.getTail());
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Opcion no valida");
                    break;
                
            }
            break; 

        default:
            System.out.println("Opción no valida");
            break;
    }
}
}



