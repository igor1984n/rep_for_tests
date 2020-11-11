public class Main{
	public static void main(String[]args){
		String s = "Hello, world!";
		for(int i = 0; i < s.length(); i++){
			System.out.println("\t".repeat(i) + s.charAt(i));
		}
	}
}
