class Solution {
  public boolean isMonotonic(int[] nums) {
    int i = 0;
    while (i < nums.length - 1) {
      if (nums[i] > nums[i + 1]) {
        return Solution.isDescending(nums);
      } else if (nums[i] < nums[i + 1]) {
        return Solution.isAscending(nums);
      }
      i++;
    }
    return true;
  }

  private static boolean isDescending(int[] nums) {
    int i = 0;

    while (nums[i] >= nums[i + 1]) {
      i++;

      if (i == nums.length - 1) {
        return true;
      }
    }
    return false;
  }

  private static boolean isAscending(int[] nums) {
    int i = 0;
    while (nums[i] <= nums[i + 1]) {
      i++;

      if (i == nums.length - 1) {
        return true;
      }
    }
    return false;
  }
}
