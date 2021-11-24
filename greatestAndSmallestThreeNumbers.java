import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class greatestAndSmallestThreeNumbers {
    public static void main(String[] args) {
        
        //greatest and smallest among three numbers
        int number[] = new int[]{50,40,60};

        int smallest = number[0];
        int greatest = number[0];

        for(int i=1;i<number.length;i++){
            if(number[i]>greatest){
                greatest = number[i];
            }else if(number[i]<smallest){
                smallest = number[i];
            }
        }
        
        System.out.println("Greatest number :"+greatest);
        System.out.println("Smallest number :"+smallest);
      

    }
    
}
