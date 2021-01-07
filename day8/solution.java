/*
1084 / 1084 test cases passed.
Status: Accepted
Runtime: 20 ms
Memory Usage: 39.5 MB
*/
class Solution {
    public int myAtoi(String s) {
        s=s.trim();
		String ans="0";
		int sign=1;
		int start=0;
		if(s.length()==0) {
			return Integer.parseInt(ans);
		}else if(s.indexOf("-")==0){
			sign=-1;
			start=1;
		}else if(s.indexOf("+")==0) {
			start=1;
		}
		for(int i=start;i<s.length();i++) {
			try {
				int check=Integer.parseInt(Character.toString(s.charAt(i)));
				String adder=Character.toString(s.charAt(i));
				ans=ans+adder;
			}catch(Exception e) {
                ans=ans.replaceFirst("^0+(?!$)", "");
                if(ans.length()<10) {
                	return Integer.parseInt(ans)*sign;
                }
                String max = String.valueOf(Integer.MAX_VALUE);
                String min = String.valueOf(Integer.MIN_VALUE);
				if(ans.compareTo(max)>0 || ans.length()>10) {
					if(sign==1)
						return (int) (Math.pow(2, 31)-1);
					else
						return (int) (Math.pow(-2, 31));
				}else if(ans.compareTo(min)<0 || ans.length()>10){
					if(sign==1)
						return (int) (Math.pow(2, 31)-1);
					else
						return (int) (Math.pow(-2, 31));
				}
				return Integer.parseInt(ans)*sign;
			}
		}
        ans=ans.replaceFirst("^0+(?!$)", "");
        if(ans.length()<10) {
        	return Integer.parseInt(ans)*sign;
        }
		String max = String.valueOf(Integer.MAX_VALUE);
		String min = String.valueOf(Integer.MIN_VALUE);
		if(ans.compareTo(max)>0 || ans.length()>10) {
			if(sign==1)
				return (int) (Math.pow(2, 31)-1);
			else
				return (int) (Math.pow(-2, 31));
		}else if(ans.compareTo(min)<0 || ans.length()>10){
			if(sign==1)
				return (int) (Math.pow(2, 31)-1);
			else
				return (int) (Math.pow(-2, 31));
		}
		return Integer.parseInt(ans)*sign;
    }
}
