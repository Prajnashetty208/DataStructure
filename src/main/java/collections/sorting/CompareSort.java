package collections.sorting;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class CompareSort {
    public static void main(String[] args){
        List<Patient> cuurentP = new ArrayList<>();
        List<Patient> cuurent = new ArrayList<>();
        List<Patient> newcuurent = new ArrayList<>();
        cuurentP.add(new Patient("abc","abc","abc"));
        cuurentP.add(new Patient("dfc","abc","abc"));
        cuurent.add(new Patient("trw","abc","abc"));
        cuurent.add(new Patient("abc","abc","abc"));
        newcuurent.addAll(cuurent);
        newcuurent.addAll(cuurentP);
        newcuurent.stream().collect(Collectors.toSet());
        newcuurent.stream().forEach(x -> System.out.println(x.name));
    }
}

class Patient {
    String name;
    String lname;
    String dob;

    Patient(String name, String lname, String dob){
        this.name = name;
        this.lname = lname;
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o){
        if (o == this)
            return true;
        if (!(o instanceof Patient))
            return false;
        Patient other = (Patient)o;
        boolean currencyCodeEquals =
                (this.name != null && this.name.equals(other.name))
                        &&( (this.lname != null && this.lname.equals(other.lname)));
        System.out.println(currencyCodeEquals);
        return currencyCodeEquals;
    }

    @Override
    public final int hashCode() {

        return Objects.hash(lname, name);
    }

}


