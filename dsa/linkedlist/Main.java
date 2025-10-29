package dsa.linkedlist;

public class Main {
    public static void main(String[] args) {

        LL linked = new LL();
        linked.insertFirst(3);
        linked.insertFirst(2);
        linked.insertFirst(1);

        linked.display();

        linked.insertLast(4);
        System.out.println();
        linked.display();

        //sout
        System.out.println("");

        linked.insertLast(6);

        linked.display();
        linked.insertAtIndex(5,4);
        System.out.println();
        linked.display();
        System.out.println();
        linked.deleteFirst();
        linked.display();
    }
}
