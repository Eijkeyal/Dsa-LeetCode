class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // using hashSet to store results in hashset for uniqueness
        HashSet<Integer> resultSet = new HashSet<>();
        // find common elements
        for(int i = 0;i<nums1.length;i++){
            for(int j = 0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    resultSet.add(nums1[i]);//it adds to the set
                }
            }
        }
        // convert hashset to array
        int[] result = new int [resultSet.size()];
        int index = 0;
        for(int num:resultSet){
            result[index++] = num;
        }
        return result;
    }
}