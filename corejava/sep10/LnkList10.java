package corejava.sep10;

public class LnkList10 {
    private Node head;
    private Node tail;
    private int size ;

    class Node{
        String data;
        Node next;

       public  Node(String data){
            this.data=data;

        }
    }

    public void addLast(String data){
        Node newNode = new Node(data);

        if(head==null){
            head=newNode;
            tail=newNode;
        }else {
            tail.next=newNode;
            tail=newNode;
            }
        size++;
        }


        public void printList(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }else {
            Node temp=head;
            while (temp!=null){
                System.out.print(temp.data+" -> ");
                temp=temp.next;

            }
            System.out.println("NULL");
        }

        }

        public Node removeLast(){
            if(head==null){
                return null;
            }
            Node last = head;
            Node secndLast = head;
             while(last.next!=null){
                 secndLast=last;
                 last=last.next;
             }
             tail=secndLast;
             tail.next=null;
             size--;
             return last;

        }

        public void addFirst(String data){
        Node newNode = new Node(data);
            if(head==null){
                head=newNode;
                tail=newNode;
            }else {
                newNode.next=head;
                head=newNode;
            }
            size++;
        }





    }


