package Year2021.September.Day4;

import org.junit.Test;

/**
 * 给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
 * <p>
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * <p>
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：digits = [1,2,3]
 * 输出：[1,2,4]
 * 解释：输入数组表示数字 123。
 * 示例 2：
 * <p>
 * 输入：digits = [4,3,2,1]
 * 输出：[4,3,2,2]
 * 解释：输入数组表示数字 4321。
 * 示例 3：
 * <p>
 * 输入：digits = [0]
 * 输出：[1]
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/plus-one
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class demo_3 {

    @Test
    public void run() {
        //plusOne(new int[]{1,2,3});
        plusOne(new int[]{9,9});
    }

    public int[] plusOne(int[] digits) {

        digits[digits.length - 1] += 1;
        for (int i = digits.length - 1; i >= 1; i--) {
            if (digits[i] > 9) {
                digits[i - 1] += 1;
                digits[i] = digits[i] % 10;
            }
        }

        if (digits[0] > 9) {
            int[] res = new int[digits.length + 1];
            res[0] = 1;
            digits[0] = digits[0] % 10;
            for (int i = 0; i < digits.length; i++) {
                res[i + 1] = digits[i];
            }

            System.out.print("[");
            for (int i = 0; i < res.length; i++) {
                System.out.print(res[i] + "  ");
            }
            System.out.print("]");
            System.out.println();

            return res;
        } else {
            System.out.print("[");
            for (int i = 0; i < digits.length; i++) {
                System.out.print(digits[i] + "  ");
            }
            System.out.print("]");
            System.out.println();
            return digits;
        }
    }
}
