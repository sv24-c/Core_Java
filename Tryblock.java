/**
 * Created by smit on 28/12/21.
 */
public class Tryblock {

    public static void main(String[] args) {

        try{
             int a[] ={1,2,3};
            System.out.println(a[2]);
        }

        catch (ArrayIndexOutOfBoundsException e)
        {

            System.out.println(e);
            System.out.println("code.");

        }

    }
}
