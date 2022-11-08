package genericprob;

public class SubStringcheck {
	
	public static void main(String[] args) {
		String hashId = "12222/abddc.png";
		String res = hashId.substring(hashId.indexOf("/") +1 ,hashId.indexOf("."));
		System.out.println(res);
	}
}
