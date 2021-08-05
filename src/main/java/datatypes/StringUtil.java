package datatypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringUtil {

    public  void sort() throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        List<String> st = new ArrayList<String>();
        for(int i=0;i<5;i++){
            st.add(r.readLine());
        }
        //////////////////////////
        Collections.sort(st);

        //Sort in reverse
        Collections.sort(st, Collections.reverseOrder());

        for(String ele : st){
            System.out.println(ele);
        }

    }

    public void swap(){

        String a = "one";
        String b = "two";

        a = a + b;
        b = a.substring(0, (a.length() - b.length()));
        a = a.substring(b.length());

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public void reverse(){

        String str = "Helloooooooo";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.deleteCharAt(1);
        sb.substring(3);
        sb.insert(5,'a');
        sb.reverse();
        System.out.println( sb.toString());
    }

    public void read() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] list = new String[5];
        for(int i=0;i<5;i++){
            list[i] = reader.readLine();
        }
        System.out.println(Arrays.stream(list).collect(Collectors.toList()));
        //Or
        for(int i=0;i< list.length;i++){
            System.out.println(list[i]);
        }
    }

    public void str(){
                String a = "hello";
        String b = "java";
        String c = a.compareTo(b) > 0 ? "Yes" : "No";

        System.out.println(a.length()+b.length());
        System.out.println(c);
        System.out.println(a.substring(0,1).toUpperCase()+a.substring(1)+" "+b.substring(0,1).toUpperCase()+b.substring(1));

    }

    public void largeSmall(){
        String smallest = "";
        String largest = "";
        int k = 3;
        String s = "welcometojava";
        for (int i = 0; i < s.length() - k+1; i++) {
            String an = s.substring(i, i + k);
            System.out.println(an);
            if(i==0){
                largest = an;
                smallest = an;
            } else {
                if (an.compareTo(largest) > 0 ) {
                    largest = an;
                }
                if (an.compareTo(smallest) < 0 ) {
                    smallest = an;
                }
            }

        }
        System.out.println(smallest + "\n" + largest);
    }

    public void palindrome(){
        String original = "abvcfcvba";
        int length = original.length();
        String reverse = "";
        for ( int i = length - 1; i >= 0; i-- )
            reverse = reverse + original.charAt(i);

        if (original.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");

    }

    public void twoD(){

        //        String a = "aabbcc";
//        String b = "abcabc";
//        String c = "abbccm";
//
//        char[] m = a.toCharArray();
//        char[] n = b.toCharArray();
//
//        Arrays.sort(m);
//        Arrays.sort(n);
//
//        if(Arrays.equals(m,n)){
//            System.out.println("match");
//        };

        //2D Read Sting array
//            BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
//            String[][] li = new String[2][2];
//            for(int i=0;i<2;i++){
//                for(int j=0;j<2;j++) {
//                    li[i][j] = rd.readLine();
//                }
//            }
//
//            System.out.println(Arrays.stream(list)
//                    .collect(Collectors.toCollection()));
    }
}
