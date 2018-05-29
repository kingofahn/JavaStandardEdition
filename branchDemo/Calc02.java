import java.util.Scanner;
public class Calc02{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number 1");
		int num1 = scan.nextInt();
		System.out.println("Enter OPCODE");
		System.out.println("if Plus then Enter 1");
		System.out.println("if Minus then Enter 2");
		System.out.println("if Multi then Enter 3");
		System.out.println("if Divide then Enter 4");
		System.out.println("if Modular then Enter 5");
		int opcode = scan.nextInt();
		System.out.println("Enter number2");
		int num2 = scan.nextInt();
		int num3=0;
		String Op;
		
		if(opcode == 1){
			num3 = num1 + num2;
			Op = "+";
		} else if(opcode ==2){
			num3 = num1 - num2;
			Op = "-";
		} else if(opcode ==3){
			num3 = num1 * num2;
			Op = "*";
		} else if(opcode ==4){
			num3 = num1 / num2;
			Op = "/";
		} else {
			num3 = num1 % num2;
			Op = "%";
		}
			System.out.println(num1 +" "+ Op +" "+ num2 + " = " + num3);	
	}
}
