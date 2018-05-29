public class Selection{
	public static void main(String[] args){
		int E[] = {80,70,60,50,90};
		int i = 0;
		int Temp;
		do{
			int j = i + 1;
			do{
				if(E[i] > E[j]){
					Temp = E[i];
					E[i] = E[j];
					E[j] = Temp;
				}
				j++;
			} while(j<5);
			i++;	
		} while(i<4);

		for(int a = 0; a<5; a++)
			System.out.println(E[a] + "\t");
		System.out.println();

	}
}