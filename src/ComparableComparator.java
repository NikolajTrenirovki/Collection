import java.util.Comparator;
import java.util.TreeSet;

public class ComparableComparator {
    public static void main(String[] args) {
        TreeSet<People> treeSet = new TreeSet<People>();
        treeSet.add(new People(3));
        treeSet.add(new People(7));
        treeSet.add(new People(4));
        treeSet.add(new People(2));
        treeSet.add(new People(1));
        System.out.println(treeSet);

        TreeSet<People> treeSet1 = new TreeSet<>(new ComparPeople());
        treeSet1.add(new People(3));
        treeSet1.add(new People(7));
        treeSet1.add(new People(8));
        treeSet1.add(new People(2));
        treeSet1.add(new People(1));
        System.out.println(treeSet1);

        Comparator<Person2> pcomp = new PersonNameComparator().thenComparing(new PersonAgeComparator());
        TreeSet<Person2> people = new TreeSet(pcomp);
        people.add(new Person2("Tom", 23));
        people.add(new Person2("Nick",34));
        people.add(new Person2("Tom",10));
        people.add(new Person2("Bill",14));

        for(Person2 p : people){
            System.out.println(p.getName() + " " + p.getAge());
        }


    }
}

class ComparPeople implements Comparator<People> {

    @Override
    public int compare(People o1, People o2) {
        return o1.getAge() - o2.getAge();
    }
}

class People implements Comparable<People> {
    public int getAge() {
        return age;
    }

    private int age;

    public People(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(People o) {
        return this.age - o.age;
    }

    @Override
    public String toString() {
        return "People{" +
                "age=" + age +
                '}';
    }
}

class Person2{

    private String name;
    private int age;
    public Person2(String n, int a){

        name=n;
        age=a;
    }
    String getName(){return name;}
    int getAge(){return age;}
}

class PersonNameComparator implements Comparator<Person2>{ // калассы для сортировки по двум признакам

    public int compare(Person2 a, Person2 b){

        return a.getName().compareTo(b.getName());
    }
}

class PersonAgeComparator implements Comparator<Person2>{ // калассы для сортировки по двум признакам

    public int compare(Person2 a, Person2 b){

        if(a.getAge()> b.getAge())
            return 1;
        else if(a.getAge()< b.getAge())
            return -1;
        else
            return 0;
    }
}
