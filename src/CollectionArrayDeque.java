import java.util.ArrayDeque;
import java.util.Queue;

public class CollectionArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(3);
        System.out.println(deque);
        deque.addFirst(5);
        System.out.println(deque);
        deque.addLast(7);
        System.out.println(deque);
        deque.addFirst(8);
        System.out.println(deque);
        deque.addLast(4);
        System.out.println(deque);
        deque.add(9);
        System.out.println(deque);
        deque.add(1);
        System.out.println(deque);
        deque.add(6);
        System.out.println(deque);
        System.out.println(deque.offerFirst(70)); // добавляет элемент obj в самое начало очереди. Если элемент удачно добавлен, возвращает true, иначе - false
        System.out.println(deque);
        System.out.println(deque.offerLast(10)); // добавляет элемент obj в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false
        System.out.println(deque);
        System.out.println(deque.peekFirst()); // возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null
        System.out.println(deque.getFirst()); // возвращает без удаления элемент из головы очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        System.out.println(deque.peekLast()); // возвращает без удаления последний элемент очереди. Если очередь пуста, возвращает значение null
        System.out.println(deque.getLast()); // возвращает без удаления последний элемент очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        System.out.println(deque.pollFirst()); // возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null
        System.out.println(deque);
        System.out.println(deque.removeFirst()); // возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        System.out.println(deque);
        System.out.println(deque.removeFirstOccurrence(10)); // удаляет первый встреченный элемент obj из очереди. Если удаление произшло, то возвращает true, иначе возвращает false.
        System.out.println(deque.removeFirstOccurrence(16));
        System.out.println(deque);
        System.out.println(deque.pollLast()); // возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null
        System.out.println(deque);
        System.out.println(deque.removeLast()); // возвращает с удалением элемент из конца очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        System.out.println(deque);
        System.out.println(deque.removeLastOccurrence(7)); //удаляет последний встреченный элемент obj из очереди. Если удаление произшло, то возвращает true, иначе возвращает false.
        System.out.println(deque.removeLastOccurrence(70));
        System.out.println(deque);
        System.out.println(deque.pop()); //  возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        System.out.println(deque);
        deque.push(5); // добавляет элемент в самое начало очереди
        System.out.println(deque);

        Queue<Integer> queue = new ArrayDeque<>();
        queue.offer(7); // добавляет элемент obj в конец очереди. Если элемент удачно добавлен, возвращает true, иначе - false
        queue.offer(2);
        System.out.println(queue);
        System.out.println(queue.element()); //возвращает, но не удаляет, элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        System.out.println(queue);
        System.out.println(queue.peek()); // возвращает без удаления элемент из начала очереди. Если очередь пуста, возвращает значение null
        System.out.println(queue);
        System.out.println(queue.poll()); // возвращает с удалением элемент из начала очереди. Если очередь пуста, возвращает значение null
        System.out.println(queue);
        System.out.println(queue.remove()); // возвращает с удалением элемент из начала очереди. Если очередь пуста, генерирует исключение NoSuchElementException
        System.out.println(queue);
    }
}
