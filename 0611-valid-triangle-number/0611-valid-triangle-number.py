class Solution(object):
    def triangleNumber(self, nums):
        nums.sort()
        n = len(nums)
        count = 0

        for k in range(n - 1, 1, -1):  # fix largest side
            i = 0
            j = k - 1

            while i < j:
                if nums[i] + nums[j] > nums[k]:
                    count += (j - i)  # count all valid pairs
                    j -= 1
                else:
                    i += 1

        return count