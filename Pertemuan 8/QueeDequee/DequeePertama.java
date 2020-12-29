import java.util.ArrayDeque;
import java.util.Deque;

class DequeePertama {
    public static void main(String[] args) {
        Deque<String> deque=new ArrayDeque<String>();
        deque.offer("Arvind");
        deque.offer("Vimal");
        deque.add("Mukul");
        deque.offerFirst("Jai");
        System.out.println("After offerFirst Traversal....");
        for(String s:deque){
            System.out.println(s);
        }
        // deque.poll();
        // deque.pollFirst();//it is same as poll()
        deque.pollLast();
        System.out.println("After pollLast() Traversal....");
        for(String s:deque){
            System.out.println(s);
        }
    }
}
