
public class EndsWith {

	public static void main(String[] args) {
		
		endWith("Brother drinks brandy", "randy");
	}
	
	public static boolean endWith(String a, String b){
		
		int first = a.length();
		int second = b.length();
		
		if (first >= second) {
			
			System.out.println(a.substring(first - second, first).equals(b));
			return a.substring(first - second, first).equals(b);
		} else {
			
			System.out.println("False");
			return false;
		} 
		
		
		
	}

}
