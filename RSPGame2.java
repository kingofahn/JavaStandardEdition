import java.util.Scanner;
public class RSPGame2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("===== Rock(1) Scissor(2) Paper(3) ======");
		System.out.print("\t Player 1 Start > : ");
		int input1 = sc.nextInt();
		System.out.print("\t Player 2 Start > : ");
		int input2 = sc.nextInt();
		
		// Rock = 1 Scissor = 2 Paper = 3
		if((input1==1 && input2==2) || (input1==2 && input2==3) || (input1==3 && input2==1)){
		System.out	.print("======== Player 1 win!!! ========");
		} else if((input2==1 && input1==2) || (input2==2 && input1==3) || (input2==3 && input1==1)){
		System.out.print("======== Player 2 win!!! ========");
		} else{
		System.out.print("========== Draw!!!  ==========");
		}

	}
}