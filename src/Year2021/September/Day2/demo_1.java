package Year2021.September.Day2;

import org.junit.Test;

/**
 * 给你一个整数 x ，如果 x 是一个回文整数，返回 true ；否则，返回 false 。
 *
 * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。例如，121 是回文，而 123 不是。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-number
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class demo_1 {
    @Test
    public void run(){
        System.out.println(isPalindrome(121));
    }

    /**
     * 基本解决方式
     * 将x的每一位上的值进行拆分，进行比较
     * @param x
     * @return
     */
    public boolean isPalindrome(int x) {
        if(x < 0){
            return false;
        }
        if(x > 0 && x < 10){
            return true;
        }

        int orgVal = x;
        int tarVal = 0;
        while(x != 0){
            int tempVal = x % 10;
            tarVal = tarVal * 10 + tempVal;
            x /= 10;
        }

        if(orgVal == tarVal){
            return true;
        }else{
            return false;
        }
    }
}
