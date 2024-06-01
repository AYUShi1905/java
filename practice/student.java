// public class tp {

//     static int sum(int ...a){
//         int sum =0;

//         for(int i=0;i<a.length;i++){
//             sum += a[i];
//         }

//         return sum;
//     }

//     public static void main(String[] args) {
//         int sum = sum(1,2,3,4,5,6);
//         System.out.println(sum);
//     }
// }

import java.util.Random;

/**
 * tp
 */
public class student {
    
        String Name;
        long acc_no;
        double balance;
    

    public cons(){
        Name = "name";
        acc_no = 123456789;
        balance = 0.0;
   }

   public cons(String name,long Acc_no){
        Name = name;
        acc_no = Acc_no;
        
   }

   public cons(String name , double bal){
        Name = name;
        balance = bal;
        Random rd = new Random();
        acc_no = rd.nextLong(10000000);

   }

   public cons(String name){
        Name = name;
        balance = 5000;
        Random rd = new Random();
        acc_no = rd.nextLong();
   }

   public void display(){
    System.out.println("\nname :" + Name);
    System.out.println("Account No : " + acc_no);
    System.out.println("Balance : " + balance);
}
   public static void main(String[] args) {
        cons c1 = new cons();
        c1.display();
        cons c2 = new cons("ahjx",987456351);
        c2.display();
        cons c3 = new cons("aygg hgc",50000.0);
        c3.display();
        cons c4 = new cons("asusbcdsv");
        c4.display();
   }
}