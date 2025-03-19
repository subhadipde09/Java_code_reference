// using Thread class
class processing1 extends Thread{
    public void run(){
        int i;
        for(i=0; i<=10; i++) {
            System.out.println("process1:"+i);
        }
    }

}
//using Thread class
class processing2 extends Thread{
    public void run(){
        int i;
        for(i=0; i<=10;i++) {
            System.out.println("process2:"+i);
        }
    }

}
public class Multithread2 {
    public static void main(String []x){
        processing1 p1=new processing1();
        processing2 p2=new processing2();
        p1.start();
        p2.start();
    }

}

