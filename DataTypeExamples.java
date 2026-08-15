public class DataTypeExamples<T>{

    public static void ejemploPrimitivo(){
    LinkedList<Integer> lista = new LinkedList<>();

    lista.insert(1);
    lista.insert(2);

    lista.display();
    }

    public static void ejemploComplejo(){

        class Persona{
            private String nombre;
            private int edad;

            public Persona(String nombre, int edad){
                this.nombre = nombre;
                this.edad = edad;
            }

            @Override
            public String toString(){
                return "Nombre: " + nombre + ", Edad: " + edad;
            }
        }
        
        LinkedList<Persona> listaPersonas = new LinkedList<>();
        listaPersonas.insert(new Persona("Juan", 25));
        listaPersonas.insert(new Persona("Maria", 30));
        listaPersonas.display();
    }
}



