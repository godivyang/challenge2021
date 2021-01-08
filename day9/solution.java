/*
11510 / 11510 test cases passed.
Status: Accepted
Runtime: 12 ms
Memory Usage: 41.3 MB
*/
class Solution {
    public boolean isPalindrome(int x) {
        long ans=0;
        int check=x;
        if(x<0)
            return false;
        while(x!=0){
            ans=ans*10+x%10;
            x=x/10;
        }
        if(check==ans)
            return true;
        return false;
    }
}
