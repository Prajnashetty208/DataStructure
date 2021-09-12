package designpattern;

public class SingletonExample {
}
class Singleton {
    private static Singleton single_instance = null;
    private static int i;
    private Singleton() { }

    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();

        return single_instance;
    }
}

