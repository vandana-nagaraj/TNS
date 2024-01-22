package Assignment;
import java.util.*;

public class Olivia {

	public static void main(String[] args) {
		
		int num1 , num2 ,num3;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a integer 1:");
		num1 = sc.nextInt();
		System.out.println("Enter a integer 2:");
		num2 = sc.nextInt();
		System.out.println("Enter a integer 3:");
		num3 = sc.nextInt();
		
		
		int smallest = (num1<num2 && num1<num3)?num1:((num2<num1 && num2<num3)?num2:num3);
        
		
        if (num1 == num2 && num2 == num3) 
        {
            System.out.println("All numbers are equal");
        } 
        else 
        {
            System.out.println("The smallest number is: " + smallest);
        }
        sc.close();
	}
}
