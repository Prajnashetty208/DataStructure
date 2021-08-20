package javaFunctionality;

public class InnerClasses{
    int i = 0;
    static int j = 1;
    public void nonStaticMethod(){
        int a = 0;
        int b = 1;
        InnerClassNonStatic a = new InnerClassNonStatic();
        class InnerClass {
            int a = 0;
            int b = 1;
            {}
            InnerClass() {}
        }
    }
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        class InnerClass {
            int a = 0;
            int b = 1;
            {}
            InnerClass() {}
        }
    }

    class InnerClassNonStatic {
        int a = 0;
        int b = 1;
        {}
        InnerClassNonStatic() {}
    }

    static class InnerClass {
        int a = 0;
        static int b = 1;
        {}
        InnerClass() {}
    }

}


