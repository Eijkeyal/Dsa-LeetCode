class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {/*
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
        */
        Arrays.sort(nums1);//Sort the nums1 Array
        Set<Integer> result = new HashSet<>();// use a set to store unique intersection elements 
        //Set data type doesn't allow the duplicates values 
       for(int target:nums2){//for each element in nums2, search in sorted nums1
        int start=0;
        int end = nums1.length - 1;
        //binary search for target in nums1
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums1[mid]==target){//found the target in nums1, add tot he result
                result.add(target);
                break;//exist the bineary search for this target
            }else if (nums1[mid]<target){
                start = mid +1;
            } else {
                end = mid -1;
            }
        }
       }
       //convert set to Array (required return type)
       int arr[] = new int [result.size()];
       int i = 0;
       for(int num:result){
        arr[i++] = num;
       }
       return arr;//return the intersection of array
    }
}