public class constructorOverloading {

    constructorOverloading(int a ,int b){
        System.out.println("From constor 1 sum of a and b :"+(a+b));
    }

    constructorOverloading(int a,int b ,int c){
        System.out.println("From constructor 2, Sum of a,b and c :"+(a+b+c));
    }
    public static void main(String[] args) {
        constructorOverloading obj = new constructorOverloading(50, 60);
        constructorOverloading obj2 = new constructorOverloading(60, 80, 60);
        
    }
}
