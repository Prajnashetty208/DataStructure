package javaFunctionality.java8;

import java.io.IOException;

public class FunctionalIntf implements MyInterface1{
    public static void main(String[] args) throws IOException {
        //Without lambda
        functionalInterf i = new functionalInterf() {
            @Override
            public void printStr(String str) {
                System.out.println(str);
            }
        };

        i.printStr("fi");

        //With lambda
        functionalInterf j = (str) ->{
            System.out.println(str);
        };

        j.printStr("lambda");
        ///////////////////
        MyInterface1 in = new FunctionalIntf();
        in.defaultMethod();
        MyInterface1.staticMethod();
        in.myMethod();

    }

    @Override
    public void myMethod() {
        System.out.println("met");
    }
    @Override
    public void defaultMethod() {
        System.out.println("def");
    }

}

@FunctionalInterface
interface MyInterface1 {
    abstract void myMethod();
    default void defaultMethod() {
    }
    static void staticMethod() {
        System.out.println("stat");
    }
}

@FunctionalInterface
interface functionalInterf{

    void printStr(String str);

}


