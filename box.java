
public class box{
    double height;
    double width ;
    double length;

    public box(){
        height = 0;
        width = 0;
        length = 0;
    }


    public box(double h,double w , double l){
        height = h;
        width = w;
        length = l;
    }

    public double VOLUME(){
        return height*width*length;
    }
    
    public static void main(String[] args) {
        box dBox = new box();
    
        System.out.println("volume of box(default) : " + dBox.VOLUME() );
            
        box paraBox = new box(45,10,15);
    
        System.out.println("volume of box(parameterized) : " + paraBox.VOLUME());
    }
    
}