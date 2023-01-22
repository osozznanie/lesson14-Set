package Ex1Sorting;

import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {

        TreeSet<Person> ts = new TreeSet<>(new PerssonComparator());
        ts.add(new Person("Mykola", 45));
        ts.add(new Person("Olga", 30));
        ts.add(new Person("Peter", 20));
        ts.add(new Person("Yana", 56));
        ts.add(new Person("Olga", 29));
        ts.add(new Person("Olga", 11));

        for (Person p : ts){
            System.out.println(p);
        }
    }
}
