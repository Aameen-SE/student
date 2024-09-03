package linklst;

public class LnkdListInteger {
    private Node head;
    private Node tail;

    class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public void append(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
    }

    public void printList(){
        Node curNode= head;
        if(head==null){
            System.out.println("List is empty ");
            return;
        }else {
            while(curNode!=null){
                System.out.print(curNode.data+" -> ");
                curNode=curNode.next;
            };
            System.out.println("NUll");
        }
    }
}
