import java.util.*;

public class CollectionList {
    public static void main(String[] args) {

        List list = new ArrayList();
        ArrayList<Integer> collection = new ArrayList<Integer>();
        collection.add(6);
        collection.add(9);
        System.out.println(collection.contains(9)); // проверяет, есть ли такой элемент в списке
        list.add(4);
        System.out.println(list.get(0));
        System.out.println(list.addAll(0, Collections.singleton("7")));
        System.out.println(list.addAll(0,collection)); // добавляет в список по индексу index все элементы коллекции col.
        System.out.println(list.addAll(2, collection));
        // Если в результате добавления список был изменен, то возвращается true, иначе возвращается false
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println(list.get(3));
        System.out.println(list.get(4));
        System.out.println(list.get(5));
        System.out.println(list);
        System.out.println("Размер списка: " + list.size());

        System.out.println("Возвращает индекс первого вхождения объекта obj в список.\n" +
                "Если объект не найден, то возвращается -1");
        for (int i = 0; i<12; i++){
            System.out.println(list.indexOf(i)); // возвращает индекс первого вхождения объекта obj в список.
            // Если объект не найден, то возвращается -1
        }
        System.out.println("Возвращает индекс последнего вхождения объекта obj в список. \n" +
                "Если объект не найден, то возвращается -1");
        for (int i = 0; i<10; i++){
            System.out.println(list.lastIndexOf(i)); // возвращает индекс последнего вхождения объекта obj в список.
            // Если объект не найден, то возвращается -1
        }
        System.out.println("ListIterator<E> listIterator (): возвращает объект ListIterator для обхода элементов списка");
        System.out.println(list.listIterator());

        System.out.println(list.remove(4));
        System.out.println(collection.get(1));
        System.out.println(list.set(0, collection.get(1)));
        System.out.println(list.get(0));

        System.out.println("до сортировки:");
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        Collections.sort(list); // сортировка списка
        System.out.println("после сортировки:");
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        PersonComparator pcomp = new PersonComparator();
        List<Person> people = new ArrayList<Person>();
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        people.add(new Person("Alice"));
        people.add(new Person("Bill"));

        Collections.sort(people, pcomp);

        for(Person  p : people){
            System.out.println(p.getName());
        }



        System.out.println(list.subList(0,4)); // получает набор элементов, которые находятся в списке между индексами start и end
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();

        for (int i = 0; i<10; i++){
            arrayList.add(i);
            System.out.println(arrayList.get(i));
        }
        arrayList2.addAll(arrayList.subList(3,8));
        for (int i = 0; i<arrayList2.size(); i++){
            System.out.println(arrayList2.get(i));
        }
        Collections.reverse(arrayList2); // перевернуть список
        for (int i = 0; i<arrayList2.size(); i++){
            System.out.println(arrayList2.get(i));
        }
        System.out.println(arrayList.contains(3));

        ArrayList<String> people1 = new ArrayList<String>();
        // добавим в список ряд элементов
        people1.add("Tom");
        people1.add("Alice");
        people1.add("Kate");
        people1.add("Sam");
        people1.add(1, "Bob"); // добавляем элемент по индексу 1

        // удаление конкретного элемента
        people1.remove("Kate");
        // удаление по индексу
        people1.remove(0);
        for(int i = 0; i<people1.size(); i++){
            System.out.println(people1.get(i));
        }
        Object[] peopleArray = people1.toArray();
        for(Object person1 : peopleArray){
            System.out.println(person1);
        }
        ArrayList<String> people2 = new ArrayList<String>(25); // писок с фиксированным размером
        ensureCapacity: people1.ensureCapacity(25); // другой способ сделать список с фиксированным размером
    }
}
