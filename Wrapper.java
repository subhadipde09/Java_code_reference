public class Wrapper {
    public static void main(String []x)
    {
        // converting from string to integer data.
        int e=Integer.parseInt("123");
        System.out.println(e);

        // converting from string (binary data) to integer data.
        Integer x1=Integer.valueOf("10001110110",2);
        int y=x1.intValue();
        System.out.println(y);

        //converting from string to double data.
        Double d=Double.valueOf("560");
        double to=d.doubleValue();
        System.out.println(to);

        // converting from string to float data.
        Float f1=Float.valueOf("123");
        float f=f1.floatValue();
        System.out.println(f);

        // converting from string to character data.
        Character c1=Character.valueOf('s');
        char c=c1.charValue();
        System.out.println(c);
    }
}
