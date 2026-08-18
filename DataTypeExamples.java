public class DataTypeExamples<T>{

    public void ejemploPrimitivo(){
    LinkedList<Integer> lista = new LinkedList<>();

    lista.insert(1);
    lista.insert(2);

    lista.display();
    }

    public void meterObjetoaLista(){
        LinkedList<Persona> listaPersonas = new LinkedList<>();
        listaPersonas.insert(new Persona("pedro", "07/24/2000"));
        listaPersonas.insert(new Persona("maria", "08/17/2000"));
        listaPersonas.insert(new Persona("luis", "09/10/2000"));

        listaPersonas.display();

    }

    public void meterStringsDoubleL(){
        DoubleLinkedList<String> listaStringsD = new DoubleLinkedList<>();

        listaStringsD.insert("a");
        listaStringsD.insert("b");
        listaStringsD.insert("publicclassmain");

        listaStringsD.display();
    }

    }




