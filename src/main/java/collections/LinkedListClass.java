package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class LinkedListClass {
    public static void main(String[] args) throws IOException {
        BufferedReader rd= new BufferedReader((new InputStreamReader(System.in)));
        List<String> li = new LinkedList<>();
        for(int i=0;i<5;i++){
            li.add(rd.readLine());
        }

        //Allows duplicates
        //Insertion order maintained
        //More space
        //Adding Removing elements is easy
        li.add(3, "mdd");
        li.remove(2);
        li.stream().forEach(System.out :: println);

    }
}
