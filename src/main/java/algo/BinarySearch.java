package algo;

import java.util.Scanner;

public class BinarySearch {
    public  static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int[] a = new int[20];
        for (int j = 0; j < 5; j++) {
            a[j] = Integer.parseInt(console.next());
        }

        int res = new BinarySearch().search(a, 0,5, 25);
        if(res >= 0){
            System.out.println("Element found at "+res);
        } else {
            System.out.println("Not found");
        }

    }

    public int search(int[] a, int s, int e,int item){

        if(e>=s){
            int mid = (s+e)/2;
                if(item == a[mid]){
                    return mid+1;
                } else if(item>a[mid]){
                    return search(a,mid+1,e,item);
                } else{
                    return search(a,s,mid-1,item);
                }
        }

        return -1;
    }
}
