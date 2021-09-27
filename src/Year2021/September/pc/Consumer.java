package Year2021.September.pc;

/**
 * 消费者
 *  消费产品，从共享空间中取走产品
 */
public class Consumer implements Runnable{
    private Goods goods;

    public Consumer(){}
    public Consumer(Goods goods) {
        this.goods = goods;
    }


    @Override
    public void run() {
        buyGood();
    }

    public void buyGood(){
        for (int i = 0; i < 20; i++) {
            goods.buy();
        }
    }
}
