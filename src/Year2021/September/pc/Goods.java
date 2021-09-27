package Year2021.September.pc;

public class Goods {
    private String brand;
    private String name;
    private int count;
    private boolean hasGoods = false;

    public Goods(){}
    public Goods(String brand, String name)
    {
        this.brand = brand;
        this.name = name;
    }
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /**
     *  生产商品
     */
    public synchronized void product(String brand,String name){
        //队列中的商品数量大于零，则不进行生产
        if(hasGoods){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("生产了1个" + this.getBrand() + "的" + this.getName());
        hasGoods = true;
        notify();
    }

    /**
     * 消费商品
     */
    public synchronized void buy(){
        if(!hasGoods){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费了一个"+ this.getBrand() + "的" + this.getName());
        hasGoods = false;
        notify();
    }

}
