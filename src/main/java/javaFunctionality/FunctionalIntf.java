package javaFunctionality;

import java.io.IOException;

public class FunctionalIntf {
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
    }
}

@FunctionalInterface
interface functionalInterf{

    void printStr(String str);

}


