import java.util.Scanner;
import java.math.BigDecimal;
//Main method 
public class BigDecimalEx {
	public static void main(String[] args){
 
		String x,y;
		System.out.println("A Test For Sum");
		
		Scanner input = new Scanner(System.in);
		//Enter first number for sum
		System.out.print("Enter first number :");
		x = input.next();
		//Enter second number for sum
		System.out.print("Enter second number :");
		y = input.next();
		//Constructor
		number testclass1 = new number(x,y);
    }
}

class number{
	public number(String x, String y){
		BigDecimal z = new BigDecimal(x);			 
		BigDecimal w = new BigDecimal(y);	
		//Print the answer	
		System.out.println("Answer is :" + z.add(w));
		
	}
}
