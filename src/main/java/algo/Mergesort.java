package algo;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

@Service
public class Mergesort {

    public static void sort () throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(Integer.parseInt(read.readLine()));
        }


        System.out.println(list.stream().sorted().collect(Collectors.toList()));

    }
}
