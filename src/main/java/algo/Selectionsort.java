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
public class Selectionsort {

    public static void sort () throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int min;
        for(int i=0; i<5; i++){
            arr[i] = Integer.parseInt(read.readLine());
        }

        for(int k=0; k< arr.length;k++){
            min = k;
            for(int j=k+1; j<arr.length; j++) {
                if(arr[j]<arr[min]) {
                    min = j;
                }
            }
            if(min != k){
                int t= arr[min];
                arr[min] = arr[k];
                arr[k] = t;
            }

        }

        for(int n=0; n<5; n++) {
            System.out.println(arr[n]);
        }
    }
}
