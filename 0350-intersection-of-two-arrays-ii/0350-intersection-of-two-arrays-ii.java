/*class Solution{
    public int [] intersect (int nums1[], int nums2[]){
        //sort the arrays
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //use ArrayList because we dont the size of array so 
        List<Integer> result = new ArrayList<>();
        int index[] = new int[nums1.length];// to track the next available position for each value 
        for(int target : nums2){
            int start = 0;
            int end = nums1.length-1;
            int foundIndex = -1;
            while(start<=end){
                int mid = start + (end - start)/2;
                if(nums1[mid]==target){
                    if(mid >= index[target]){
                        foundIndex = mid;
                        break;
                    }else{
                        start = mid +1;
                    }
                }else if(nums1[mid]<target){
                    start = mid +1;
                }else{
                    end = mid -1;
                }
            }
            if(foundIndex != -1){
                result.add(target);
                index[target]=foundIndex + 1;
            }
        }
        int arr[] = new int[result.size()];
        for(int i = 0;i<result.size();i++){
            arr[i] = result.get(i);
        }
        return arr;
    }
}
*/
//Using Two Pointers Approach
class Solution{
    public int [] intersect (int nums1[], int nums2[]){
        //Sort the Array
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        //Initialize the Array
        int i = 0;
        int j = 0;
        //Create a ArrayList
        ArrayList<Integer> result = new ArrayList<>();
        while(i<nums1.length && j<nums2.length){//Check the condutions
            if(nums1[i]==nums2[j]){
                result.add(nums1[i]);//If found equals then add to the arraylist and move pointer both i and j
                i++;
                j++;
            }else if(nums1[i]<nums2[j]){// if one is greater and other is samller then increase the smaller one
                i++;
            }else{//same as above conditins
                j++;
            }
        }//ectract the array from arraylistx
        int array[] = new int[result.size()];
        for(i=0;i<result.size();i++){
            array[i] = result.get(i);
        }
        return array;
    }
}