package dailypractice;
//
//
//class Node {
//    int value;
//    Node next;
//
//    public Node(int value){
//        this.value=value;
//    }
//
//}
//
//

class Node {
    int value;
    Node next;

    public Node(int value){
        this.value=value;
    }
}
public class MegredTwoSortedList {

    public static void main(String[] args) {

        Node n1= new Node(1);
        n1.next=new Node(2);
        n1.next.next= new Node(3);

        Node n2 = new Node(1);
        n2.next=new Node(2);
        n2.next.next= new Node(4);

        Node mergeList = mergedList(n1,n2);
        printList(mergeList);

    }

    public static void printList(Node head){

        while (head!=null){
            System.out.print(head.value+" , ");
            head=head.next;
        }
        System.out.println();
    }

    public static Node mergedList(Node n1, Node n2){
             Node dummy = new Node(-1);
             Node current= dummy;

             while (n1!=null&&n2!=null){
                 if(n1.value<n2.value){
                     current.next=n1;
                     n1=n1.next;
                 }
                 else{
                     current.next=n2;
                     n2=n2.next;
                 }
                 current=current.next;
             }
             if(n1!=null) current.next=n1;
             if(n2!=null) current.next=n2;
        return dummy.next;
    }
}
//    public static void main(String[] args) {
//        Node node1= new Node(1);
//        node1.next=new Node(2);
//        node1.next.next=new Node(3);
//
//        Node node2 = new Node(1);
//        node2.next=new Node(2);
//        node2.next.next=new Node(4);
//
//        Node mergedNode = mergedNode(node1,node2);
//        printList(mergedNode);
//
//    }
//
//
//    public static void printList(Node head){
//        while(head!=null){
//            System.out.print(head.value+" ");
//            head=head.next;
//        }
//        System.out.println();
//    }
//
//
//
//    public static Node mergedNode(Node n1, Node n2){
//        Node dummy = new Node(-1);
//        Node current = dummy;
//
//        while(n1!=null&&n2!=null){
//            if(n1.value<n2.value){
//                current.next=n1;
//                n1=n1.next;
//            } else {
//                current.next=n2;
//                n2=n2.next;
//            }
//            current=current.next;
//        }
//        if (n1 != null) current.next = n1;
//      if (n2 != null) current.next = n2;
//        return dummy.next;
//    }
//}