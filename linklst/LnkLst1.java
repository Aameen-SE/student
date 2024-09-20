package linklst;

public class LnkLst1 {
    private Node head;
    private Node tail;
    
    class Node {
        String value;
        Node next;


        Node(String value) {
            this.value = value;

        }
    }

    public void addLast(String value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }

    }

    public void printList() {

        if (head == null) {
            System.out.println("List is empty ");
            return;

        } else {
            Node currNode = head;
            while (currNode != null) {
                System.out.print(currNode.value + " -> ");
                currNode = currNode.next;
            }
            System.out.println("NULL");
        }
        System.out.println("Length of node ");

    }

    public static void main(String[] args) {
        LnkLst1 list = new LnkLst1();
        list.printList();
        System.out.println("-------adding : ---------");
        list.addLast("1");
        list.printList();
        System.out.println("-------adding : ---------");
        list.addLast("12");
        list.addLast("123");
        list.addLast("1234");
        list.printList();
    }

}












