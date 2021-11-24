///thread periority demonstration

class ThreadA extends Thread{
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("From thread A : "+i);
        }
    }
}

class ThreadB extends Thread {
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.println("From thread B : "+i);
        }
    }
}

public class threadPeriority {

    public static void main(String[] args) {
        ThreadA threadA = new ThreadA();
        threadA.setPriority(5);
       

        ThreadB threadB = new ThreadB();
        threadB.setPriority(10);
        threadB.run();
        threadA.run();

    }

    
}
