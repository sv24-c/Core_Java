/**
 * Created by smit on 28/12/21.
 */

class Udexception extends Exception{

    Udexception(String s)
    {
        super(s);
    }
}
class Throw2
{
    public static void main(String[] args) {

        try {

            throw new Udexception("abc");
        }

        catch (Udexception e)
        {
            System.out.println(e);
            System.out.println(e.getMessage());
        }
    }
}
