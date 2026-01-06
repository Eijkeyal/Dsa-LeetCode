class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        //for each element in arr1
        for(int i = 0;i<arr1.length;i++){
            boolean check = true;
            //check against all element in arr2
            for(int j = 0;j<arr2.length;j++){
                // if distance <=d  it wiii be invalid
                if(Math.abs(arr1[i]-arr2[j])<=d){
                    check = false;
                    break;// no need to check further
                }
            }
            if(check){
               count++;
            }
        }
        return count;
    }
}