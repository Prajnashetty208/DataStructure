package oops;

public class Inheritence {

    public static void main(String[] args) {
        Parent p = new Child();
//        p.m1();
//        p.m2();
        p.m4();

        Child c= (Child) p;
//        c.m1();
//        c.m2();
//        c.m3();
        c.m4();

        Parent f= new Parent();
//        f.m1();
//        f.m2();
        f.m4();

        //Child g = new Child();

    }

}
class Parent{
    int i=10;
    public Parent() {
        System.out.println("Parent constructor");
    }

    public Parent(int i) {
        this.i = i;
    }

    //    void m1(){
//        System.out.println("Parent m1");
//    }
//    void m2(){
//        System.out.println("Parent m2");
//    }
    void m4(){
        System.out.println("Parent m4 = "+i);
    }
}

class Child extends Parent{
    public Child() {
        super(20);
        System.out.println("Child constructor ");
    }

    //    void m1(){
//        System.out.println("Child m1");
//    }
//    void m3(){
//        System.out.println("Child m3");
//    }
    void m4(){
        super.m4();
        System.out.println("Child m4");
    }
}
