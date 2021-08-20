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
public class Quicksort {

    public static void sort () throws IOException {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<5; i++){
            list.add(Integer.parseInt(read.readLine()));
        }


        System.out.println(list.stream().sorted().collect(Collectors.toList()));

    }
    public int partition(int l, int r, int[] a){
        int pivot = a[l];
        int i= l;
        int j= r;
        while(i<j){
            do{
                i++;
            }while(a[i]<=pivot);
            do{
                j++;
            }while(a[j]>=pivot);
            if(i<j){
                int b = a[i];
                a[i]=a[j];
                a[j]=b;
            }
        }
        return i;

    }

    public void quickSort(int l, int r, int[] arr){
        if(l<r){
            int p = partition(l,r,arr);
            quickSort(l,p-1,arr);
            quickSort(p+1,r,arr);
        }
    }
}
