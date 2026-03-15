/*(class Solution {
    public void reverseString(char[] s) {
        char reversed[] = new char[s.length];
        for(int i=0;i<s.length;i++){
            reversed[i] = s[s.length-1-i];// it rreversed the array
        }
        for(int i=0;i<s.length;i++){// this iterations replaces the reversed with original one
            s[i] = reversed[i];
        }
    }
}*/
class Solution{
    public void reverseString(char[] s){
        //Step1 : Initialize two pointer
        int i = 0;
        int j = s.length-1;
        //Step2 : Check conditions
        while(i<j){
            //Steps3: Swap the character
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            //Increase the i pointer by 1 and descrease the j pointer by 1
            i++;
            j--;
        }
    }
}