package javaFunctionality;

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
    }

    public static void parallelStreams (List<Integer> list){

//        Predicate<String> lengthGreater = s -> s.length() > 5;
//        System.out.println(lengthGreater.test("gfdtjhfg"));
        list.parallelStream().filter(ele -> ele>11).forEach(System.out::println);

    }
}
