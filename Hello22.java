import java.util.Scanner;
public class Hello22{
public static void main(String[] args){
	System.out.print("your name?");
	Scanner scanner = new Scanner(System.in);
	String name = scanner.next();
	System.out.print("Hello" + name);
	}	
}