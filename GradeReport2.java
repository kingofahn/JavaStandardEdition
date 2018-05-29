import java.util.Scanner;
public class GradeReport2{
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

		switch(avg/10){
			case 9: hak="A" ;break;
			case 8: hak="B" ;break;
			case 7: hak="C" ;break;
			case 6: hak="D" ;break;
			case 5: hak="E";break;
			default : hak="F";break;
		}
		System.out.println(name + " " + "[평균] " + avg + "[학점] " + hak);
	}

}