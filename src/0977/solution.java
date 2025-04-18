class Solution {
    public int[] sortedSquares(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        
        int[] retArr = new int[nums.length];
        
        int lIndex = 0;
        int rIndex = nums.length - 1;
        int retIndex = nums.length - 1;
        
        while (lIndex <= rIndex) {
            int lVal = nums[lIndex]*nums[lIndex];
            int rVal = nums[rIndex]*nums[rIndex];
        
            if (lVal > rVal) {
                retArr[retIndex] = lVal;
                lIndex++;
            } else {
                retArr[retIndex] = rVal;
                rIndex--;
            }
            retIndex --;
        }
        return retArr;
        
    }
}
