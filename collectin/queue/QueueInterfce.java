package collectin.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthCompar implements Comparator<String>{
    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value1.length(),value2.length());
    }
}
public class QueueInterfce {
    public static void main(String[] args) {
        Queue<String> word = new PriorityQueue<>(new StringLengthCompar());
        word.add("Apple");
        word.addAll(List.of("Monkey","Cat","Zebra"));
        System.out.println(word);
        System.out.println("Using poll method in queue pollWord : "+word.poll());
        System.out.println("After using the poll method "+word);




    }
}
