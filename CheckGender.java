import java.util.Scanner;
public class CheckGender{
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("0.���� 1.����");
			int flag = sc.nextInt();
		
			switch(flag){
				case 0 : System.out.println("����"); return;
				case 1 : System.out.println("����"); break;
			}

		System.out.println("�ֹε�Ϲ�ȣ�� �Է��ϼ���.");
		String idNum = sc.next();
		
		char idGen = idNum.charAt(7);
		String GenFin ="";

		switch(idGen){
			case '1': case '3': GenFin="����";break;
			case '2': case '4': GenFin="����";break;
			case '5': case '6': GenFin="�ܱ���";break;
			default : GenFin="�ٽ� �Է��ϼ���.";break;
		}
		System.out.println(GenFin);
		}
	}
}