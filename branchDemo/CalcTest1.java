import java.util.Scanner;
public class CalcTest1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("==============  Calculator ==============");
		System.out.print("\t Insert number1> : ");
		int input1 =  sc.nextInt();
		System.out.print("\t Insert Operation code> : ");
		String opCode =  sc.next();
		System.out.print("\t Insert number2> : ");
		int input2 =  sc.nextInt();
		int sum = 0;

		if(opCode.equals("+")){
			sum = input1 + input2;
		} else if(opCode.equals("-")){
			sum = input1 - input2;
		} else if(opCode.equals("*")){
			sum = input1 * input2;
		} else if(opCode.equals("/")){
			sum = input1 / input2;
		} else{
			sum = input1 % input2;
		}
		System.out.println("\t Question> : " + input1 + " " + opCode +  " " + input2);
		System.out.println("\t Answer> : " + sum);
		System.out.println("=========================================");
	}
}