/**
 * @Author:Chenlei
 * @Description: 求最大连续1，方法是遍历数组，如果是1，计数器+1，如果是0，计数器置零，每次更新结果max
 * @Date:Created in 2021/3/3 22:13
 * @Modified By:
 */
public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max=0;
        int count=0;
        for(int num:nums){
            if(num == 1){
                count++;
            } else {
                count = 0;
            }
            max = Math.max(max,count);
        }
        return max;
    }

    public static void main(String[] args) {
        int [] nums = {1,1,0,1,1,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
