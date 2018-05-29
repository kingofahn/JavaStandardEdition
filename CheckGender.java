import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요.");
		String idNum = sc.next();
		
		char idGen = idNum.charAt(7);
		String GenFin ="";

		switch(idGen){
			case '1': case '3': GenFin="남자";break;
			case '2': case '4': GenFin="여자";break;
			case '5': case '6': GenFin="외국인";break;
			default : GenFin="다시 입력하세요.";break;
		}

		System.out.print(GenFin);
	}
}