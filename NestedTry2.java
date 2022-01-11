/**
 * Created by smit on 28/12/21.
 */
public class NestedTry2 {

    public static void main(String[] args) {

        try {

            try {

                try {
                    int a[]={1,3,4};
                    System.out.println(a[4]);
                }
                catch (ArithmeticException e){
                    System.out.println(e);
                }

            }

            catch (ArithmeticException e)
            {
                System.out.println(e);
            }
        }

        catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}