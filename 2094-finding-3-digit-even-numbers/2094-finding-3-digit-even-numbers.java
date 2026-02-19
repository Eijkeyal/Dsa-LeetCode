class Solution {
    public int[] findEvenNumbers(int[] digits) {
        Set<Integer> resultSet = new HashSet<>();
        int n = digits.length;
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n;j++){
                for(int k = 0; k<n; k++){
                    if(i ==j || i == k || j == k) continue;
                    int first = digits[i];
                    int second = digits[j];
                    int third = digits[k];
                    if(first == 0) continue;
                    if(third%2!=0) continue;
                    int number = first * 100 + second * 10 + third;
                    resultSet.add(number);
                }
            }
        }
        int result[] = new int[resultSet.size()];
        int index = 0;
        for(int num : resultSet){
            result[index++] = num;
        } 
        Arrays.sort(result);
        return result;
    }
}