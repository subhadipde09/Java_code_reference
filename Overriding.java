//different class buty same function and same argument:
class Animal{
    void Displayinfo(){
        System.out.println("i am an animal");
    }
}
class Dog extends Animal{
    void Displayinfo(){
        super.Displayinfo();//function overriding
        System.out.println("i am a dog");


    }
}
public class Overriding {
    public static void main(String []x){
     Dog d1=new Dog();
     d1.Displayinfo();

    }
}
