public class FindNumbersWithEvenNumberOfDigits {
    /**
     * Find Numbers with Even Number of Digits
     * @param nums
     * @return
     */
    public static int findNumbers(int[] nums){
        int evenCount=0;
        int digit=0;
        for(int num:nums){
            while(num!=0) {
                num = num / 10;
                digit++;
            }
            if(digit%2==0){
                evenCount++;
            }
            digit=0;
        }
        return evenCount;
    }
    public static void main(String[] args) {
        int [] nums ={555,901,482,1771};
        System.out.println(findNumbers(nums));
    }
}
