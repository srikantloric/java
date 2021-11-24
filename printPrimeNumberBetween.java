import java.util.ArrayList;
import java.util.List;

///code to genreate the list of prime number between 100 - 1000

public class printPrimeNumberBetween {
    public static void main(String[] args) {

        List <Integer> primeList = new ArrayList<Integer>();


        for(int i=100;i<=1000;i++){

            int  count = 0;
            for(int j=1;j<(i-1)/2;j++){
                if(i%j==0){
                   count+=1;
                }
            }

            if(count==2){
                primeList.add(i);
            }
        }
        System.out.println("Prime Numbers : "+primeList);
        System.out.println("Prime Numbers Total : "+primeList.size());
        
    }
}
