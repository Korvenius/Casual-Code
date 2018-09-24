//very basic anagram solver. only works with single word anagrams.
//made while watching 8 out of 10 cats does countdown.

import java.util.*;
import java.io.*;

public class AnagramSolver{

	public static void main(String[] args) throws IOException{


		//Scanner for user to input anagram to be solved		
		Scanner inScan = new Scanner(System.in);
		//Output prompt for user		
		System.out.println("Input anagram to be solved:");		
		String strA = inScan.next();
		//Make an array the length of the input string
		char[] arrA = new char[strA.length()];
		//Populate the array with the characters of input string
		for(int i=0; i<arrA.length; i++){
			arrA[i]=strA.charAt(i);		
		}
		//Sort the characters alphabetically
		Arrays.sort(arrA);

		int count=0;	
		//Scanner to scan through a list of English language words
		Scanner txtScan = new Scanner(new File("wordlist.txt"));
		while(txtScan.hasNextLine()){
			String strB=txtScan.nextLine();	
			char[] arrB = new char[strB.length()];
			for(int i=0; i<arrB.length; i++){
				arrB[i]=strB.charAt(i);		
			}
			Arrays.sort(arrB);
		
			if(Arrays.equals(arrA, arrB)&&!(strA.equals(strB))){			
				System.out.println(strB);
				count++;	
			}
		}
		System.out.println(count+" anagram(s) found.");

	}

}
