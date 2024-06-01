public class area{
    public static void main(String[] args) {
        Innerarea a1 = new Innerarea();
        a1.area(20);
        a1.area(12,15);
        a1.area(48.5f);
        a1.area(15.5f,16f);
    }
}
 class Innerarea {
    public void area(int length){
        float ans = length* length;
        System.out.println("area =" + ans);
      
    }
    public void area(int length,int width){
        float ans = (length * width ) ;
        System.out.println("area =" + ans);
    }
    public void area(float r){
        float ans = (float) ((3.14) * r * r);
        System.out.println("area =" + ans);
    }
    public void area(float base,float height){
        float ans = (float) (0.5) * base * height;
        System.out.println("area = " + ans);
    }
}