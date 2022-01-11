import sun.security.util.ArrayUtil;

/**
 * Created by smit on 28/12/21.
 */
public class Throw {

    public static void validate(int age)
    {
        //function to check
        if (age<18)
        {
            //throw keyword to make exception
            throw new ArithmeticException("Not eligible for vote");
        }

        else {
            System.out.println("Eligible");
        }

    }

    public static void main(String[] args) {

        validate(14);
        System.out.println("Rest");
    }
}
