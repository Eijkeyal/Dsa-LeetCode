class Solution(object):
    def getMinDistance(self, nums, target, start):
        """
        :type nums: List[int]
        :type target: int
        :type start: int
        :rtype: int
        """
        #using two pointer approach
        left =start #python
        right = start
        while left>=0 or right<len(nums):
            if left>=0 and nums[left] == target:
                return start - left
            if right<len(nums) and nums[right] == target:
                return right-start
            left = left -1
            right = right + 1
        return -1