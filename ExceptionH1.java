public class ExceptionH1 {
    public static void main(String []d){
      int Array[]=new int[10];
      String name;
        name =null;
      try {
          Array[10]=55;
          System.out.println(Array[10]);
      }
      catch (ArrayIndexOutOfBoundsException a1){
          System.out.println(a1.getMessage());
      }
      try{
          System.out.println(name.length());
      }
      catch (NullPointerException n1){
          System.out.println(n1.getMessage());
      }
        System.out.println("Exception handling");
    }
}
