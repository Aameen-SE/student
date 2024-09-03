package linklst;

public class LnkdLstDemo {
    private Node head;
    private Node tail;
    
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
        }
    }

    public void append(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }else {
            tail.next=newNode;
            tail=newNode;
        }
    }


    public void printList(){
        Node currNode = head;
        if(head==null){
            System.out.println("List is empty ");
            return;
        }else {
            while(currNode!=null){
                System.out.print(currNode.data+" -> ");
                currNode=currNode.next;
            }
            System.out.println("NULL");
        }
    }
}
