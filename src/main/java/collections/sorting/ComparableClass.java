package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableClass {

    public static void main(String[] args) {
        //Comparable
        ArrayList<Student> l = new ArrayList<>();
        l.add(new Student(1, "abc"));
        l.add(new Student(3, "bc"));
        l.add(new Student(4, "fjgj"));
        l.add(new Student(2, "shhs"));
        Collections.sort(l);

        for (Student st : l) {
            System.out.println(st.rollno + " " + st.name);
        }
    }
}

class Student implements java.lang.Comparable<Student>{

        public int rollno;
        public String name;
        Student(int rollno,String name){
            this.rollno=rollno;
            this.name=name;
        }

    @Override
    public int compareTo(Student s) {
        if(s.rollno > rollno)
            return 1;
        else if(s.rollno == rollno)
            return 0;
        else
            return -1;
    }
}
