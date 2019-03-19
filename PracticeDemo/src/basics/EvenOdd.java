package basics;

public class EvenOdd {

	public static void main(String[] args) {
		
		
		int number = 7;

		/****Logic one*****/
		if ((number & 1) == 0) { // Using AND if last bit is 0 then even
			System.out.println("Even number");
		}
		if ((number & 1) == 1) { // Using AND if last bit is 1 then odd
			System.out.println("Odd number");
		}
		
	/*****Logic two*****/	
		int quotient = number/2;
		System.out.println("quotient="+quotient);
		if(quotient*2==number)
		{
			System.out.println("Even number");
		}

		
		/*****Logic three***/
		
		if(number%2 == 0)//number is divisible by 2 then even else odd
		{
			System.out.println("Even number");
		}
		else
		{
			System.out.println("Odd number");
		}
		
	}

	

}
