package ThreadPractice;

public class SecondThread {
    public static void main(String[] args){
        Runnable a = () -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("hi");
                    try { Thread.sleep(10);} catch (InterruptedException e) {}
                }
        };

        Runnable b = () -> {
                for (int i = 0; i < 5; i++) {
                    System.out.println("world");
                    try { Thread.sleep(10);} catch (InterruptedException e) {}
                }
        };

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);

        t1.start();
        t2.start();
    }
}
