class Solution(object):
    def findDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        #sort the array
        nums.sort()
        #create result list
        result = []
        for i in range(1,len(nums)):
            if nums[i] == nums[i-1]:
                result.append(nums[i])
        return result
        