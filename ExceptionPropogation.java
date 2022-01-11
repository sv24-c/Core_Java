
import java.io.IOException;

/**
 * Created by smit on 28/12/21.
 */
public class ExceptionPropogation {

    void m() throws IOException
    {
     //   int a=10/0;
        throw new IOException("acb");
    }

    void n() throws IOException
    {
        m();
    }

    void p()
    {
        try {
            n();
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {

        ExceptionPropogation c =new ExceptionPropogation();
        c.p();

    }


}

