import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("가위 바위 보 게임을 시작 합니다");
		System.out.println("==========================================================");
		System.out.print("Player1 : 가위?(1) 바위?(2) 보?(3) ");
		int input1 = sc.nextInt();
		System.out.print("Player2 : 가위?(1) 바위?(2) 보?(3) ");
		int input2 = sc.nextInt();
		String result;

		if((input1==1 && input2==2) || (input1==2 && input2==3) ||(input1==3 && input2==1)){
			result = "Player2 이김";
		} else if(input1==input2){
			result = "Player1과 Player2 비김";
		} else{
			result = "Player1 이김";
		}
		System.out.println("\t" + result);
		System.out.println("==========================================================");
	}
}