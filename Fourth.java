
public class Fourth {
	public static void main(String[] args) {
		
	
		String str = "Frankness applauded by supported ye household?! John in bad.";
		String separator = " ";
		String[] totsent = Cut(str, separator);
		System.out.println("Words - " + NumberWord(totsent));
		int count = str.split("[!?.]+").length; //plus makes those 3 delimiters seen as one
		System.out.println("Sentences - " + count); 
	}
	
	static String[] Cut (String sent, String str) {
		String[] sep = sent.split(str);
		return sep; //makes an array of words
	
	}
	static int NumberWord (String [] arr) {
		int nword = 0;
		for(int i = 0; i<arr.length; i++) {
			if(arr[i].length()>=3) {
				nword++;
			}
		}
		return nword; //counts the number of words
	}
}
	

	
