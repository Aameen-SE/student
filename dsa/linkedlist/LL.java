package dsa.linkedlist;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size=0;
    }



// deletefirst

    public void deleteFirst(){
        head= head.next;
        size--;
    }
    // insert value at index

    public void insertAtIndex(int val, int index){

        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }

        Node  temp = head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }

        Node node = new Node(val,temp.next);
        temp.next=node;
        size=+1;

    }

    // insertLast

    public void insertLast(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node= new Node(val);
        tail.next=node;
        tail=node;
        size=+1;
    }

    // insert first

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next=head;
        head=node;

        if(tail==null){
            tail=head;
        }
        size=+1;
    }

    // display

    public void display(){
        Node temp = head;

        while (temp!=null){
            System.out.print(temp.val+" -> ");
            temp=temp.next;
        }
        System.out.print("End");
    }

    private class Node{
        private int val;
        private Node next;



        public Node(int val){
            this.val=val;
        }
        public Node(int val,Node next){
            this.val=val;
            this.next=next;
        }

    }
}
