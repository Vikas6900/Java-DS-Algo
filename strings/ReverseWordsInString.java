package strings;

import java.util.Scanner;

public class ReverseWordsInString {

	public static void main(String[] args) {

		
		String s = "sky is the blue";
		
		String ans = "";
		
		int i = s.length() - 1;
		
		while(i >= 0) {
			while(i >= 0 && s.charAt(i) == ' ' ) i--;        //to remove space if any after the string
			
			int j = i;
			
			if(i < 0) break;
			while(i >= 0 && s.charAt(i) != ' ') i--;          //for finding a word
			
			if(ans.isEmpty()) {
				ans = ans.concat(s.substring(i+1,j+1));
			}else {
				ans = ans.concat(" " + s.substring(i+1,j+1));     //to insert space after each word.
			}
			
		}
		System.out.println(ans);
	}

}
