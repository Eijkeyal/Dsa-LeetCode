/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        //This is the revision of the problem 278. First Bad Version
       int start = 1;//It started From 1
       int end = n;// Goes till the end
       while(start<end){
        int mid = start + (end - start)/2;
        if(isBadVersion(mid)){//it checks the mid with the isBadVersion API if it found false then it increses mid +1 and start will become 4 by adding 3+1
            end = mid; // and return the value of mid
        } else {
            start = mid +1;// otherwise it added every iteration with one increses
        }
       } 
       return start;
    }
}