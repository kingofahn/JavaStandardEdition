import java.util.Scanner;
public class howMuch{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�󸶿���?");
		int price = sc.nextInt();
		System.out.println("� �帱���");
		int unit = sc.nextInt();
		System.out.println(unit +"�� �ּ���");
		System.out.println("�� �ݾ��� " + price*unit + " �� �Դϴ�.");
		System.out.println("��ο� ����ּ���!!!");
		System.out.println("�� �ۼ�Ʈ dc �ұ��?");
		int dc = sc.nextInt();
		String result = price*unit*(100-dc)/100+"��" ;
		if(dc>=10){
			result ="���Ⱦƿ�!!!";
		} 
		System.out.println(result);
	}
}