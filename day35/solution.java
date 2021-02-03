/*
25 / 25 test cases passed.
Status: Accepted
Runtime: 1 ms
Memory Usage: 37.9 MB
*/
class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<String>();
    	char[] c = digits.toCharArray();
    	if (c.length == 0)
    		return ans;

    	HashMap <Integer, String[]> m = new HashMap <Integer, String[]> ();
    	m.put(2, new String[] {"a","b","c"});
    	m.put(3, new String[] {"d","e","f"});
    	m.put(4, new String[] {"g","h","i"});
    	m.put(5, new String[] {"j","k","l"});
    	m.put(6, new String[] {"m","n","o"});
    	m.put(7, new String[] {"p","q","r","s"});
    	m.put(8, new String[] {"t","u","v"});
    	m.put(9, new String[] {"w","x","y","z"});

    	if (c.length == 1) {
    		int index = Integer.parseInt(Character.toString(c[0]));
    		for(String i : m.get(index)) {
    			ans.add(i);
    		}
    		return ans;
    	}

    	if (c.length == 2) {
    		int index1 = Integer.parseInt(Character.toString(c[0]));
    		int index2 = Integer.parseInt(Character.toString(c[1]));
    		String adder = "";
    		for(String i : m.get(index1)) {
    			for(String j : m.get(index2)) {
    				adder = i+j;
    				ans.add(adder);
    			}
    		}
    		return ans;
    	}

    	if (c.length == 3) {
    		int index1 = Integer.parseInt(Character.toString(c[0]));
    		int index2 = Integer.parseInt(Character.toString(c[1]));
    		int index3 = Integer.parseInt(Character.toString(c[2]));
    		String adder = "";
    		List<String> ans1 = new ArrayList<String>();
    		for(String i : m.get(index1)) {
    			for(String j : m.get(index2)) {
    				adder = i+j;
    				ans1.add(adder);
    			}
    		}
    		for(String i : m.get(index3)) {
    			for(String j : ans1) {
    				adder = j+i;
    				ans.add(adder);
    			}
    		}
    		return ans;
    	}

    	if (c.length == 4) {
    		int index1 = Integer.parseInt(Character.toString(c[0]));
    		int index2 = Integer.parseInt(Character.toString(c[1]));
    		int index3 = Integer.parseInt(Character.toString(c[2]));
    		int index4 = Integer.parseInt(Character.toString(c[3]));
    		String adder = "";
    		List<String> ans1 = new ArrayList<String>();
    		List<String> ans2 = new ArrayList<String>();
    		for(String i : m.get(index1)) {
    			for(String j : m.get(index2)) {
    				adder = i+j;
    				ans1.add(adder);
    			}
    		}
    		for(String i : m.get(index3)) {
    			for(String j : m.get(index4)) {
    				adder = i+j;
    				ans2.add(adder);
    			}
    		}
    		for(String i : ans1) {
    			for(String j : ans2) {
    				adder = i+j;
    				ans.add(adder);
    			}
    		}
    		return ans;
    	}

		return null;
    }
}
