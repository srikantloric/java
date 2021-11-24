
import java.util.Scanner;

//check wether the string is pallindrome or not ?
public class stringIsPalindromeOrNot {
    public static void main(String[] args) {
        
        //taking input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the string : ");

        String input = sc.next();
        String reverse = "";

        String split[] = input.split("");


        for(int i = (split.length-1);i>=0;i--){
            reverse = reverse+split[i];
        }
        
        //checking for palindrome

        System.out.println(input);
        System.out.println(reverse);

        if(input.equals(reverse)){
            System.out.println("Entered String is a palindrome !");
        }else{
            System.out.println("Not a palindrome");
        }

    }
}
