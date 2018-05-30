import java.util.Scanner;
public class MonthEndday{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		while(true){
			System.out.println("0.종료 1.시작");
			int flag = sc.nextInt();
			switch(flag){
				case 0 : System.out.println("시작"); return;
				case 1 : System.out.println("종료"); break;
			}

		System.out.println("월을 입력해주세요");
		int month = sc.nextInt();
		String endDay = "";

		switch(month){
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : endDay ="31"; break;
			case 2 : endDay ="28"; break;
			case 4 : case 6 : case 9 : case 11: endDay ="30"; break;
			default : endDay = "다시 입력해주세요";
			}
			System.out.println(month + "월 End-day : " + endDay);


		}


		
		

		}
}