///programe to demonstrate abstract class and methods
abstract class Bike{
    abstract void run();

}

public class abstractClassAndMethod extends Bike{

    void run(){
        System.out.println("Run method inpplemented..");
    }
    public static void main(String[] args) {
        abstractClassAndMethod obj = new abstractClassAndMethod();
        obj.run();
    }
}
