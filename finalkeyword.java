/**
 * Created by smit on 24/12/21.
 */
public class finalkeyword
{
    int run(final int a){
        System.out.println("RUN bike");

        return a;
    }
}
class Suzuki extends finalkeyword
{
    public static void main(String[] args) {
       // new Suzuki().run();
        Suzuki s=new Suzuki();
        int r=s.run(4);
        System.out.println(r);
        System.out.println(s instanceof Suzuki);
    }
}
