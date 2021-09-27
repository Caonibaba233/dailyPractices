package Year2021.September.Day26;

public class demo2 implements Runnable{
    private int tickets = 5;

    public static void main(String[] args) {
        demo2 d = new demo2();
        Thread thread1 = new Thread(d);
        Thread thread2 = new Thread(d);
        Thread thread3 = new Thread(d);
        Thread thread4 = new Thread(d);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
    }

    @Override
    public void run() {
        while(tickets > 0){
            System.out.println(Thread.currentThread().getName() + "====" + tickets--);
        }
    }
}
