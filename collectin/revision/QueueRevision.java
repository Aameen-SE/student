package collectin.revision;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
class AscCom implements Comparator<String>{


    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(),o2.length());
    }
}
public class QueueRevision {
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new AscCom());
        queue.add("Apple");
        queue.addAll(List.of("Mango","Orange","PineApple","Grapes"));
        System.out.println(queue);

    }
}
