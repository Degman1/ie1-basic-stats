public class MinMaxCalculation {
  public int findMin (int[] nums) {
    int min = nums[0];
    for(int i = 0; i < nums.length()-1; i++) {
      if(nums[i] < min) {
        nums[i] = min;
      }
    }
    return min;
  }
  public int findMax (int[] nums) {
    int max = nums[0];
    for(int i = 0; i < nums.length()-1; i++) {
      if(nums[i] > max) {
        nums[i] = max;
      }
    }
    return max;
  }
}
