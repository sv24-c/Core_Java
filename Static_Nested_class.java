/**
 * Created by smit on 7/1/22.
 */

class OuterClass
{
    void Outer()
    {
        System.out.println("Outer Class Method ");
    }

    public static class InnerClass1
    {

        public static void Inner1()
        {
            System.out.println("Inner Class 1 Method ");
        }

        static void Inner1_1()
        {
            System.out.println("Inner Class 1_1 Method ");
        }
    }

    class InnerClass2
    {
        void Inner2()
        {
            System.out.println("Inner Class 2 Method ");
        }
    }

    public static class InnerClass3
    {
        void Inner3()
        {
            System.out.println("Inner Class 3 Method ");
        }
    }
}


public class Static_Nested_class
{
    public static void main(String[] args) {



        OuterClass.InnerClass2 ic = new OuterClass().new InnerClass2();
        ic.Inner2();



    }
}