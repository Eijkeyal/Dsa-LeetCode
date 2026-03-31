class Solution {
    public int romanToInt(String s) {
       //Map each Roman Character to its value
       int values[] = new int[256];
       values['I'] = 1;
       values['V'] = 5;
       values['X'] = 10;
       values['L'] = 50;
       values['C'] = 100;
       values['D'] = 500;
       values['M'] = 1000;
       int result = 0;
       for(int i = 0;i<s.length();i++){
        int current = values[s.charAt(i)];
        int next = 0;
        //check if there is a next character
        if(i+1<s.length()){
            next = values[s.charAt(i+1)];
        }
        if(current<next){
            result = result -current;
        }else{
            result = result + current;
        }
     } 
     return result;
    }
}