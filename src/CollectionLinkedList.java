import java.util.Collections;
import java.util.LinkedList;

public class CollectionLinkedList {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst(7);
        linkedList.addLast(9);
        linkedList.add(5);
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println(linkedList);
        linkedList.offerFirst(4);
        linkedList.offerLast(2);
        linkedList.offer(8);
        System.out.println(linkedList);
        Collections.sort(linkedList);
        System.out.println(linkedList);
        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.pollFirst();
        linkedList.pollLast();
        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());
        System.out.println(linkedList.peekLast());
        System.out.println(linkedList.peek());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.get(1));
        System.out.println(linkedList.set(0,1));
        System.out.println(linkedList);
        linkedList.offerLast("строка");
        System.out.println(linkedList);
        System.out.println(linkedList.offerFirst(3));
        System.out.println(linkedList.offerLast(9));
        System.out.println(linkedList);
        linkedList.removeFirstOccurrence(3);
        linkedList.removeLastOccurrence(7);
        System.out.println(linkedList);
        System.out.println(linkedList.get(1));

    }
}
