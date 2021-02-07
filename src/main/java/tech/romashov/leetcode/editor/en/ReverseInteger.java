//Given a signed 32-bit integer x, return x with its digits reversed. If reversi
//ng x causes the value to go outside the signed 32-bit integer range [-231, 231 -
// 1], then return 0. 
//
// Assume the environment does not allow you to store 64-bit integers (signed or
// unsigned). 
//
// 
// Example 1: 
// Input: x = 123
//Output: 321
// Example 2: 
// Input: x = -123
//Output: -321
// Example 3: 
// Input: x = 120
//Output: 21
// Example 4: 
// Input: x = 0
//Output: 0
// 
// 
// Constraints: 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics Math 
// 👍 4300 👎 6634


package tech.romashov.leetcode.editor.en;

public class ReverseInteger {
    public static void main(String[] args) {
        Solution solution = new ReverseInteger().new Solution();
        int result = solution.reverse(1534236469);
    }

    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        try {
            int digit = x > 0 ? 1 : -1;
            x = digit * x;
            String originString = String.valueOf(x);
            String resultString = "";
            for (int i = originString.length() - 1; i >= 0; i--) {
                resultString += String.valueOf(originString.charAt(i));
            }
            return Integer.parseInt(resultString) * digit;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
