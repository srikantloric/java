public class swapWithoutUsingThirdVariable {
    public static void main(String args[]) {

        ///Swaping wihout using third variable

        int a = 10;
        int b=20;

        System.out.println("Value of a before swaping: "+ a);
        System.out.println("Value of b before swaping: "+ b);

        //swaing 
        a  = a+b;
        b= a-b;
        a = a-b;

        System.out.println("Value of a after swaping: "+ a);
        System.out.println("Value of b after swaping: "+ b);
        
    }    
}
