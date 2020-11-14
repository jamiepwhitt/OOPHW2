import java.lang.Math; 
import java.util.Scanner;
public class oophw2 {
	
	public static String askQuestion(Scanner scanner, String question) {
		System.out.print(question + " ");     // type a word and hit enter
		String userinput = scanner.next().toString();
		//int inputNum = Integer.parseInt(userinput);
		return userinput;
	}
	
	static int factorial(int n) 
	    { 
	        int res = 1, i; 
	        for (i=2; i<=n; i++) 
	            res *= i; 
	        return res; 
	    }
	
//calculator
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Input the first number: ");
	int n1 = scanner.nextInt();
	System.out.println("Input the second number: ");
	int n2 = scanner.nextInt();
	int sum = n1 + n2;
	int minus = n1 - n2;
	int multiply = n1 * n2;
	int subtract = n1 + n2;
	int divide = n1 / n2;
	int square = n1 * n1;
			  System.out.printf("Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nSquare = %d\n ", sum, minus, multiply, subtract, divide, square);
			  
			  String magicCalculator = askQuestion(scanner, "Use the magic calculator? Yes or No");
				 if (magicCalculator.equals("Yes") || magicCalculator.equals("Y")){
	//Magic Calculator
	
					 
					 System.out.println("Input the third number: ");
					 int n3 = scanner.nextInt();		
			//sqrt
					 double e = n3;
					 System.out.println("Sqrt= " + (Math.sqrt(e)));
			//sin
					 double a = Math.toRadians(n3);
					 System.out.println("Sin= " + (Math.sin(a)));
			//cos
					 double b = Math.toRadians(n3);
					 System.out.println("Cos= " + (Math.cos(b)));
			//tangent
					 double c = Math.toRadians(n3);
					 System.out.println("Tan= " + (Math.tan(c)));
			//factorial
					 int n = n3; 
				        System.out.println("!= " + (factorial(n)));
	}
				 
	}
};
	
