package dsa.linkedlist;

public class Main {
    public static void main(String[] args) {

        LL linked = new LL();
        linked.insertFirst(3);
        linked.insertFirst(2);
        linked.insertFirst(1);

        linked.insertLast(4);

        linked.insertAtIndex(5,4);


        linked.display();
        System.out.println();


        System.out.println(linked.deleteLast());
        linked.display();
        System.out.println();
        System.out.println(linked.deleteAtIndex(2));
        linked.display();


//        System.out.println();
//        linked.deleteFirst();
//        linked.display();
    }
}
