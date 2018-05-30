import java.util.Scanner;
public class InfiniteLoop{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		
		while(true){
			System.out.println("0.stop 1.시작");
			int flag = sc.nextInt();
			switch(flag){
				case 0 : System.out.println("종료"); return;
				case 1 : System.out.println("주문하세요"); break;
				default : ; break;
			}
			
		}
	}
}