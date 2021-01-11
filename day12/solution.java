/*
3999 / 3999 test cases passed.
Status: Accepted
Runtime: 13 ms
Memory Usage: 43.9 MB
*/
class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> m=new HashMap<Character,Integer>();
		m.put('I', 1);
		m.put('V', 5);
		m.put('X', 10);
		m.put('L', 50);
		m.put('C', 100);
		m.put('D',500);
		m.put('M', 1000);
		m.put(' ', 0);
		int ans=0;
		int adder=m.get(s.charAt(s.length()-1));
		int i=s.length()-1;
		while(i>=0) {
			if(adder>m.get(s.charAt(i))) {
				ans-=m.get(s.charAt(i));
				adder=m.get(s.charAt(i));
				i--;
			}else if(adder<m.get(s.charAt(i))){
				ans+=m.get(s.charAt(i));
				adder=m.get(s.charAt(i));
				i--;
			}else{
                ans+=m.get(s.charAt(i));
				i--;
            }
		}
		return ans;
    }
}
