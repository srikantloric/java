
//check wether the passed params is armstring or not
public class cmdLineArgsCheckArmstrong {
    public static void main(String[] args) {

        int input = Integer.parseInt(args[0]);

        int originalNumber,remainder,result = 0;
        originalNumber = input;

        while(originalNumber != 0){
            remainder = originalNumber%10;
            result += Math.pow(remainder, args[0].length());
            originalNumber /=10;

        

        }

        if(result ==input){
            System.out.println(input +" is an armstrong number");
        }else{
            System.out.println(input+" is not an armstong number");
        }
        
    }
}
