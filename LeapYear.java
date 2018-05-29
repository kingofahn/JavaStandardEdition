import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("년도 입력해주세요");
		int year = sc.nextInt();
		String result ="";
		if(year%4==0){
		result="윤년";
		} else {
		result="평년";
		}
		System.out.print(result);

	}
}