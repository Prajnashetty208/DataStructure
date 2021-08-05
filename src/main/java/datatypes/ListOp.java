package datatypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOp {

    public static void sort() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> ls = new ArrayList<>();
        for(int i=0;i<5;i++){
            ls.add(br.readLine());
        }
        List<Integer> ls1 = Arrays.asList(1,2,3,4,5);

       // List<Integer> ls2 = List.of(1,2);

        //////////////////////////////
        List<Integer> list = new ArrayList<Integer>();
        BufferedReader bri = new BufferedReader(new InputStreamReader(System.in));
        for(int i=0;i<5;i++) {
            list.add(Integer.parseInt(bri.readLine()));
        }
        list.stream().forEach(System.out::println);

        for(int i=0; i<list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
