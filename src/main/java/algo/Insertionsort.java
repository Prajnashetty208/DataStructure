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
public class Insertionsort {

    public static void sort () throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int[] a = new int[5];
        int item;
        for(int i=0; i<5; i++){
            a[i] = Integer.parseInt(read.readLine());
        }

        for(int k=1; k< a.length;k++){
            item = k-1;
            while(item >-1 && a[k] < a[item]){
              int t= a[k];
              a[k] = a[item];
              a[item] = t;
              item = item-1;
            }
        }

        for(int n=0; n<5; n++) {
            System.out.println(a[n]);
        }

    }
}
