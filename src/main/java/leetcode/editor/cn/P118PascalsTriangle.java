//给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。 
//
// 
//
// 在杨辉三角中，每个数是它左上方和右上方的数的和。 
//
// 示例: 
//
// 输入: 5
//输出:
//[
//     [1],
//    [1,1],
//   [1,2,1],
//  [1,3,3,1],
// [1,4,6,4,1]
//] 
// Related Topics 数组 
// 👍 448 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

//java:杨辉三角
public class P118PascalsTriangle{
    public static void main(String[] args){
        Solution solution = new P118PascalsTriangle().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public List<List<Integer>> generate(int numRows) {
            List<List<Integer>> trigle = new ArrayList<List<Integer>>();
            for (int i = 0; i < numRows; i++) {
                List<Integer> row = new ArrayList<Integer>();
                for(int j=0; j<=i; j++){
                    if(j==0||j==i){
                        row.add(1);
                    }else{
                        row.add(trigle.get(i-1).get(j-1)+trigle.get(i-1).get(j));
                    }
                }
                trigle.add(row);
            }
            return trigle;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
