class swapUsingThirdVariable {
    public static void main(String args[]) {
        ///Swaping using third variable

        int a = 10;
        int b=20;

        System.out.println("Value of a before swaping: "+ a);
        System.out.println("Value of b before swaping: "+ b);

        //swaing 
        int temp  = a;
        a=b;
        b=temp;

        System.out.println("Value of a after swaping: "+ a);
        System.out.println("Value of b after swaping: "+ b);

        
    }
}