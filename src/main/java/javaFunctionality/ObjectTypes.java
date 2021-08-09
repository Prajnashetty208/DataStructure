package javaFunctionality;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectTypes {

    public static void main(String[] args)
            throws CloneNotSupportedException, ClassNotFoundException,
            InstantiationException, IllegalAccessException, NoSuchMethodException,
            InvocationTargetException, IOException {

        //NEW
        ExampleClass a = new ExampleClass();

        //Clone
        ExampleClass b = (ExampleClass) a.clone();

        //Class.forName
        Class cls = Class.forName("ExampleClass");
        ExampleClass c = (ExampleClass) cls.newInstance();

        //constructor
        Constructor<ExampleClass> cn = ExampleClass.class.getDeclaredConstructor();
        ExampleClass d = (ExampleClass) cn.newInstance();

        //deserialization
        ExampleClass obj = new ExampleClass();
        FileOutputStream fos = new FileOutputStream("file.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);
        oos.close();
        fos.close();

    }
}

class ExampleClass{

    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

}

