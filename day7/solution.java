/*
1032 / 1032 test cases passed.
Status: Accepted
Runtime: 11 ms
Memory Usage: 37.3 MB
*/
class Solution {
    public int reverse(int x) {
        String s=Integer.toString(x);
        boolean check=false;
        if(x<0){
            s=Integer.toString(-1*x);
            check=true;
        }
        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans=ans+s.charAt(i);
        }
        try {
            if(check){
                return Integer.parseInt("-"+ans);
            }
        	return Integer.parseInt(ans);
        }catch(Exception e) {
        	return 0;
        }
    }
}
