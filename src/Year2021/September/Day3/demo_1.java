package Year2021.September.Day3;

import org.junit.Assert;
import org.junit.Test;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1：
 * <p>
 * 输入：strs = ["flower","flow","flight"]
 * 输出："fl"
 * 示例 2：
 * <p>
 * 输入：strs = ["dog","racecar","car"]
 * 输出：""
 * 解释：输入不存在公共前缀。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/longest-common-prefix
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class demo_1 {
    @Test
    public void run() {
        Assert.assertEquals("fl",longestCommonPrefix(new String[]{"flower","flow","flight"}));
        Assert.assertEquals("",longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    /**
     * 简单解法
     */
    public String longestCommonPrefix(String[] strs) {
        //找到最短的那个字符串
        int minLength = strs[0].length();

        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < minLength) {
                minLength = strs[i].length();
            }
        }

        String res = "";
        //记录相同的次数
        int count = 1;
        for (int i = 0; i < minLength; i++) {
            char tempCh = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if(tempCh == strs[j].charAt(i)){
                    count++;
                }
            }
            if(count == strs.length){
                res += tempCh;
                count = 1;
            }else{
                break;
            }
        }

        return  res;
    }

}
