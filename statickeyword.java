/**
 * Created by smit on 24/12/21.
 */


public class statickeyword {



   static int b=12;
   static int a=2;

   static void show(){
       a=5;
   }
    void statickeyword(){

        System.out.println(a);
    }


    public static void main(String[] args) {

        statickeyword.show();
        statickeyword s1=new statickeyword();
        //statickeyword s2=new statickeyword();

        s1.statickeyword();
        System.out.println(b);



    }
}
