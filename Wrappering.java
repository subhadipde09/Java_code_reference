import java.io.*;
public class Wrappering {
    public static void main(String []x)
    {
        // primitive data types.
        byte b=1;
        int i=10;
        float f=12.5f;
        double d=560.56;
        char c='m';

        //converting into wrapper object
        Byte b1=Byte.valueOf(b);
        Integer i1=Integer.valueOf(i);
        Float f1=Float.valueOf(f);
        Double d1=Double.valueOf(d);
        Character c1=Character.valueOf(c);

        System.out.println(b1);
        System.out.println(i1);
        System.out.println(f1);
        System.out.println(d1);
        System.out.println(c1);
    }
}
