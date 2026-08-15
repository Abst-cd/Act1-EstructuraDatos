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

    public void display(){
        Node<T> current = head;
        while(current != null){
            System.out.println(current.getData());
            current = current.getNext();
        }
    }




}