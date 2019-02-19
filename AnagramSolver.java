//very basic anagram solver. only works with single word anagrams.
//made while watching 8 out of 10 cats does countdown.

import java.util.Scanner;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;

public class AnagramSolver{

	public static void main(String[] args) throws IOException{


		//Scanner for user to input anagram to be solved		
		Scanner inScan = new Scanner(System.in);
		//Output prompt for user		
		System.out.println("\nInput anagram to be solved:\n");		
		String strA = inScan.next();
        	System.out.println("---------------------------");
		//Create a character array of the input string
		char[] arrA = strA.toCharArray();
		//Sort the characters alphabetically
		Arrays.sort(arrA);
		int count=0;	
		//Scanner to scan through a list of English language words
		Scanner txtScan = new Scanner(new File("wordlist.txt"));
		while(txtScan.hasNextLine()){
			String strB=txtScan.nextLine();	
			char[] arrB = strB.toCharArray();
			Arrays.sort(arrB);
		
			if(Arrays.equals(arrA, arrB)&&!(strA.equals(strB))){			
				System.out.println(strB);
				count++;	
			}
		}
        if(count==1){
		    System.out.println("\n"+count+" anagram found.\n");
        }
        else{
            System.out.println("\n"+count+" anagram(s) found.\n");
        }

	}

}
