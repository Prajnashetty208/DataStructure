package javaFunctionality;

import java.util.ArrayList;
import java.util.List;

public class GenericEx {

    public static void main(String[] args) {
        Generic g = new Generic();
        g.meth();
    }
}

class Generic {
    String[] a = {"akd","lwd","eke"};
    Character[] b = {'d','f','c'};
    Integer[] c = {1,2,3,454,89};

    public <T> List<T> toListMeth(T[] array){
        List<T> list = new ArrayList<>();
        for (T obj:array){
            list.add(obj);
        }
        return list;
    }

    public void meth(){
        List<String> str = toListMeth(a);
        for(String s: str)
            System.out.println(s);

        List<Character> str2 = toListMeth(b);
        for(Character s: str2)
            System.out.println(s);

        List<Integer> str3 = toListMeth(c);
        for(Integer s: str3)
            System.out.println(s);
    }

}

