public class DoubleLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;

    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void goForward(){
        Node<T> current = head;
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }

    public void goBackward(){
        Node<T> current = tail;
        while(current != null){
        System.out.println(current.getData());
            current = current.getPrev();
        }
    }

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
