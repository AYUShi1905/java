 class A{
    protected int i;
    int j;
    void showij(){
        System.out.println("inside class A : i = " + i + " j = " + j);
    }
}
 class B extends A{
    int k;
    void showk(){
        System.out.println("inside class B : k = "+k);
    }
    void add_ijk(){
        System.out.println(i+" + "+j+ " + "+k+" = "+(i+j+k));
    }
}
 class C extends A {
    int m;
    void showm(){
        System.out.println("inside class C : m = "+m);
    }
    void add_ijm(){
        System.out.println(i+"+"+j+"+"+m+"="+(i+j+m));
    }
}
public class inheritanceExample {
    public static void main(String[] args){
        A supA = new A();
        supA.i=10;
        supA.j=20;
        supA.showij();

        B subB = new B();
        subB.i=100;
        subB.j=200;
        subB.k=300;
        subB.showk();
        subB.add_ijk();

        C subc = new C();
        subc.i=1000;
        subc.j=2000;
        subc.m=3000;
        subc.showm();
        subc.add_ijm();
    }
}
