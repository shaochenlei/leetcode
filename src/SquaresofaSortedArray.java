import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @Author:Chenlei
 * @Description:
 * @Date:Created in 2021/3/3 22:40
 * @Modified By:
 */
public class SquaresofaSortedArray {
    public static int[] sortedSquares(int[] nums) {
//        int [] result = doublenums(nums);
//        Arrays.sort((nums));
        int left = 0;
        int right = nums.length - 1;
        int[] result = new int[nums.length];
        int inputIndex = right;

        while (left <= right) {
            int leftInt = nums[left] * nums[left];
            int rightInt = nums[right] * nums[right];
            if (leftInt > rightInt) {
                result[inputIndex] = leftInt;
                left++;
                inputIndex--;
            } else {
                result[inputIndex] = rightInt;
                right--;
                inputIndex--;
            }
        }
        return result;
    }
//    public static int[] doublenums(int[] nums){
//        for(int i=0;i<nums.length;i++){
//            nums[i] *= nums[i];
//        }
//        return nums;
//    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};
        int[] result = sortedSquares(nums);
//        System.out.println(Arrays.toString(doublenums(nums)));
        System.out.println(Arrays.toString(result));
    }
}
