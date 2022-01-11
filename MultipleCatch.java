/**
 * Created by smit on 28/12/21.
 */
public class MultipleCatch {

    public static void main(String[] args) {

        try{
            int[] a= new int[4];
            a[4]=200/0;
            //System.out.println(a[10]);
        }

        catch (ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Arithmetic");
        }

        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
            System.out.println("Array");
        }


        catch (Exception e)
        {
            System.out.println(e);
            System.out.println("Parent");
        }

    }
}
