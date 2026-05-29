class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        //sort the array
        Arrays.sort(tokens);
        int left = 0;
        int right = tokens.length-1;
        int score = 0;
        int maxScore = 0;
        while(left<=right){
            //try face-up use smallest token to gain score
            if(power>=tokens[left]){
                power-= tokens[left];
                score++;
                left++;
                maxScore = Math.max(maxScore, score);
            }else if(score>=1){
                power += tokens[right];
                score--;
                right--;
            }else{
                break;
            }
        }
        return maxScore;
    }
}