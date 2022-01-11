/**
 * Created by smit on 24/12/21.
 */
public class methodOverride
{
    public void drive(){
        System.out.println("Driving...");
    }
    methodOverride(){
        System.out.println("Default constructor");
    }
}

class Me extends methodOverride
{

    public void drive(){
        System.out.println("Driving speed is 45 kmph.");
    }

    public static void main(String[] args) {

        Me m= new Me();

        m.drive();

        methodOverride o =new methodOverride();
        o.drive();
    }
}

