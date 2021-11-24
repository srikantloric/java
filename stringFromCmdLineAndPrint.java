

/// Programe to enter five string from command line argument and print the strings
public class stringFromCmdLineAndPrint {
    public static void main(String[] args) {
        for(int i=0;i<5;i++){
            System.out.println("String "+(i+1)+" is :"+args[i]);
        }
    }
    
}
