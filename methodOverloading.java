/**
 * Created by smit on 24/12/21.
 */
public class methodOverloading {
    int show(int a){

        System.out.println("One parameter is "+a);
        return a;
    }

    float show(int a, float b){

        System.out.println("Two parameter is "+a+", "+b);
        return a;
    }

    public static void main(String[] args) {

        methodOverloading m=new methodOverloading();
        int e=m.show(2);
        System.out.println(e);
        float r =m.show(4,3.5f);
        System.out.println(r);

    }
}
