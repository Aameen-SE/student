package linklst;

public class LL {
   private Node head;
           private Node tail;
    private int size;
        LL(){
            this.size=0;
        }
        class Node{
            String data;
            Node next;

            Node(String data){
                this.data=data;
                this.next=null;
                size++;
            }

            }


    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }


    public void addLast(String data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
            tail=newNode;
            return;
        }
        else {
            tail.next=newNode;
            tail=newNode;
        }
    }
    public void printList(){
        if(head==null){
            System.out.println("List is empty ");
            return;
        }
        Node currNode = head;
        while(currNode !=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }

    public void deleteFirst(){
            if(head==null){
                System.out.println("The list is empty ");
                return ;
            }
            size--;
            head=head.next;
    }

    public void deleteLast(){
            if(head==null){
                System.out.println("The list is empty");
                return;
            }
            size--;
            if(head.next==null){
                head=null;
                return;
            }
            Node secondLast=head;
            Node lastNode = head.next;
            while(lastNode.next!=null){
                lastNode=lastNode.next;
                secondLast=secondLast.next;
            }
            secondLast=null;
    }

    public int getSize(){
            return size;
    }

    public static void main(String[] args) {
    LL list = new LL();
   list.addLast("This");
  list.addLast("is");
  list.printList();
    }
}
