
public class OOP_14_Box {
    double height;
    double width;
    double length;

    public OOP_14_Box() {
        height = 0;
        width = 0;
        length = 0;
    }

    public OOP_14_Box(double h, double w, double l) {
        height = h;
        width = w;
        length = l;
    }

    public double VOLUME() {
        return height * width * length;
    }

    public static void main(String[] args) {
        OOP_14_Box dBox = new OOP_14_Box();
        System.out.println("volume of box(default) : " + dBox.VOLUME());

        OOP_14_Box paraBox = new OOP_14_Box(45, 10, 15);
        System.out.println("volume of box(parameterized) : " + paraBox.VOLUME());

        OOP_14_Box dBox1 = new OOP_14_Box();
        System.out.println("volume of box(default) : " + dBox1.VOLUME());
        
        OOP_14_Box paraBox1 = new OOP_14_Box(45, 10, 15);
        System.out.println("volume of box(parameterized) : " + paraBox1.VOLUME());

    }

}