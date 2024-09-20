package corejava.sep10;

public class LnkList10Main {
    public static void main(String[] args) {
        LnkList10 li = new LnkList10();
     
        System.out.println("------ printing --------------");
        li.printList();

        System.out.println("------Adding at last or append and printing  --------------");
        li.addLast("1");
        li.printList();
        li.addLast("12");
        li.addLast("123");
        li.printList();

        System.out.println("-----remove last -------");
        li.removeLast();
        li.printList();

        System.out.println("------adding at first -----");
        li.addFirst("abc");
        li.printList();



    }
}
