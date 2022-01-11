import java.util.Scanner;

/**
 * Created by smit on 24/12/21.
 */
class Tk{
    /*void t(){
        System.out.println("This is t method inside the tkm");
    }

    void tkm(){
        this.t();
        System.out.println("This us tkm method");
    }
    */
    /*Tk(){
        System.out.println("Tk default constructor");
    }
    Tk(int a){
        this();
        System.out.println("Tk: "+a);
    }*/

    Thiskeyword o;

    Tk(Thiskeyword obj){

        o=obj;
    }
    void display(){
        System.out.println("This is: "+o.data);
    }

}
public class Thiskeyword {

    /*void s(Thiskeyword obj){
        System.out.println("Method call");
    }
    void p()
    {
        s(this);
    }*/

    int data=100;

    Thiskeyword(){

        Tk t=new Tk(this);
        t.display();
    }
    public static void main(String[] args) {
       /* Scanner s= new Scanner(System.in);
        System.out.println("ENter the calue of b: ");
        int b=s.nextInt();
        Tk t= new Tk(b);*/
       // t.tkm();


        Thiskeyword tk=new Thiskeyword();


    }
}
