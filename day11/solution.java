/*
3999 / 3999 test cases passed.
Status: Accepted
Runtime: 22 ms
Memory Usage: 45.2 MB
*/
class Solution {
    public String intToRoman(int num) {
        int m=1;
		String ans="";
        ArrayList<Integer> x=new ArrayList<Integer>();
        while(num!=0) {
        	x.add(num%10 * m);
        	m*=10;
        	num=num/10;
        }
        Collections.reverse(x);
        for(int i:x) {
        	if(i==0) {
        		continue;
        	}
        	int f=Integer.parseInt(Integer.toString(i).substring(0, 1));
        	int a=i/f;
        	if(f==4 || f==9) {
        		ans=ans+intToRomanHelp(a)+intToRomanHelp(i/f+i);
        	}else if(f==5 || f==1) {
        		ans=ans+intToRomanHelp(i);
        	}else if(i<10){
        		if(i<5) {
        			while(i>0) {
        				ans=ans+intToRomanHelp(a);
        				i--;
        			}
        		}else {
        			ans=ans+intToRomanHelp(5*a);
        			while(i-5>0) {
        				ans=ans+intToRomanHelp(a);
        				i--;
        			}
        		}
        	}else {
        		if(f<5) {
        			while(f>0) {
        				ans=ans+intToRomanHelp(a);
        				f--;
        			}
        		}else {
        			ans=ans+intToRomanHelp(5*a);
        			while(f-5>0) {
        				ans=ans+intToRomanHelp(a);
        				f--;
        			}
        		}
        	}
        }
        return ans;
    }
    public String intToRomanHelp(int num) {
		if(num==1) {
        	return "I";
        }else if(num==5) {
        	return "V";
        }else if(num==10) {
        	return "X";
        }else if(num==50) {
        	return "L";
        }else if(num==100) {
        	return "C";
        }else if(num==500) {
        	return "D";
        }else if(num==1000) {
        	return "M";
        }
		return null;
	}
}
