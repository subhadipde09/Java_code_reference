// using Runnable interface
class process1 implements  Runnable{
    public void run(){
        int i;
        for(i=0; i<=10; i++) {
            System.out.println("process1:"+i);
        }
    }

}
//using Runnable interface
class process2 implements Runnable{
    public void run(){
       int i;
        for(i=0; i<=10;i++) {
             System.out.println("process2:"+i);
        }
    }

}
public class Multithread1 {
    public static void main(String []x){
     process1 p1=new process1();
     process2 p2=new process2();
     //using Runnable interface.
     Thread t1=new Thread(p1);
     Thread t2=new Thread(p2);
     t1.start();
     t2.start();

    }
}

