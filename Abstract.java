abstract class Box{
    int x, y;
    abstract void f1();
    void display(){
        x=5;
        y=6;
    }
Box(){
    System.out.println("perant's constructor");
}
}
class Box1 extends Box{
    void f1(){

    }
    void display()
    {   super.display();
        System.out.println(x);
        System.out.println(y);
    }
    Box1(){
        System.out.println("child's constructor");
    }

}
public class Abstract {
    public static void main(String []x){
Box1 b1=new Box1();
b1.display();
    }
}
