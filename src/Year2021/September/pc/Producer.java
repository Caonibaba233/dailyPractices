package Year2021.September.pc;

/**
 * 生产者
 *  生产产品，将产品放在共享空间中。
 *
 */
public class Producer implements Runnable{
    private Goods goods;

    public Producer(){}
    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        productGood();
    }

    public void productGood(){
        for (int i = 0; i < 20; i++) {
            goods.product(goods.getBrand(),goods.getName());
        }
    }
}
