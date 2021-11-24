
import java.util.Scanner;

public class printDigitAsSeriesOfWord{

public static void main(String args[]){
	System.out.print("Enter Digit: ");
	Scanner scan = new Scanner(System.in);
	
	
	String input = scan.next();

	//int string_length = input.length();
	
	System.out.print(input);
	for(char ch: input.toCharArray()){
		
		
	switch(String.valueOf(ch)){
		case "0":
			System.out.print(" Zero ");
			break;
		case "1":
			System.out.print(" One ");
			break;
		case "2":
			System.out.print(" Two ");
			break;
		case "3":	
			System.out.print(" Three ");
			break;
		case "4":
			System.out.print(" Four ");
			break;
		case "5":
			System.out.print(" Five ");
			break;
		case "6":
			System.out.print(" Six ");
			break;
		case "7":
			System.out.print(" Seven ");
			break;
		case "8":
			System.out.print(" Eight ");
			break;
		case "9":
			System.out.print(" Nine ");
			break;
	}
	
	}
}


}