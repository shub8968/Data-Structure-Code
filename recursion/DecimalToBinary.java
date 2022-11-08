package recursion;

public class DecimalToBinary {
	
	public static void main(String[] args) {
	
	String k = findBinary(100, "");
		System.out.println(k);
	}
	
	
	private static String findBinary(int number, String result){
		
		if(number == 0){
			return result;
		}
		result = number % 2 + result;
		return findBinary(number/2, result);
	}
}
