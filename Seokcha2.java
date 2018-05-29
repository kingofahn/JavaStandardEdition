public class Seokcha2{
	public static void main(String[] args){
		int A[][] = new int[25][2];
		int R[] = new int[25];
		for(int i = 0 ; i < 25 ; i++)
			A[i][1] = (int)(Math.random() * 300) + 1;
		for(int i = 0 ; i<25; i++){
			A[i][0] = i + 1;
			R[i] = 0;
		}
		for(int i=0; i<25; i++){
			for(int j=0; j<25; j++){
				if(A[i][1]<= A[j][1])
					R[i]++;
			}
			System.out.println(A[i][0] + "(" + A[i][1] + ")\t : " + R[i]);
		}
		System.out.println();
	}
}