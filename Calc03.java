import java.util.Scanner;
public class Calc03{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int sum=0;
		String result = "";

		System.out.print("Input number1 > ");
		int num1 = sc.nextInt();
		System.out.print("Input operation code + - * / % > ");
		String opInput = sc.next();
		System.out.print("Input number2 > ");
		int num2 = sc.nextInt();

		switch(opInput){
			case "+":sum = num1 + num2;break;
			case "-":sum = num1 - num2;break;
			case "*":sum = num1 * num2;break;
			case "/":sum = num1 / num2;break;
			case "%":sum = num1 % num2;break;
			default : result="Error"; break;
		}
		if(!result.equals("Error")){
			result = num1 + opInput + num2 + "=" + sum;
		}
		System.out.println(result);	
	}
}