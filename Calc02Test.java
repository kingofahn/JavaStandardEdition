import java.util.Scanner;
public class Calc02Test{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Insert Number1> ");
		int num1 = sc.nextInt();

		System.out.print("Insert Opcode (+ - * / %)> ");
		String opCode = sc.next();

		System.out.print("Insert Number2> ");
		int num2 = sc.nextInt();

		int num3;
		
		if(opCode.equals("+")){
			num3 = num1 + num2;
		} else if(opCode.equals("*")){
			num3 = num1 * num2;
		} else if(opCode.equals("/")){
			num3 = num1 / num2;
		} else if(opCode.equals("-")){
			num3 = num1 - num2;
		} else{
			num3 = num1 % num2;
		}
		System.out.print(num1 + " " + opCode + " " + num2 + " " + " = " + num3);

	}
}