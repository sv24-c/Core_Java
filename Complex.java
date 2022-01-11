/**
 * Created by smit on 6/1/22.
 */
public class Complex
{
    private double re, im;

    public Complex(double re, double im) {
        this.re = re;
        this.im = im;
    }

    @Override
    public String toString()
    {
        return " Sum : " + (this.im + this.re);
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("finalize method call");

    }
}
