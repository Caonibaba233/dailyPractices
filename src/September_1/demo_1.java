package September_1;

import org.junit.Test;

/**
 * 斐波那契数，通常用 F(n) 表示，形成的序列称为 斐波那契数列 。
 * 该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
 * <p>
 * F(0) = 0，F(1) = 1
 * F(n) = F(n - 1) + F(n - 2)，其中 n > 1
 * 给你 n ，请计算 F(n) 。
 */
public class demo_1 {
    @Test
    public void run() {
        System.out.println();
    }

    /**
     * 基本解法
     */
    public int fib(int n) {
        switch (n) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            default:
                return fib(n - 1) + fib(n - 2);
        }
    }

    /**
     * 进阶解法
     * @param n
     * @return
     */
    public int fib2(int n){
        if (n < 2) {
            return n;
        }
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; ++i) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }

}


