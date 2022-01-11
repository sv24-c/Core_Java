import java.io.IOException;

/**
 * Created by smit on 28/12/21.
 */
class M{
    void method() throws IOException{
        throw new IOException("exception");
    }

}
public class Throws {

    public static void main(String[] args) throws IOException{

       /* try {
            M m=new M();
            m.method();
        }
        catch (Exception e)
        {
            System.out.println("cautch");
        }*/
       M m =new M();
       m.method();
    }
}
