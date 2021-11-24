//programe to demostrate break and continue


public class breakAndContinue {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5){
                continue;
            }
            System.out.println(i);

            if(i==9){
                break;
            }
        }
    }
}
