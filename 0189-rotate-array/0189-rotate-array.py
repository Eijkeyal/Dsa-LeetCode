class Solution(object):
    def rotate(self, nums, k):
        n = len(nums)
        k = k % n  # handle k > n

        result = [0] * n  # new array

        # copy last k elements to front
        for i in range(k):
            result[i] = nums[n - k + i]

        # copy first n-k elements after that
        for i in range(n - k):
            result[k + i] = nums[i]

        # copy back to original array
        for i in range(n):
            nums[i] = result[i]