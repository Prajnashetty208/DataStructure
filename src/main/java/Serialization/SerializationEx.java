package Serialization;
import java.io.*;

public class SerializationEx implements Serializable {
    int a= 100;
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SerializationEx object1 = new SerializationEx();
        SerializationEx object2;
        OutputStream fout = new FileOutputStream("ser.txt");
        ObjectOutput oout = new ObjectOutputStream(fout);
        System.out.println("Serialization process has started, serializing employee objects...");
        oout.writeObject(object1);

        InputStream fin=new FileInputStream("ser.txt");
        ObjectInput oin=new ObjectInputStream(fin);
        System.out.println("DeSerialization process has started, displaying employee objects...");
        object2=(SerializationEx)oin.readObject();
        System.out.println(object2.a);
    }

}