public class ExceptionH2 {
    public static void main(String []x) {
        String name;
        name = null;
        try {
            System.out.println(name.length());
        }
        catch (ArithmeticException n1) {
            System.out.println(n1.getMessage());
        }
            catch(ArrayIndexOutOfBoundsException a1){
                System.out.println(a1.getMessage());

            }
         finally {
            System.out.println("Exception handling");
        }
        System.out.println("code Terminated");
    }
}