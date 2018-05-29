import java.util.Scanner;
public class GradeReport{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("이름?");
		String name = sc.next();
		
		System.out.println("국어점수?");
		int kor = sc.nextInt();
		if(kor >100 || 0 > kor){
			System.out.print("Error");
			return;
		}
		System.out.println("영어점수?");
		int eng = sc.nextInt();
		if(eng >100 || 0 > eng){
			System.out.print("Error");
			return;
		}
		System.out.println("수학점수?");
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
			hak = "E";x
		} else {
			hak = "F";
		}

		System.out.println(name + " " + "[평균] " + avg + "[학점] " + hak);
	}

}