
public class First {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 2, 1};
		System.out.println(booleanpalindrome(arr));
		
	}
	static boolean booleanpalindrome(int arr[])  {
		int check = 0;
		for(int i = 0,j = arr.length; i<arr.length; i++, j--) {
			if(arr[i] == arr[j-1]) {
				check = 1;
			}
		}
		if(check == 1) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
