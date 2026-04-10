class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #create dictionary to store
        num_dict = {}
        for i, num in enumerate(nums):
            complement = target - num
            #if complement exists in dictionary, return both indices
            if complement in num_dict:
                return[num_dict[complement],i]
            num_dict[num] = i
        return []
