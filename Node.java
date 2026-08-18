public class Node<T>{

private T data;
private Node<T> next;
private Node<T> prev;

    public Node(T d, Node<T> nx, Node<T> pv){
        this.data = d;
        this.next = nx;
        this.prev = pv;
    }

    public T getData() {
        return data;
    }

    public Node<T> getNext() {
        return next;
    }

    public Node<T> getPrev(){
        return prev;
    }
    public void setData(T d) {
        this.data = d;
    }

    public void setNext(Node<T> nx) {
        this.next = nx;
    }

    public void setPrev(Node<T> pv){
        this.prev = pv;
    }
}