package recursion;

public class SumOfNaturalNumbers {
	
	public static void main(String[] args) {
		
		int k = sum(0);
		System.out.println(k);
		
	}
	
	private static int sum(int i){
		
		if(i==1){
			return 1;
		}
		
		return i + sum(i - 1);
	}
}
