package Year2021.September.pc;

public class RunClass {
    public static void main(String[] args) {
        Goods goods = new Goods("娃哈哈","矿泉水");
        goods.setCount(0);
        Producer producer = new Producer(goods);
        Consumer consumer = new Consumer(goods);

        Thread producerThread = new Thread(producer);
        Thread consumerThread = new Thread(consumer);

        producerThread.start();
        consumerThread.start();
    }
}
