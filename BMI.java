import java.util.Scanner;
public class BMI{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){
		System.out.print("0.���� 1.����");
		int flag = sc.nextInt();
		switch(flag){
			case 0 :System.out.println("����"); return;
			case 1 :System.out.println("����"); break;  
		}

		System.out.print("Ű�� �Է��ϼ���(cm) > : ");
		double height = sc.nextDouble();
		height = height/100;
		System.out.print("�����Ը� �Է��ϼ���(kg) > : ");
		double weight = sc.nextDouble();

		double BMIResult = weight/(height*height);
		System.out.println("BMI������ " + BMIResult  + "�Դϴ�.");
		
		String result = "";
		if(BMIResult >= 35){
			result = "3�ܰ� ��";
		} else if(BMIResult >= 30){
			result = "2�ܰ� ��";
		} else if(BMIResult >= 25){
			result = "1�ܰ� ��";
		} else if(BMIResult >= 23){
			result = "�� ���ܰ�";
		} else if(BMIResult >= 18.5){
			result = "����";
		} else{
			result = "��ü��";
		}
		System.out.println("BMI �����" + result + "�Դϴ�.");

		}

	}
}