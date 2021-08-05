package oops;

public class DefaultMethod {
    public static void main(String[] args) {
        Interf i = new Impli();
        i.meth();
    }
}

interface Interf{
    default void defaultMeth(){
        System.out.println("defaultMeth1");
    }
    void meth();
}

interface Interf2{
    default void defaultMeth(){
        System.out.println("defaultMeth1");
    }
    void meth();
}

class Impli implements Interf,Interf2{

    public void defaultMeth() {
        Interf.super.defaultMeth();
        Interf2.super.defaultMeth();
    }

    public void meth() {
        System.out.println("Implemented");
    }
}
