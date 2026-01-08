package ThreadPractice;

class A extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("hi");
            setPriority(Thread.MAX_PRIORITY);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("World");
            setPriority(Thread.MAX_PRIORITY);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
        }
    }
}

public class FirstThread {
    public static void main(String[] args){
        A a = new A();
        B b = new B();

        a.start();
        try{
            Thread.sleep(2);
        } catch (InterruptedException e) {}
        b.start();
    }
}
