package Year2021.September.Day3;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "()"
 * 输出：true
 * 示例 2：
 * <p>
 * 输入：s = "()[]{}"
 * 输出：true
 * 示例 3：
 * <p>
 * 输入：s = "(]"
 * 输出：false
 * 示例 4：
 * <p>
 * 输入：s = "([)]"
 * 输出：false
 * 示例 5：
 * <p>
 * 输入：s = "{[]}"
 * 输出：true
 *  
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parentheses
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class demo_2 {
    @Test
    public void run() {
        Assert.assertTrue(isValid("()"));
        Assert.assertTrue(isValid("()[]{}"));
        Assert.assertTrue(isValid("{[]}"));
        Assert.assertFalse(isValid("(]"));
        Assert.assertFalse(isValid("([)]"));
    }

    public boolean isValid(String s) {
        List<Character> resList = new LinkedList<Character>();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            resList.add(index,s.charAt(i));
            if (index > 0) {
                if (resList.get(index - 1) == '(' && resList.get(index) == ')') {
                    resList.remove(index);
                    resList.remove(index - 1);
                    index--;
                } else if (resList.get(index - 1) == '[' && resList.get(index) == ']') {
                    resList.remove(index);
                    resList.remove(index - 1);
                    index--;
                } else if (resList.get(index - 1) == '{' && resList.get(index) == '}') {
                    resList.remove(index);
                    resList.remove(index - 1);
                    index--;
                } else {
                    index++;
                }
            } else {
                index++;
            }
        }

        return index == 0 ? true : false;
    }
}
