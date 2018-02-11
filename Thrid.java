public class Thrid {
	public static void main(String[] args) {
		String str = "4665bcDedvsdv";
		System.out.println(Check(str));
	}
	static boolean Check(String str) {
		Boolean result = false;
		Boolean bool = str.matches(".*[0-9]+.*"); 
		Boolean boolc = str.matches(".*[a-z]+.*");
		Boolean boold = str.matches(".*[A-Z]+.*");
		if(str.length() >= 8) {
			
			if(bool == true) {
				if(boolc == true) {
					if(boold == true) {
						result = true;
					}
				}
			}
			
		}
		return result;
	}
}
