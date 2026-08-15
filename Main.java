import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello, World!");

        LinkedList<Integer> listaIntegers = new LinkedList<>();
        listaIntegers.insert(10);
        listaIntegers.insert(20);
        listaIntegers.insert(30);

        System.out.println("Elementos en la lista enlazada:");
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));   

        System.out.println("Menu:");
        System.out.println("Elige opciones");
        System.out.println("1. Lista de integers");
        System.out.println("2. Mostrar elementos");
        Byte opcion = Byte.parseByte(entrada.readLine());


        switch (opcion) {
            case 1:
                System.out.println("Lista de integers:");
                System.out.println(listaIntegers);
                break;
        
            default:
                break;
        }
        listaIntegers.display();

      
    }
}
