package Assignment;
import java.util.*;

public class NumberSwapper {
	 	
	private int first;
	private int second;
	
	
	public int getFirst() {
		return first;
	}
	public void setFirst(int first) {
		this.first = first;
	}
	public int getSecond() {
		return second;
	}
	public void setSecond(int second) {
		this.second = second;
	}
	
	// Method to swap the numbers using bitwise XOR
    public void swapNumbers() {
        
        first = first ^ second;
        second = first ^ second;
        first = first ^ second;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        NumberSwapper numberSwapper = new NumberSwapper();

        
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        numberSwapper.setFirst(num1);
        numberSwapper.setSecond(num2);

        
        numberSwapper.swapNumbers();

        
        System.out.println("After swapping:");
        System.out.println("First number: " + numberSwapper.getFirst());
        System.out.println("Second number: " + numberSwapper.getSecond());

        
        sc.close();
    }


}
