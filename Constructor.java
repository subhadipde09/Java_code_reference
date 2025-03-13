class Demo{
    int x,y;
    void Display(){
        System.out.println(x);
        System.out.println(y);
    }
    Demo(){
        x=5;
        y=8;
    }
}
public class Constructor {
    public static void main(String []x){
        Demo d1=new Demo();
        d1.Display();
    }
}
