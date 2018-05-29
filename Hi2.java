import java.util.Scanner;
public class Hi2{
	public static void main(String[] arsg){
		System.out.print("이름이?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.print("반갑습니다." + name);

	}
}