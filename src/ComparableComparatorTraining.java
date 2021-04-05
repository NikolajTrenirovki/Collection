import java.util.Comparator;
import java.util.TreeSet;

public class ComparableComparatorTraining {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new Car(2));
        treeSet.add(new Car(4));
        treeSet.add(new Car(7));
        treeSet.add(new Car(8));
        treeSet.add(new Car(2));
        treeSet.add(new Car(2));

        System.out.println(treeSet);

        TreeSet treeSet1 = new TreeSet();
        treeSet1.add(new Car(2));
        treeSet1.add(new Car(4));
        treeSet1.add(new Car(7));
        treeSet1.add(new Car(8));
        treeSet1.add(new Car(5));
        treeSet1.add(new Car(3));

        System.out.println(treeSet1);

        Comparator <newCar> comparator = new NameComparNewCar().thenComparing(new AgeComparNewCar());
        TreeSet<newCar> treeSet2 = new TreeSet(comparator);
        treeSet2.add(new newCar(7, "Лада"));
        treeSet2.add(new newCar(5, "Audi"));
        treeSet2.add(new newCar(6, "Mercedes"));
        treeSet2.add(new newCar(9, "Лексус"));
        treeSet2.add(new newCar(3, "Ford"));
        treeSet2.add(new newCar(8,"Лада"));

        for (newCar car : treeSet2){
            System.out.println(car.getName() + " " +car.getAge());
        }
    }
}

class AgeComparNewCar implements Comparator<newCar> {

    @Override
    public int compare(newCar o1, newCar o2) {
        return o1.getAge() - o2.getAge();
    }
}

class NameComparNewCar implements Comparator<newCar> {

    @Override
    public int compare(newCar o1, newCar o2) {
        return o1.getAge() - o2.getAge();
    }
}

class newCar {
    private int age;
    private String name;

    public newCar(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

class ComparCar implements Comparator<Car> {

    @Override
    public int compare(Car o1, Car o2) {
        return o1.getAge() - o2.getAge();
    }
}

class Car implements Comparable<Car> {
    private int age;

    public int getAge() {
        return age;
    }

    public Car(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Car o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                '}';
    }
}