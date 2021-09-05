package javaFunctionality.utilities;

import java.util.ArrayList;
import java.util.List;

public class WildcardClass {

    public static void main(String[] args) {
        Wildcard g = new Wildcard();
        List<String> list = new ArrayList<>();
        list.add("strs");
        g.second(list);
    }
}

class Wildcard{
    void second(List<? extends Object> list){
        for (Object o:list){
            System.out.println(o);
        }
    }
}
