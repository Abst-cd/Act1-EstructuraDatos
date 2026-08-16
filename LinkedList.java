public class LinkedList<T>{
    private Node<T> head;

    public void insert(T d){
      Node<T> nuevoNodo = new Node<>(d, null);

      if(head == null){
          head = nuevoNodo;
      } else {
        Node<T> current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(nuevoNodo);
      }
    }

    public void eliminarPorTelefono(String telefono){
        if (head == null){
            return;
        } 

        if (head.getData() instanceof Contacto && ((Contacto) head.getData()).getTelefono().equals(telefono)){
            head = head.getNext();
            return;
        }

        Node<T> current = head;
        while(current.getNext() != null){
            if (current.getNext().getData() instanceof Contacto && ((Contacto) current.getNext().getData()).getTelefono().equals(telefono)){
                current.setNext(current.getNext().getNext());
                return;
            }
            current = current.getNext();
        }

    }


    public void display(){
        Node<T> current = head;
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }




}