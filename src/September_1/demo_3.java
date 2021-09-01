package September_1;

import org.junit.Test;

/**
 * 给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。
 * <p>
 * 如果反转后整数超过 32 位的有符号整数的范围 [−231,  231 − 1] ，就返回 0。
 * <p>
 * 假设环境不允许存储 64 位整数（有符号或无符号）。
 */
public class demo_3 {
    @Test
    public void run() {
        System.out.println(reverse(1534236469));
    }

    public int reverse(int x) {
        int temp = x;
        int res = 0;
        if (x < 0) {
            temp = x * (-1);
        }
        String valStr = temp + "";
        char[] chTemp = valStr.toCharArray();

        for (int i = 0; i < (chTemp.length / 2); i++) {
            char t = chTemp[i];
            chTemp[i] = chTemp[chTemp.length - i - 1];
            chTemp[chTemp.length - i - 1] = t;
        }

        try {
            res = new Integer(new String(chTemp)).intValue();
        } catch (NumberFormatException e) {
            return 0;
        }
        if (x < 0) {
            res = res * (-1);
        }
        return res;
    }

    /**
     * 优化
     */
    public int reverse2(int x){
        int res = 0;
        while(x != 0){
            if(res > Integer.MAX_VALUE || res<Integer.MIN_VALUE){
                return 0;
            }
            int temp = x % 10;
            res = res*10 + temp;
            x /= 10;
        }
        return res;
    }
}
