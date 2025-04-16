class Solution:

    def calculate_median(nums) -> float:
        """Assumes the list is sorted"""
        index = len(nums) // 2
        if len(nums) % 2 == 0:
            return (nums[index-1] + nums[index]) / 2
        else:
            return nums[index]


    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        new_list = (nums1 + nums2)
        new_list.sort()

        return Solution.calculate_median(new_list)

        
    

