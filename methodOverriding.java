///method overriding demonstration


class Abc{
    public void print(){
        System.out.print("print from class abc");
    }
}



public class methodOverriding extends Abc {

    public void print(){
        System.out.println("Print from class methodOverriding");
    }

    public static void main(String[] args) {

        methodOverriding obj = new methodOverriding();
        obj.print();
        
    }    
}
