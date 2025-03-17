class old{
    int x;
    int y;
    void f1(){

    }

}
class modern extends old{
    int x;
    int y;
    void f1(int p , int q){
        x=p;
        y=q;
    }
    void Display(){
      System.out.println(super.x);
      System.out.println(y);
    }

}




public class inheritance {
    public static  void main(String []x){
       modern m1=new modern();
       m1.f1(5,6);
       m1.Display();
    }
}
