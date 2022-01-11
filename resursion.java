/**
 * Created by smit on 25/12/21.
 */
class Fast
{
    int factorial(int n)
    {
        int r;
        if (n==1)
        {
            return 1;
        }
        else
        {
            r=factorial(n-1) * n;
            return r;
        }
    }
}
public class resursion {

    public static void main(String[] args) {

        Fast f= new Fast();

        System.out.println(f.factorial(4));
        System.out.println(f.factorial(5));
        System.out.println(f.factorial(3));
    }
}
