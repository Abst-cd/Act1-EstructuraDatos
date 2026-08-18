public class LinkedList<T>{
    private Node<T> head;
    private Node<T> tail;


    public void insert(T d){
      Node<T> nuevoNodo = new Node<>(d, null, null);

      if(head == null){
          head = nuevoNodo;
          tail = nuevoNodo;
      } else {
        Node<T> current = head;
        while(current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(nuevoNodo);
        nuevoNodo.setPrev(current);

        tail = nuevoNodo;
      }
    }

    public void eliminarPorTelefono(String telefono){
        if (head == null){
            return;
        } 

        if (head.getData() instanceof Contacto && ((Contacto) head.getData()).getTelefono().equals(telefono)){
            head = head.getNext();

            if (head != null){
                tail = null;

            } 
            return;
        }

        Node<T> current = head;
        while(current.getNext() != null){
            if (current.getNext().getData() instanceof Contacto && ((Contacto) current.getNext().getData()).getTelefono().equals(telefono)){
                Node<T> nodoEliminado = current.getNext();
                
                current.setNext(nodoEliminado.getNext());
               
                if (nodoEliminado.getNext() == null){
                    tail = current;
                }
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

    public T getHead(){
        if(this.head != null){
            return this.head.getData();
        }
        return null;
    }

     public T getTail(){
        if (this.tail !=null){
            return this.tail.getData();
        }
        return null;
    }



}