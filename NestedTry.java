/**
 * Created by smit on 28/12/21.
 */
public class NestedTry {

    public static void main(String[] args) {

        try {

            //1st inner try catch block
            try {

                int a=100/0;
            }

            catch (ArithmeticException e){

                System.out.println(e);
            }

            //2nd inner try catch block

            try {
                int[] a=new int[4];
                a[5]=4;
            }

            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }

        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
