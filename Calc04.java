import java.util.Scanner;
public class Calc02Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert number1");
		int num1 = sc.nextInt();
		System.out.print("Input operation code + - * / %");
		String opInput = sc.next();
		System.out.print("Insert number1");
		int num2 = sc.nextInt();
		int sum;
		
		String opCode;

		if(opInput.equals("+")){
			sum = num1 + num2;
			
		} else if(opInput.equals("-")){
			sum = num1 - num2;
		} else if(opInput.equals("*")){
			sum = num1 * num2;
		} else if(opInput.equals("/")){
			sum = num1 / num2;
		} else{
			sum = num1 % num2;
		}

		System.out.println(num1 + " " + opInput + " " + num2 + " = " + sum);

	}
}