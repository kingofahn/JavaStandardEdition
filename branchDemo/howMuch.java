import java.util.Scanner;
public class howMuch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마에요?");
		int price = sc.nextInt();
		System.out.println("몇개 드릴까요");
		int unit = sc.nextInt();
		System.out.println(unit +"개 주세요");
		System.out.println("총 금액은 " + price*unit + " 원 입니다.");
		System.out.println("비싸요 깍아주세요!!!");
		System.out.println("몇 퍼센트 dc 할까요?");
		int dc = sc.nextInt();
		String result = price*unit*(100-dc)/100+"원" ;
		if(dc>=10){
			result ="안팔아요!!!";
		} 
		System.out.println(result);
	}
}