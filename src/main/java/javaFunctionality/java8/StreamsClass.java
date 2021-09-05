package javaFunctionality.java8;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class StreamsClass {

    public static void main(String[] args) throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(Integer.parseInt(read.readLine()));
        }
        parallelStreams(list);

        // In one line display all records (in sorted manner - DESCENDING) that start with 'a' in stringList
        System.out.println("\n3. Use stream for filtering, sorting and display(in sorted manner - DESCENDING order)");
        list.stream() // Convert list to Stream
               // .filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
                .sorted((a, b) -> b.compareTo(a))  //SORT the list (DESCENDING order)
                .forEach(System.out::println); // Displays - az, ank, ad


        // In one line display all records (in sorted manner - ASCENDING) that start with 'a' in stringList
        System.out.println("\n2. Use stream for filtering, sorting and display (in sorted manner - ASCENDING order )");
        list.stream() // Convert list to Stream
                //.filter((s) -> s.startsWith("a")) // Filter all record which starts with "a"
                .sorted()  //SORT the list (ASCENDING order)
                .forEach(System.out::println); // Displays - ad, ank, az
    }

    public static void parallelStreams (List<Integer> list){

//        Predicate<String> lengthGreater = s -> s.length() > 5;
//        System.out.println(lengthGreater.test("gfdtjhfg"));
        list.parallelStream().filter(ele -> ele>11).forEach(System.out::println);

    }
}
