/**
 * Created by smit on 28/12/21.
 */
public class Finally {

    public static void main(String[] args) {

        try {
            int a=20/0;
            System.out.println(a);
        }

        catch (ArithmeticException e){
            System.out.println(e);
        }

        finally {
            System.out.println("Print");
        }
    }
}
