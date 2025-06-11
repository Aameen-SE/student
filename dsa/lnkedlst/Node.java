package dsa.lnkedlst;

public class Node {
    String data;
    Node next;

    public Node(String data){
        this.data=data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void setNext(Node node) {
        this.next = node;
    }

    public Node getNext() {
        return next;
    }

    public String getData() {
        return data;
    }

}
