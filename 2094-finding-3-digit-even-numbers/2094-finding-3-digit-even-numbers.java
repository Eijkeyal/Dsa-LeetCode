class Solution {
    public int[] findEvenNumbers(int[] digits) {
        //to find the 3 digit Even numbers is quite tricky so then i used Set collections because it removes the or eliminates the duplications
        Set<Integer> resultSet = new HashSet<>();
        int n = digits.length;
        //we had to take 3 digits so we need to use three iterations
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n;j++){
                for(int k = 0; k<n; k++){
                    // Must use different indices
                    if(i ==j || i == k || j == k) continue;
                    int first = digits[i];// first digit
                    int second = digits[j];//for second digit
                    int third = digits[k];//for third digit
                    // this steps makes sure that there is no 0 digits at starting 
                    if(first == 0) continue;
                    //Also this steps indicates the there is no odd digits can placed this means in second digit can have all digit like odd,even and een zero
                    if(third%2!=0) continue;
                    // This line forms a 3-digit number from three separate digits
                   // Example: if first=3, second=2, third=1 → 3*100 + 2*10 + 1 = 300 + 20 + 1 = 321
                    int number = first * 100 + second * 10 + third;
                    resultSet.add(number);
                }
            }
        }

        // Convert to sorted array
        int result[] = new int[resultSet.size()];
        int index = 0;
        for(int num : resultSet){
            result[index++] = num;
        } 
        Arrays.sort(result);
        return result;
    }
}
