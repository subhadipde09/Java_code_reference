interface java {
    int x = 6;
  void f1();

    static void f2() {
        System.out.println(x);
    }
}
interface java1 extends java{
    int y=7;
    static void g1(){
        System.out.println(y);
        System.out.println(x);
    }
}
class java2 implements java1 {
    public void f1(){
        //interface function f1 overriding in class java2.
    }
    void display(){
        System.out.println(x);
        System.out.println(y);
    }
}
public class Interface {
    public static void main(String []x){

        java2 j1=new java2();
        j1.display();

        java.f2();

        java1.g1();
    }
}
