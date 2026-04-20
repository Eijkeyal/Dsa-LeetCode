class Solution(object):
    def reverseOnlyLetters(self, s):
        # convert string to list (since strings are immutable in Python)
        arr = list(s)

        left = 0
        right = len(arr) - 1

        while left < right:
            # skip non-letters from left
            while left < right and not arr[left].isalpha():
                left += 1

            # skip non-letters from right
            while left < right and not arr[right].isalpha():
                right -= 1

            # swap letters
            arr[left], arr[right] = arr[right], arr[left]

            left += 1
            right -= 1

        return "".join(arr)