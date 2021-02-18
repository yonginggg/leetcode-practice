//给定一个大小为 n 的整数数组，找出其中所有出现超过 ⌊ n/3 ⌋ 次的元素。 
//
// 进阶：尝试设计时间复杂度为 O(n)、空间复杂度为 O(1)的算法解决此问题。 
//
// 
//
// 示例 1： 
//
// 
//输入：[3,2,3]
//输出：[3] 
//
// 示例 2： 
//
// 
//输入：nums = [1]
//输出：[1]
// 
//
// 示例 3： 
//
// 
//输入：[1,1,1,3,3,2,2,2]
//输出：[1,2] 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 5 * 104 
// -109 <= nums[i] <= 109 
// 
// Related Topics 数组 
// 👍 328 👎 0

package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//java:求众数 II
public class P229MajorityElementIi{
    public static void main(String[] args){
        Solution solution = new P229MajorityElementIi().new Solution();
    }
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Map<Integer,Integer> counts = countNums(nums);
        int len = nums.length/3;
        List<Integer> majority = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: counts.entrySet()){
            if(entry.getValue()>len){
                majority.add(entry.getKey());
            }
        }
        return majority;
    }

    private Map<Integer,Integer> countNums(int[] nums){
        Map<Integer,Integer> counts = new HashMap<Integer, Integer>();
        for(int num: nums){
            if(!counts.containsKey(num)){
                counts.put(num,1);
            }else{
                counts.put(num,counts.get(num)+1);
            }
        }
        return counts;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
