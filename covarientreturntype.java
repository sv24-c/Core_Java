
/**
 * Created by smit on 24/12/21.
 */
public class covarientreturntype
{
    covarientreturntype put(){
        return this;
    }
}
class A extends covarientreturntype{

    A put(){
        System.out.println("PRint");
        return this;
    }

    void print(){
        System.out.println("Print this line");
    }

    public static void main(String[] args) {

        new A().put().print();
    }
}
