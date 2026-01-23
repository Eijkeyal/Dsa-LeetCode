class Solution{
    public int findContentChildren(int[] g, int[] s){
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
    }
}