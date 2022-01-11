/**
 * Created by smit on 24/12/21.

class Box{
    double width,height,depth;

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    // constructor
    Box() {
        width = -1;
        height = -1;
        depth = -1;
    }

// use -1 to indicate
// an uninitialized
// box
// constructor used when cube is created
    Box(double len) {
        width = height = depth = len;
    }
    // compute and return volume
    double volume() {
        return width * height * depth;
    }
}

public class OverloadingConstructor {

    public static void main(String args[]) {
// create boxes using the various constructors

        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box();
        Box mycube = new Box(7);
        double vol;

// get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of mybox1 is " + vol);
// get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of mybox2 is " + vol);

// get volume of cube
                vol = mycube.volume();
        System.out.println("Volume of mycube is " + vol);
    }
}
*/

class Box
{
    double width,height,depth;

    Box(Box b)
    {
        width=b.width;
        height=b.height;
        depth=b.depth;
    }

    Box(double w, double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }

    Box()
    {
        width=1;
        height=1;
        depth=1;
    }

    Box(double len)
    {
        width=height=depth=len;
    }

    double volume(){
        return width*height*depth;
    }

}

class OverloadingC
{
    public static void main(String[] args) {

        Box b1=new Box(12,23,45);
        Box b2=new Box();
        Box cube =new Box(7);

        Box myclone=new Box(b1);

        double vol;

        vol=b1.volume();
        System.out.println("This first: "+vol);

        vol=b2.volume();
        System.out.println("This second: "+vol);

        vol=cube.volume();
        System.out.println("This third: "+vol);

        vol=myclone.volume();
        System.out.println("This four: "+vol);

    }
}