import java.util.ArrayList;

public class Temp {
    public static void main(String[] args) {
/*        Queue collection = new PriorityQueue();

        collection.offer("1");
        collection.offer("2");
        collection.offer("3");
        System.out.println(collection.size());
        for (int i = 0; i <= collection.size(); i++){
            System.out.println(i);
            System.out.println(collection.peek());
            System.out.println(collection.poll());
            System.out.println(collection);
        }
        System.out.println(collection.size());*/

        ArrayList list = new ArrayList();

        list.add(9);
        list.add(8);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(1);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
    }
}
