import java.util.Scanner;
public class RPSGame{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ���� �� ������ ���� �մϴ�");
		System.out.println("==========================================================");
		System.out.print("Player1 : ����?(1) ����?(2) ��?(3) ");
		int input1 = sc.nextInt();
		System.out.print("Player2 : ����?(1) ����?(2) ��?(3) ");
		int input2 = sc.nextInt();
		String result;

		if((input1==1 && input2==2) || (input1==2 && input2==3) ||(input1==3 && input2==1)){
			result = "Player2 �̱�";
		} else if(input1==input2){
			result = "Player1�� Player2 ���";
		} else{
			result = "Player1 �̱�";
		}
		System.out.println("\t" + result);
		System.out.println("==========================================================");
	}
}