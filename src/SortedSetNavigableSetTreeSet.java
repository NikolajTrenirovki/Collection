import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class SortedSetNavigableSetTreeSet {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        treeSet.add(3);
        treeSet.add(9);
        treeSet.add(7);
        treeSet.add(6);
        System.out.println(treeSet);
        System.out.println(treeSet.contains(4));
        System.out.println(treeSet.contains(10));

        TreeSet<Student> set = new TreeSet<>();
        Student st1 = new Student("Маша", 4);
        Student st2 = new Student("Саша", 2);
        Student st3 = new Student("Коля", 3);
        Student st4 = new Student("Вася", 5);
        Student st5 = new Student("Петя", 1);

        set.add(st1);
        set.add(st2);
        set.add(st3);
        set.add(st4);
        set.add(st5);
        System.out.println(set.toString());
        System.out.println(set.first()); // вывод первого элемента
        System.out.println(set.last()); // вывод последнего элемента

        Student st6 = new Student("Иван", 4);
        Student st7 = new Student("Ира", 2);
        System.out.println(set.headSet(st6)); // выводит все значения, которые меньше st6
        System.out.println(set.tailSet(st6)); // выводит все значения, которые больше или равны st6
        System.out.println(set.subSet(st7,st6)); // выводит все значения, которые >=st7 и <st6
        System.out.println(st1.equals(st6));
        System.out.println(st1.hashCode() == st6.hashCode());

        System.out.println(set.ceiling(st6)); // ищет в наборе наименьший элемент e, который больше obj (e >=obj).
        // Если такой элемент найден, то он возвращается в качестве результата. Иначе возвращается null.
        System.out.println(set.floor(st7)); // ищет в наборе наибольший элемент e, который меньше элемента obj (e <=obj).
        // Если такой элемент найден, то он возвращается в качестве результата. Иначе возвращается null.
        System.out.println(set.higher(st6)); // ищет в наборе наименьший элемент e, который больше элемента obj (e >obj).
        // Если такой элемент найден, то он возвращается в качестве результата. Иначе возвращается null.
        System.out.println(set.lower(st7)); // ищет в наборе наибольший элемент e, который меньше элемента obj (e <obj).
        // Если такой элемент найден, то он возвращается в качестве результата. Иначе возвращается null.
        System.out.println(set.pollFirst()); // возвращает первый элемент и удаляет его из набора
        System.out.println(set);
        System.out.println(set.pollLast()); // возвращает последний элемент и удаляет его из набора
        System.out.println(set);
        System.out.println(set.descendingSet()); // возвращает объект NavigableSet, который содержит все элементы первичного набора
        // NavigableSet в обратном порядке
        System.out.println(set);
        set.add(st1);
        set.add(st5);
        System.out.println(set);
        System.out.println(set.headSet(st3)); // возвращает объект NavigableSet, который содержит все элементы первичного набора
        // NavigableSet до upperBound. Параметр incl при значении true, позволяет включить в выходной набор элемент upperBound
        System.out.println(set.headSet(st3, true));
        System.out.println(set.tailSet(st3)); // возвращает объект NavigableSet, который содержит все элементы первичного набора
        // NavigableSet, начиная с lowerBound. Параметр incl при значении true, позволяет включить в выходной набор элемент lowerBound
        System.out.println(set.tailSet(st3, true));
        System.out.println(set.subSet(st2, st4)); // возвращает объект NavigableSet, который содержит все элементы первичного набора
        // NavigableSet от lowerBound до upperBound.
    }
}

class Student implements Comparable<Student> {

    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }

    @Override
    public int compareTo(Student other) {
        return this.course - other.course;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return course == student.course;
    }

    @Override
    public int hashCode() {
        return Objects.hash(course);
    }
}
