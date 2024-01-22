package Assignment;
import java.util.*;

public class SkyAirlines {

	public static void main(String[] args) {
		
		
		String name , source ,destination;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name:");
		name = sc.next();
		System.out.println("Enter Source:");
		source = sc.next();
		System.out.println("Enter Destination");
		destination = sc.next();
		sc.close();
		System.out.println("Dear" + " " +  name  +
				", welcome onboard with service from" +" " + source+" " + "to" +" "+ destination +
				". Thank you for Choosing Sky Airlines.Enjoy your flight. ");
	}

}
