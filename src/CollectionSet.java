import java.util.HashSet;

public class CollectionSet {
    public static void main(String[] args) {
        HashSet <Person> person = new HashSet<>(10,  0.75f);
        person.add(new Person("строка"));
        person.add(new Person("прощай"));
        person.add(new Person("буква"));
        System.out.println(person.iterator());
        for (Person p : person){
            System.out.println(p.getName());
        }
        HashSet set = new HashSet();
        set.add(1);
        set.add(3);
        set.add(2);
        set.add(8);
        set.add(7);
        System.out.println(set);
        HashSet set2 = new HashSet();
        set2.add(7);
        set2.add(9);
        set2.add(0);
        set2.add(4);
        set2.add(1);
        System.out.println(set2);

        set.addAll(set2); // добавить все элементы set2 в set
        System.out.println(set);

        set2.add(10);
        set2.add(15);
        set2.add(9);
        System.out.println(set2);

        set.retainAll(set2); // оставляет в set только те элементы, которые есть в set2
        System.out.println(set);

        set.add(5);
        set.add(2);
        System.out.println(set);

        set.removeAll(set2); // удаляет из set все элементы, которые есть в set2
        System.out.println(set);
    }
}
