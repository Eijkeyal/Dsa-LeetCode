class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer>result = new ArrayList<>();
        Map<Integer,Integer>countMap = new HashMap<>();
        //count frequencies
        for(int num:nums){
            countMap.put(num,countMap.getOrDefault(num,0)+1);
        }
        //find elements with the frequency>n/3
        for(Map.Entry<Integer,Integer>entry:countMap.entrySet()){
            if(entry.getValue()>n/3){
                result.add(entry.getKey());
            }
        }
        return result;
    }
}