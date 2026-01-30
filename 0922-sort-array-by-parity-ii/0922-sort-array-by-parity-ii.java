/*class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-i-1;j++){
                if(((j%2==0) && (nums[j]%2==1))|| 
                ((j%2==1) && (nums[j]%2==0))){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1]=temp;
                }
            }
        }
        return nums;
    }
}
*/
class Solution{
    public int [] sortArrayByParityII(int [] nums){
        int even = 0;// Pointer for even positive
        int odd = 1;// Pointer for odd Positive
        while(even<nums.length && odd<nums.length){
            //find even index with even number
            while(even<nums.length && nums[even]%2==0){
                even = even +2;
            }
            //find odd index with even number
            while(odd<nums.length && nums[odd]%2==1){
                odd = odd +2;
            }
            // Swap if both found
            if(even<nums.length && odd<nums.length){
                int temp = nums[even];
                nums[even] = nums[odd];
                nums[odd] = temp;
            }

        }
        return nums;
    }
}