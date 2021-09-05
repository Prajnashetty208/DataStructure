package javaFunctionality.utilities;

public class VarArgsClass {

    public static void main(String[] args) {
        Varargs g = new Varargs();
        g.meth("sdff","adfa");
        g.meth("sdff");
        g.meth("sdff","adfa","adfa");
    }
}

class Varargs{
    void meth(String... args){
        for (String s:args)
            System.out.println(s);
    }
}
