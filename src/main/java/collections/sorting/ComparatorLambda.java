package collections.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorLambda {
    public static void main(String[] args) {
        List<Employee> employees  = new ArrayList<>();
        employees.add(new Employee(6,"Yash", "Chopra", 25));
        employees.add(new Employee(2,"Aman", "Sharma", 28));
        employees.add(new Employee(3,"Aakash", "Yaadav", 52));
        employees.add(new Employee(5,"David", "Kameron", 19));
        employees.add(new Employee(4,"James", "Hedge", 72));
        employees.add(new Employee(8,"Balaji", "Subbu", 88));
        employees.add(new Employee(7,"Karan", "Johar", 59));
        employees.add(new Employee(1,"Lokesh", "Gupta", 32));
        employees.add(new Employee(9,"Vishu", "Bissi", 33));
        employees.add(new Employee(10,"Lokesh", "Ramachandran", 60));

        //Sol 1
        Comparator<Employee> compareById_2 = (Employee o1, Employee o2) -> o1.getId().compareTo( o2.getId() );
        Collections.sort(employees,compareById_2);

        //Sol 2
        Collections.sort(employees,(Employee a,Employee b) -> a.getId().compareTo(b.getId()));

        //Sol 3
        Collections.sort(employees, Comparator.comparing(Employee::getId));

        System.out.println(employees);
    }

}

class Employee {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;

    public Employee(Integer id, String firstName, String lastName, Integer age){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Integer getId() {
        return id;
    }
//Other getter and setter methods

    @Override
    public String toString() {
        return "\n["+this.id+","+this.firstName+","+this.lastName+","+this.age+"]";
    }
}
