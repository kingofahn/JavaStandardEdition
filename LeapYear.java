import java.util.Scanner;
public class LeapYear{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
		System.out.println("0.���� 1.����");
		int flag = sc.nextInt();
		switch(flag){
			case 0 :System.out.println("����"); return;
			case 1 :System.out.println("����");break;
		}

		System.out.println("�⵵ �Է����ּ���");
		int year = sc.nextInt();
		String result ="";

		if(year%4==0 && year%100!=0 || year%400==0 ){
		result="����";
		} else {
		result="���";
		}

		System.out.println(result);
		}

		
		
	}
}

/*
������ 4�� �������� 0 �̶�� ������ �� �ִ�.  

100���� ������ �������� ����̴�. 

400���� ���� �������� ������ �����̴�. 



�׷��� �ش� ������ 100���� ������ �������� ����̴�. 
2000���� 4�� �������� 0 �̶� ������ �� �ִµ�.. 
�ٽ� �� ���� 100���� ���� �������� ����̴�. 
����̶� �ص� �ٽ� 400���� ���� �������� ������ �����̴�. 
����) 2000�� �� 2016 ���� �Է��ϸ� �������� ����
*/