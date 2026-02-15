import java.io.*;
import java.util.*;
public class Main{
	public static void main(String args[]) throws Exception {
		FastReader in = new FastReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t = in.nextInt();
		while(t-- > 0){
			solve(in, out);
		}
		out.close();
	}
	static void solve(FastReader in, PrintWriter out) {
		int n = in.nextInt();
		HashSet<Integer> set = new HashSet<>();
		for(int i=0;i<n;i++){
			set.add(in.nextInt());
		}		
		int longestStreak = 0;
		for(int num : set){
			if(!set.contains(num-1)){
				int curr = num;
				int currStreak = 1;
				while(set.contains(curr+1)){
					curr++;
					currStreak++;
				}
				longestStreak = Math.max(longestStreak, currStreak);
			}
		}
		out.println(longestStreak);
		
	}


	static class FastReader{
		BufferedReader br;
		StringTokenizer st;
		
		public FastReader(InputStream is){
			br = new BufferedReader(new InputStreamReader(is));
		}
		
		String next(){
			while(st == null || !st.hasMoreElements()){
				try{
					st = new StringTokenizer(br.readLine());
				} catch (IOException e){
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() { return Integer.parseInt(next()); }
		long nextLong() { return Long.parseLong(next()); }
		float nextFloat() { return Float.parseFloat(next()); }
		double nextDouble() { return Double.parseDouble(next()); }
		
		String nextLine(){
			String str = "";
			try {
				str = br.readLine();
			} catch (IOException e){
				e.printStackTrace();
			}
			return str;
		}
	}
}
	
	 
