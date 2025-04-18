class Solution {
    public int[] twoSum(int[] nums, int target) {
        int maxlength = nums.length;
        int[] retVal = new int[2];
        for (int i = 0; i < maxlength; i++) {
            for (int j = i+1; j < maxlength; j++) {
                if (target == (nums[i] + nums[j]) && i != j) {
                    retVal[0] = i;
                    retVal[1] = j;
                    break;
                }
            }
        }
        return retVal;
    }
}
