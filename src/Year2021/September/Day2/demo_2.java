package Year2021.September.Day2;

import org.junit.Assert;
import org.junit.Test;

/**
 * 罗马数字包含以下七种字符: I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。
 * 数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。
 * 这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。 
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/roman-to-integer
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class demo_2 {

    @Test
    public void run(){
        Assert.assertEquals(3,romanToInt("III"));
        Assert.assertEquals(4,romanToInt("IV"));
        Assert.assertEquals(9,romanToInt("IX"));
        Assert.assertEquals(58,romanToInt("LVIII"));
        Assert.assertEquals(1994,romanToInt("MCMXCIV"));
    }

    /**
     * 简单解法
     * 分离出每个字符，依次比较
     * @param s
     * @return
     */
    public int romanToInt(String s) {
        char[] roNum = s.toUpperCase().toCharArray();

        int res = 0;
        for (int i = 0; i < roNum.length; i++) {
            switch (roNum[i]){
                case 'I':
                    //V (5) 和 X (10)
                    if(i < roNum.length - 1){
                        if(roNum[i+1] == 'V' || roNum[i+1] == 'X'){
                            res -= 1;
                            if(roNum[i+1] == 'V'){
                                res += 5;
                            }else if(roNum[i+1] == 'X'){
                                res += 10;
                            }
                            i++;
                            break;
                        }
                    }
                    res += 1;
                    break;
                case 'V':
                    res += 5;
                    break;
                case 'X':
                    //X 可以放在 L (50) 和 C (100)
                    if(i < roNum.length - 1){
                        if(roNum[i+1] == 'L' || roNum[i+1] == 'C'){
                            res -= 10;
                            if(roNum[i+1] == 'L'){
                                res += 50;
                            }else if(roNum[i+1] == 'C'){
                                res += 100;
                            }
                            i++;
                            break;
                        }
                    }
                    res += 10;
                    break;
                case 'L':
                    res += 50;
                    break;
                case 'C':
                    //C 可以放在 D (500) 和 M (1000)
                    if(i < roNum.length - 1){
                        if(roNum[i+1] == 'D' || roNum[i+1] == 'M'){
                            res -= 100;
                            if(roNum[i+1] == 'D'){
                                res += 500;
                            }else if(roNum[i+1] == 'M'){
                                res += 1000;
                            }
                            i++;
                            break;
                        }
                    }
                    res += 100;
                    break;
                case 'D':
                    res += 500;
                    break;
                case 'M':
                    res += 1000;
                    break;
            }
        }
        return res;
    }
}
