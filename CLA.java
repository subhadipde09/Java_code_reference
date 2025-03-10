public class CLA {
    public static void main(String []x){
        //terminal arguments passes
        //compile-javac CLA.java
        //run-java CLA 1 2 3 4 5 6 7 8 9 ----> //[arguments]
       if(x.length>0) {
           int s=0;
           for(int i=0;i<x.length;i++)
           {
               s=s+Integer.parseInt(x[i]);
               System.out.println(s);
           }
       }else {
           System.out.println("no argument provided");
       }

    }
}
