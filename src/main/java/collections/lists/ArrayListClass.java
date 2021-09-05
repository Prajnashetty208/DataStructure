package collections.lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) throws IOException {
        BufferedReader rd= new BufferedReader((new InputStreamReader(System.in)));
        List<String> li = new ArrayList<>();
        for(int i=0;i<5;i++){
            li.add(rd.readLine());
        }

        //Allows duplicate
        //Insertion order maintained
        //Less space
        //difficult Adding Removing elements in the middle
        li.stream().forEach(System.out :: println);

    }
}
