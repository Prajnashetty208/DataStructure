package collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class HashMapClass {
    public static void main(String[] args) throws IOException {
        HashMap<String,Integer> hashMap = new HashMap<>(6,0.75f);

        //Insertion order not maintained
        //Does not allows duplicate KEYS
        //Allows null
        //Not sorted
        //Less memory
        hashMap.put("Prajna",1230);
        hashMap.put("Klsj",73);
        hashMap.put("Sai",73);
        hashMap.put("ABC",73);
        hashMap.put(null,000);

        System.out.println(hashMap);
        //Output:{null=0, ABC=73, Prajna=1230, Sai=73, Klsj=73}

        if(hashMap.containsKey("Klsj")){
            hashMap.remove("Klsj");
        }

        for(Map.Entry<String,Integer> entryPair : hashMap.entrySet()){
            System.out.println(entryPair.getKey()+" : "+entryPair.getValue());
        }

    }
}
