import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�⵵ �Է����ּ���");
		int year = sc.nextInt();
		String result ="";
		if(year%4==0){
		result="����";
		} else {
		result="���";
		}
		System.out.print(result);

	}
}