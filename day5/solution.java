/*
176 / 176 test cases passed.
Status: Accepted
Runtime: 515 ms
Memory Usage: 41.7 MB
*/
class Solution {
    public String longestPalindrome(String s) {
        String answer=new String();
		String checker=new String();
		if(s.length()==1) {
			return s;
		}else if(s.length()==2){
			if(s.charAt(0)==s.charAt(1))
				return s;
			else {
				return Character.toString(s.charAt(0));
			}
		}
		for(int i=1;i<s.length()-1;i++) {
			if(s.charAt(i-1)==s.charAt(i+1)) {
				checker=Character.toString(s.charAt(i-1))+Character.toString(s.charAt(i))+Character.toString(s.charAt(i+1));
				int itr=2;
				while(true) {
					if(i+itr>s.length()-1 || i-itr<0)
						break;
					if(s.charAt(i-itr)==s.charAt(i+itr)) {
						checker=Character.toString(s.charAt(i-itr))+checker+Character.toString(s.charAt(i+itr));
						itr++;
						continue;
					}else {
						break;
					}
				}
				if(checker.length()>answer.length()) {
					answer=checker;
					checker=new String();
				}else {
					checker=new String();
				}
			}
			if(s.charAt(i)==s.charAt(i+1)) {
				checker=Character.toString(s.charAt(i))+Character.toString(s.charAt(i));
				int itr=2;
				while(true) {
					if(i+itr>s.length()-1 || i-itr+1<0)
						break;
					if(s.charAt(i-itr+1)==s.charAt(i+itr)) {
						checker=Character.toString(s.charAt(i-itr+1))+checker+Character.toString(s.charAt(i+itr));
						itr++;
						continue;
					}else {
						break;
					}
				}
				if(checker.length()>answer.length()) {
					answer=checker;
					checker=new String();
				}else {
					checker=new String();
				}
			}
		}
		if(answer.length()==0) {
			if(s.charAt(0)==s.charAt(1))
				answer=Character.toString(s.charAt(0))+Character.toString(s.charAt(0));
			else
				answer=Character.toString(s.charAt(0));
		}
		return answer;
    }
}
