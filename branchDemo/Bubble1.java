public class Bubble1{
	public static void main(String[] name){
		int E[] = {95,75,85,100,50};
		int i = 0;
		int Temp;
		do{
			int j = 0;
			do{
				if(E[j] > E[j+1]){
					Temp = E[j];
					E[j] = E[j+1];
					E[j+1] = Temp;
				}
				j++;
			} while(j < 4 - i);
			i++; 
		} while (i < 4);
		for(i =0 ; i< 5; i++ )
			System.out.print(E[i] + "\t");
		System.out.println();

	}
}