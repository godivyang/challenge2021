/*
Sub-Task	   Task #	   Result(time)
1	           0	       AC(0.080000)
1	           1	       AC(0.080000)
Subtask Score: 30.00%	Result - AC
2	           2	       AC(0.350000)
2	           3	       AC(0.440000)
2	           4	       WA(0.180000)
2	           5	       AC(0.340000)
2	           6	       AC(0.340000)
2	           7	       WA(0.330000)
Subtask Score: 0.00%	Result - WA
Total Score = 30.00%
*/
public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner scan = new Scanner(System.in);
	    int T = scan.nextInt();
	    ArrayList<Long> answer=new ArrayList<Long>();
	    for(int i=0;i<T;i++){
	        int N = scan.nextInt();
	        int K = scan.nextInt();
	        ArrayList<Integer> H=new ArrayList<Integer>(N);
	        for(int j=0;j<N;j++){
	               H.add(scan.nextInt());
	       }
	       answer.add(wipl(N,K,H));
	    }
	    scan.close();
	    for(int i=0;i<T;i++){
	        System.out.println(answer.get(i));
	    }
	}
	public static long wipl(int a,int b,ArrayList<Integer> array) {
		Collections.sort(array);
		long ans1=0;long ans2=0;
		long ans=-1;
		if(a==1)
			return ans;
		int i=a-1;
		long bro=0;long sis=0;
		while(i>=0) {
			if(bro>=b) {
				if(sis>=b) {
					break;
				}
				sis=sis+array.get(i);
				ans1++;
				i--;
				continue;
			}
			bro+=array.get(i);
			ans1++;
			i--;
		}
		if(bro<b || sis<b) {
			ans1=-1;
		}
		bro=array.get(a-1);sis=array.get(a-2);
		ans2+=2;
		int j=a-3;
		while(j>=0) {
		    if(bro>=b && sis>=b) {
				break;
			}
			if(bro>=b && sis<b) {
				sis+=array.get(j);
				j--;
				ans2++;
				continue;
			}else if(sis>=b && bro<b) {
				bro+=array.get(j);
				j--;
				ans2++;
				continue;
			}
			if(bro>sis) {
				sis+=array.get(j);
				j--;
				ans2++;
				continue;
			}else {
				bro+=array.get(j);
				j--;
				ans2++;
				continue;
			}
		}
		if(bro<b || sis<b) {
			ans2=-1;
		}
		if(ans1==-1 && ans2==-1) {
			ans=-1;
		}else if(ans1==-1) {
			ans=ans2;
		}else if(ans2==-1) {
			ans=ans1;
		}else if(ans1>ans2) {
			ans=ans2;
		}else {
			ans=ans1;
		}
		return ans;
	}
