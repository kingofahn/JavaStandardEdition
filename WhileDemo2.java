import java.util.Scanner;
public class WhileDemo2{
	public static void main(String[] args){
		String result = "";
		String a = "+";
		int max=0, min=0, sum=0;

		Scanner sc = new Scanner(System.in);
		System.out.println("값을 입력해주세요");
		int input1 = sc.nextInt();
		System.out.println("값을 입력해주세요");
		int input2 = sc.nextInt();

		if(input1 < input2){
			max = input2;
			min = input1;
		} 
		/*
		if(input1>input2){
			temp=input1;
			input1=input2;
			input2=temp;
			System.out.println("Alert!!!" + "\n" + "숫자1이 더 커서 숫자2와 바꾸어 계산하였습니다.");
		}
		*/

		while(min <= max){
			if(min == max){
				a = "=";
			}
			result += min + a;
			sum += min;
			min++;
		}
		System.out.print(result + "\n" + sum);
	} 
}