import java.util.*;
public class Bill
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter water consumption in litres:");
        double litres=sc.nextDouble();

        if (litres<=500) {
            System.out.println("Your bill is Rs.100");
        }
        else{
            System.out.println("Your bill is Rs.200");
        }

    }
}
