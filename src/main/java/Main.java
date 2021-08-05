import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) throws IOException {
        //Bubblesort.sort();
        //Insertionsort.sort();
        //Selectionsort.sort();
        //Stringreverse.sort();

        //        String name = "Prajna";
//        StringBuilder sb = new StringBuilder();
//        char[] ch = name.toCharArray();
//
//        for(int i=name.length()-1;i>-1;i--){
//            sb.append(ch[i]);
//        }
//
//        System.out.println(sb.toString());

        //Number - 5 , 11, 2, 3, 2,5,2,5,2,3
        //5->3
        //11 ->1
        //2 ->4
        //3 ->2

        //O/p:11 -> 1
        // 3 ->2
        // 5->3
        // 2->4

        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> li = new ArrayList<>();
        li.add(5);
        li.add(11);
        li.add(2);
        li.add(3);
        li.add(2);
        li.add(5);
        li.add(2);
        li.add(5);
        li.add(2);
        li.add(3);
        //li.addAll(new int[]{5, 11, 2, 3, 2, 5, 2, 5, 2, 3});

        for(int i =0; i<li.size();i++){
            int j =li.get(i);
            if(mp.containsKey(j)){
                int count = mp.get(j);
                count++;
                mp.put(j,count);
            } else {
                mp.put(j, 1);
            }
        }

        int[] sortedArr = new int[10];
        for(int k =0;k<li.size();k++){
            //if()

        }

//        for(Map.Entry<Integer,Integer> val:mp.entrySet()){
//            //sort
//
//        }
        System.out.println(mp.entrySet());
        System.out.println(mp.values());
        //System.out.println(mp.);


    }

}
