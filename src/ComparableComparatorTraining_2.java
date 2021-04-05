import java.util.Comparator;
import java.util.TreeSet;

public class ComparableComparatorTraining_2 {


    public static void main(String[] args) {

        Comparator pcomp = new ComnarNamePeople_2().thenComparing(new ComnarAgePeople_2());
        TreeSet<Person2> people = new TreeSet(pcomp);
        people.add(new Person2("Tom", 23));
        people.add(new Person2("Nick",34));
        people.add(new Person2("Tom",10));
        people.add(new Person2("Bill",14));

        for (Person2 p : people){
            System.out.println(p.getName() + " " + p.getAge());
        }
    }

}

class ComnarNamePeople_2 implements Comparator<Person2> {

    @Override
    public int compare(Person2 o1, Person2 o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

class ComnarAgePeople_2 implements Comparator<Person2> {

    @Override
    public int compare(Person2 o1, Person2 o2) {
        return o1.getAge() - o2.getAge();
    }
}


