package datatypes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Util {

    public static void sort() throws IOException {

        //Date
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date dateobj = new Date();
        System.out.println(df.format(dateobj));

        //String to Date
        String string = "January 2, 2010";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println(date); // 2010-01-02

        //Hashmap
        Map<String, Integer> m = new HashMap<String, Integer>();

        // enter name/url pair
        m.put("a", 1);
        m.put("b", 2);
        m.put("c", 3);
        m.put("d", 4);

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<String,Integer> entry : m.entrySet())
            System.out.println("Key = " + entry.getKey() +", Value = " + entry.getValue());

        //Char to int
        char ch = 'c';
        int num = Integer.parseInt(String.valueOf(ch));

        System.out.println(num);
        
        //List to array
        List<String> itemList = new ArrayList<String>();
        itemList.add("item1");
        itemList.add("item2");
        itemList.add("item3");

        String[] itemsArray = new String[itemList.size()];
        itemsArray = itemList.toArray(itemsArray);

        for(String s : itemsArray)
            System.out.println(s);

    }
}
