
//cmd Line args to accept 2 number and find sum 
public class cmdLineArgsSum {
    public static void main(String args[]) {
        

        //extracting args from cmdline

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        //Calculating sum
        int sum = a+b;

        System.out.println("Sum of passed args:"+sum);

        
    }
    
}
