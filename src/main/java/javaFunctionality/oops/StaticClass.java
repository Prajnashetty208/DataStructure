package javaFunctionality.oops;

public class StaticClass {


    double a;
    public static void main(String[] args) {
        System.out.println("main");
        StaticClass.meth();
    }

    public static void meth(){
        System.out.println("static");
    }

    static{
        System.out.println("static block");
        StaticClass.meth();
    }
}
