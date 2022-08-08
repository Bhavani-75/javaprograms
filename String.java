package array;

import java.util.Scanner;

/**
 *
 * @author Bhavani Bhava
 */
public class string {
    
 public static void main(String[] args) {
     //basic string poration

      String myInsperation=" I like BTS ";
     System.out.println(myInsperation);
     
     
     System.out.println(myInsperation.trim());
     System.out.println(myInsperation.startsWith(" "));
     System.out.println(myInsperation.toLowerCase());
     System.out.println(myInsperation.toUpperCase());
     
     
     
   //logical operation &,|,!
     
     float number;
     Scanner input=new Scanner(System.in);
     number =input.nextFloat();
     System.out.println("enter the number:"+number);
     
     String name;
     input = new Scanner(System.in);
     System.out.println("enter the name");
     name =input.next();
     System.out.println("welcome:"+name);
     
     
}
}
