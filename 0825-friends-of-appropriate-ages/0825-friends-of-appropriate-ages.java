class Solution {
    public int numFriendRequests(int[] ages) {
        // Count how many people of each age (ages 1-120)
        int[] count = new int[121];
        for (int age : ages) {
            count[age]++;
        }
        
        int requests = 0;
        
        // For each possible sender age a
        for (int a = 1; a <= 120; a++) {
            int countA = count[a];
            if (countA == 0) continue; // No people of this age
            
            // For each possible receiver age b
            for (int b = 1; b <= 120; b++) {
                int countB = count[b];
                if (countB == 0) continue; // No people of this age
                
                // Check if age a can send request to age b
                if (b > 0.5 * a + 7 && b <= a) {
                    // All people of age a can send to all people of age b
                    requests += countA * countB;
                    
                    // Remove self-requests if a == b
                    if (a == b) {
                        requests -= countA;
                    }
                }
            }
        }
        
        return requests;
    }
}