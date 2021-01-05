/*
1157 / 1157 test cases passed.
Status: Accepted
Runtime: 14 ms
Memory Usage: 40.3 MB
*/
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)
			return s;
        ArrayList<String> sample=new ArrayList<String>();
		String progress="front";
		for(int i=0;i<numRows;i++)
			sample.add("");
		int itr=1;
		int pos=0;
		String ans=new String();
		while(true) {
			if(itr==s.length()) {
				sample.set(pos,sample.get(pos)+s.charAt(itr-1));
				break;
			}else {
				sample.set(pos,sample.get(pos)+s.charAt(itr-1));
				if(progress=="front") {
					pos++;
					if(pos==numRows) {
						pos-=2;
						progress="back";
					}
				}else if(progress=="back") {
					pos--;
					if(pos<0) {
						pos+=2;
						progress="front";
					}
				}
				itr++;
			}
		}
		for(int i=0;i<numRows;i++) {
			ans=ans+sample.get(i);
		}
		return ans;
    }
}
