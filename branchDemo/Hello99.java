import java.util.Scanner;
public class Hello99{
	public static void main(String[] args){
		System.out.print("Your name?");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		System.out.print("How are you?" + name);

	}
}