import java.util.Scanner;
public class GradeReport{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		while(true){

		System.out.print("0.End 1.Start > ");
		int flag = sc.nextInt();

		switch(flag){
			case 0 : System.out.println("end"); return;
			case 1 : System.out.println("Start"); break;
			default : System.out.println("Wrong!!!"); continue;
		}


		System.out.println("�̸�?");	
		String name = sc.next();
		
		System.out.println("��������?");
		int kor = sc.nextInt();
		if(kor >100 || 0 > kor){
			System.out.print("Error");
			return;
		}
		System.out.println("��������?");
		int eng = sc.nextInt();
		if(eng >100 || 0 > eng){
			System.out.print("Error");
			return;
		}
		System.out.println("��������?");
		int math = sc.nextInt();
		if(math >100 || 0 > math){
			System.out.print("Error");
			return;
		}
	
		int avg = (kor + eng + math)/3;
		String hak = "";

		if(avg >= 90){
			hak = "A";
		} else if(avg>=80){
			hak = "B";
		} else if(avg>=70){
			hak = "C";
		} else if(avg>=60){
			hak = "D";
		} else if(avg>=50){
			hak = "E";
		} else {
			hak = "F";
		}

		System.out.println(" [�̸�] : " + name + " " + " [���] : " + avg + " [����] : " + hak);


		}



		
	}

}