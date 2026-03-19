class Solution{
    public int findContentChildren(int[] g, int[] s){
        /*
        Arrays.sort(g);// sort the array
        Arrays.sort(s);

        int cookie = 0; 
        int child =  0;
        while(child < g.length && cookie < s.length){
            if(s[cookie]>=g[child]){
                child++;// if child satisfy then increase by one 
            }
            cookie++;// try another cookies
        }
        return child;
        */
        //Using Two Pointer approach 
        Arrays.sort(g);
        Arrays.sort(s);
        //Initialize the two pointers at child and cookies
        int child = 0;
        int cookies = 0;

        while(child<g.length && cookies<s.length){
            if(s[cookies]>=g[child]){
                child++;
            }
            cookies++;
        }
        return child;
    }
}