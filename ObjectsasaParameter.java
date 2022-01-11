/**
 * Created by smit on 24/12/21.
 */
class Test{

    int a,b;

    Test(int i, int j)
    {
        a=i;
        b=j;
    }

    boolean equalTo(Test o)
    {
        if (o.a==a && o.b==b)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
public class ObjectsasaParameter {

    public static void main(String[] args) {
        Test t1=new Test(12,34);
        Test t2=new Test(12,34);
        Test t3=new Test(23,56);

        System.out.println(t1.equalTo(t2));
        System.out.println(t1.equalTo(t3));
    }
}
