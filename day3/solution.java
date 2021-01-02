/*
987 / 987 test cases passed.
Status: Accepted
Runtime: 5 ms
Memory Usage: 39.1 MB
*/
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length()<2) {
			return s.length();
		}
		int ans=0;
		int checker=0;
		char[] a=s.toCharArray();
		ArrayList<Character> answer=new ArrayList<Character>();
		for(char i:a) {
			if(answer.size()<1) {
				answer.add(i);
				checker++;
				continue;
			}
			if(answer.contains(i)) {
				int len=answer.size();
				if(ans<checker)
					ans=checker;
				while(true) {
					if(answer.get(0)!=i) {
						answer.remove(0);
						continue;
					}else {
						answer.remove(0);
						break;
					}
				}
				answer.add(i);
				checker=answer.size();
				continue;
			}else {
				checker++;
				answer.add(i);
				continue;
			}
		}
		if(ans>=checker)
			return ans;
		else
			return checker;
    }
}
