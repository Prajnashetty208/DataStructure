package collections;

import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapClass {
    public static void main(String[] args) throws IOException {
        //Max = 6 elements, increase size when 75% full, true = Most recent accessed entry is the latest
        // and false is default
        LinkedHashMap<String,Integer> linkedMap = new LinkedHashMap<>(6,0.75f,true);

        //Insertion order is maintained
        //Does not allows duplicate KEYS
        //Allows null
        //Not sorted
        //more memory
        linkedMap.put("Prajna",1230);
        linkedMap.put("Klsj",73);
        linkedMap.put("Sai",73);
        linkedMap.put("ABC",73);
        linkedMap.put(null,000);

        System.out.println(linkedMap);
        //Output:{Prajna=1230, Klsj=73, Sai=73, ABC=73, null=0}

        if(linkedMap.containsKey("Klsj")){
            linkedMap.remove("Klsj");
        }

        for(Map.Entry<String,Integer> entryPair : linkedMap.entrySet()){
            System.out.println(entryPair.getKey()+" : "+entryPair.getValue());
        }


    }
}
