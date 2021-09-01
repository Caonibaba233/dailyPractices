package September_1;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 给你一个下标从 0 开始的字符串 s ，它的 偶数 下标处为小写英文字母，奇数 下标处为数字。
 * <p>
 * 定义一个函数 shift(c, x) ，其中 c 是一个字符且 x 是一个数字，函数返回字母表中 c 后面第 x 个字符。
 * <p>
 * 比方说，shift('a', 5) = 'f' 和 shift('x', 0) = 'x' 。
 * 对于每个 奇数 下标 i ，你需要将数字 s[i] 用 shift(s[i-1], s[i]) 替换。
 * <p>
 * 请你替换所有数字以后，将字符串 s 返回。题目 保证 shift(s[i-1], s[i]) 不会超过 'z' 。
 */
public class demo_2 {

    @Test
    public void run() {
        String res = replaceDigits("a1c1e1g");
        System.out.println(res);
    }

    public String replaceDigits(String s) {
        char[] temp = s.toCharArray();
        String res = "";
        for (int i = 0; i < temp.length; i++) {
            if(i % 2==0 && i != temp.length-1){
                //temp[i+1] = shift(temp[i],Character.getNumericValue(temp[i+1]));
                temp[i+1] = (char)Integer.parseInt(String.valueOf((byte)temp[i]+Character.getNumericValue(temp[i+1])));
            }
        }
        res = new String(temp);
        return res;
    }

    public char shift(char c, int x) {
        byte b = (byte) c;
        return (char)Integer.parseInt(String.valueOf(b+x));
    }
}
