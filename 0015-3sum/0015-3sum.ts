var threeSum = function(nums) {
    const result = [];

    // Sort numbers in ascending order
    nums.sort((a, b) => a - b);

    const n = nums.length;

    for (let i = 0; i < n - 2; i++) {

        // Skip duplicate first numbers
        if (i > 0 && nums[i] === nums[i - 1]) {
            continue;
        }

        // Since the array is sorted, no possible triplet can sum to 0
        if (nums[i] > 0) {
            break;
        }

        let left = i + 1;
        let right = n - 1;

        while (left < right) {
            const sum = nums[i] + nums[left] + nums[right];

            if (sum === 0) {
                result.push([
                    nums[i],
                    nums[left],
                    nums[right]
                ]);

                // Move both pointers
                left++;
                right--;

                // Skip duplicates
                while (
                    left < right &&
                    nums[left] === nums[left - 1]
                ) {
                    left++;
                }

                while (
                    left < right &&
                    nums[right] === nums[right + 1]
                ) {
                    right--;
                }

            } else if (sum < 0) {
                // Need a bigger sum
                left++;
            } else {
                // Need a smaller sum
                right--;
            }
        }
    }

    return result;
};