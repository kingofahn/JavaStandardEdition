import java.util.Scanner;
public class MonthEndday{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���� �Է����ּ���");
		int month = sc.nextInt();
		String endDay = "";

		switch(month){
			case 1 : case 3 : case 5 : case 7 : case 8 : case 10 : case 12 : endDay ="31"; break;
			case 2 : endDay ="28"; break;
			case 4 : case 6 : case 9 : case 11: endDay ="30"; break;
			default : endDay = "�ٽ� �Է����ּ���";
			}
			System.out.println(endDay);

		}
}