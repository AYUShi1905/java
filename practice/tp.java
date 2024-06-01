import java.util.Scanner;

public class tp {
    public static void main(String[] args) {
        student s1 =new student();
        s1.setage();
        System.out.println(s1.getname());
        System.out.print(s1.getage());

    }
}
class student{
    private String name;
    private int age;

    void setage(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a name :" );
        name=sc.nextLine();

        System.out.print("Enter age: ");
        age = sc.nextInt();

        if(age >= 18 && age <= 60){
            //  age=age;
            // System.out.println("age set to 18");
        }

        else{
            age=18;
            System.out.println("age set to 18");
        }

        // if (age >= 18 && age <= 60){
        //     age = 18;
        //     System.out.println("age set to 18");
        // }

        sc.close();
    }

    String getname(){
       return name;
    }
    int getage(){
        return age;
    }
}