package algo;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

@Service
public class Bubblesort {

    public static void sort () throws IOException {
        //Using Scanner

        Scanner console = new Scanner(System.in);
        int[] a = new int[20];
        for(int j=0; j<5; j++){
            a[j] = Integer.parseInt(console.nextLine());
        }

        for(int i=0; i<5-1; i++) {
            for (int l=0; l<5-1-i; l++){
                if (a[l]>a[l+1]){
                    int t = a[l];
                    a[l] = a[l + 1];
                    a[l + 1] = t;
                }
            }
        }
        for(int k=0; k<5; k++) {
            System.out.println(a[k]);
        }

    }
}
