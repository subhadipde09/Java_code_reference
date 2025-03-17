class A{
    int x,y;
    //same function in one class is called function overloading
    void f1(){

    }
    void f1(int x){
       this.x=x;
    }
    void f1(int x ,int y){
        this.x=x;
        this.y=y;
    }
    void Display(){
        System.out.println(x);
        System.out.println(y);
    }

}
public class Overloading {
    public static void main(String []x){
        A a1= new A();
        //pass argument to call function and print
        a1.f1(9);
        a1.Display();
    }
}
