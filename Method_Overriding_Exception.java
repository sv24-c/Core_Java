import java.io.*;

/**
 * Created by smit on 7/1/22.
 */
class Parent
{
    void msg() throws IOException{
        System.out.println("This is msg method from parent class");
    }
}

class Child extends Parent
{
    void msg() throws ArithmeticException
    {
        System.out.println("This is msg method from child clss");
    }

    public static void main(String[] args) throws IOException {
        Parent p = new Child();
        p.msg();
    }
}

