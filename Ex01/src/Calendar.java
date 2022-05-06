import java.util.*;

public class Calendar{
   public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

       int m = 2500;
       int age = 0;
       double rate = 0.0;
       
       age = scanner.nextInt();
       
       if (65<=age) 
    	   rate =0;
       else if(20<=age)
    	   rate = 1;
       else if(14<=age)
    	   rate = 0.75;
       else if(4<=age)
    	   rate = 0.5;
       else if(4>age)
    	   rate = 0;
       else 
    	   System.out.println("정확한 값 입력 요망!");
       
       System.out.println((int)(m*rate) + "원");
   
   }
}
