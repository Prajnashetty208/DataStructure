package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Person {
    public int age;
    public String name;
    Person(int age,String name){
        this.age=age;
        this.name=name;
    }
}

public class ComparatorClass {
    public static void main(String[] args) {
        //Comparator
        ArrayList<Person> l1 = new ArrayList<Person>();
        l1.add(new Person(41,"nbj"));
        l1.add(new Person(39,"nmn"));
        l1.add(new Person(14,"dfd"));
        l1.add(new Person(22,"klk"));
        
        //Age comparator
        Collections.sort(l1,new AgeCompare());
        for(Person st:l1){
            System.out.println(st.age+" "+st.name);
        }
    }
}

class NameCompare implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}
class AgeCompare implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        if(o1.age > o2.age)
            return 1;
        else if(o1.age == o2.age)
            return 0;
        else
            return -1;
    }
}