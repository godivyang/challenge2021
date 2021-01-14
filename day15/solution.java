/*
123 / 123 test cases passed.
Status: Accepted
Runtime: 8 ms
Memory Usage: 38.9 MB
*/
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans="";
        if(strs.length==0) return ans;
        int itr=strs[0].length();
        for(int i=0;i<strs.length;i++) {
        	if(strs[i].length()==0) return ans;
        	if(strs[i].length()<itr) itr=strs[i].length();
        }
        int i=0;
        while(i<itr) {
        	char check=strs[0].charAt(i);
        	for(int j=1;j<strs.length;j++) {
        		if(check==strs[j].charAt(i)) {
            		continue;
            	}else return ans;
        	}
        	ans=ans+check;
    		i++;
        }
		return ans;
    }
}
