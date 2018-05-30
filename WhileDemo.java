public class WhileDemo{
	public static void main(String[] args){
		int count=1, sum=0;
		String result = "";
		String a= "+";
		while(count < 11){
			if(count==10){
				a = "=";
			}
			result += count + a;
			sum += count;
			count++;
		}
		System.out.print(result+sum);	
	}
}