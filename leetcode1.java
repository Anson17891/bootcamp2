
import java.util.Arrays;

class leetcode1 {
    public static int[] twoSum(int[] nums, int target) {
       int[] arr = new int[2];
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1;j< nums.length ;j++){
               if((nums[i]+nums[j])==target){
                arr[0] = nums[i];
                arr[1] = nums[j];
                return arr;
              }
        }
      }arr[0] = -1;
      arr[1] = -1;
      return arr;
    }
  

  public static void main(String[] args) {
    int[] nums = {1,2,3};
    System.out.println(Arrays.toString(twoSum(nums,6)));
  }
}
