package collections.lists;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

public class QueueLinkedList {
    public static void main(String[] args) throws IOException {
        BufferedReader rd= new BufferedReader((new InputStreamReader(System.in)));
        LinkedList<String> li = new LinkedList<>();
        for(int i=0;i<3;i++){
            li.add(rd.readLine());
        }

        //First in first out
        System.out.println(li.poll());
        System.out.println(li.peek());

        li.stream().forEach(System.out :: println);


    }
}
