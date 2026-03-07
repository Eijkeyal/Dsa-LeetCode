class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        //Steps 1: Sort the Array
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        //Steps 2: Find the minimum differences
        int minDiff = Integer.MAX_VALUE;
        for(int i = 0; i <arr.length-1; i++){
            int diff = arr[i+1] - arr[i];
            minDiff = Math.min(minDiff,diff);
        }
        //Steps 3: Find all pairs with that minimum differences
        for(int i = 0; i<arr.length -1; i++){
            if(arr[i+1] - arr[i]==minDiff){
                result.add(Arrays.asList(arr[i],arr[i+1]));
            }
        }
        return result;
    }
}