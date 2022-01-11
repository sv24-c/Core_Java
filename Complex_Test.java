/**
 * Created by smit on 6/1/22.
 */
public class Complex_Test
{
    public static void main(String[] args)
    {
        Object obj = new Object();

        Complex c = new Complex(12.1, 13.3);

        System.out.println("print : " + c);
        System.out.println(c.hashCode());
        System.out.println(c.getClass());


      /*  public Class<?> loadClass(String name) throws ClassNotFoundException {
            try {
                return loadClass(name, false);
            }
            catch (Exception ex)
            {

            }
        }*/

        Runtime run = Runtime.getRuntime();
        System.out.println(run.maxMemory());

        String  s="asc";
        byte b[]= s.getBytes();
        System.out.println(b);
    }
}
