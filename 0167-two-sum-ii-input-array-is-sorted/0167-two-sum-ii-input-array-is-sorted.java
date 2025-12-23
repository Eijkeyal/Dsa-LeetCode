class Solution {
    public int[] twoSum(int[] numbers, int target) {

        for (int start = 0; start < numbers.length; start++) {

            int end = numbers.length - 1;
            int left = start + 1;

            while (left <= end) {
                int mid = left + (end - left) / 2;
                int sum = numbers[start] + numbers[mid];

                if (sum == target) {
                    return new int[]{start + 1, mid + 1}; // 1-based index
                } 
                else if (sum > target) {
                    end = mid - 1;
                } 
                else {
                    left = mid + 1;
                }
            }
        }

        return new int[]{-1, -1};
    }
}
