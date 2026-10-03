import java.util.*;
public class Details
 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("==House hold details==");
        System.out.println("Enter the number of family number:");
        int mem=sc.nextInt();
        System.out.println("Enter the amount of water consumed in litres:");
        double litres=sc.nextDouble();
        System.out.println("Enter house number:");
        int house_number=sc.nextInt();
        System.out.println("Enter water usage status:");
        char usage=sc.next().charAt(0);

      System.out.println("Number of family numbers:"+mem);
      System.out.println("Amount of water consumed:"+litres);
      System.out.println("House number:"+house_number);
      System.out.println("Water usage status:"+usage);
    }
 }