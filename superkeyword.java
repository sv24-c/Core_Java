/**
 * Created by smit on 24/12/21.
 */
class B{

    String s="white A";

    B()
    {
        System.out.println("A class Default Constructor");
    }
    void show(){
        System.out.println("This is A show method");
    }

}

class superkeyword extends B{

    String b = "superkeyword";

    superkeyword()
    {
        super();
        System.out.println("supekeyword default constructor");
    }

    {
        System.out.println("Instance initializer block is invocked");
    }

    void print(){

        System.out.println("This is print method");
        System.out.println(b);
        System.out.println(super.s);
        super.show();
    }

}

class Main {

    public static void main(String[] args) {

        superkeyword s= new superkeyword();

        s.print();

    }
}