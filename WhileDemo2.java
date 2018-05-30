import java.util.Scanner;
public class WhileDemo2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
			System.out.print("0.End 1.Start > ");
			int flag = sc.nextInt();

		switch(flag){
			case 0 : System.out.println("end"); return;
			case 1 : System.out.println("Start"); break;
			default : System.out.println("Wrong!!!"); continue;
			}


			String result = "";
			String a = "+";
			int max=0, min=0, sum=0;

			
			System.out.println("값을 입력해주세요");
			int input1 = sc.nextInt();
			System.out.println("값을 입력해주세요");
			int input2 = sc.nextInt();

			if(input1 < input2){
				max = input2;
				min = input1;
			} else {
				max = input1;
				min = input2;
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

		System.out.println(result + "\n" + sum);


		}

		
	} 
}