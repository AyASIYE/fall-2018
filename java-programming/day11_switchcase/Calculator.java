package day11_switchcase;

public class Calculator {
	public static void main(String[] args) {
		int num1, num2, result;
		char operator;
		
		num1 = 25;
		num2 = 3;
		operator = '/';
		
		switch(operator) {
			case '+':
				result = num1 + num2;
				break;
			case '-':
				result = num1 - num2;
				break;
			case '*':
				result = num1 * num2;
				break;
			case '/':
				result = num1 / num2;
				break;
			case '%':
				result = num1 % num2;
				break;
			default:
				System.out.println("ERROR: Invalid Operator selected");
				return;//dont run the rest of code below.
					   //get out of main method right here
		}
		
		System.out.println(result);
		
		
	}
}
