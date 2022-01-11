/**
 * Created by smit on 7/1/22.
 */
public class ParentClass
{
    void parentDisplay()
    {
        System.out.println("i am a parent class display method");

        class Child
        {
            void childDisplay()
            {
                System.out.println("i am a inner class display method");
            }
        }

        Child childObject = new Child();

        childObject.childDisplay();
    }


}

class Main
{
    public static void main(String[] args)
    {
        ParentClass object = new ParentClass();

        object.parentDisplay();
    }
}
