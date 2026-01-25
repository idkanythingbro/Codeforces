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

	static void solve(FastReader in, PrintWriter out){
		int n = in.nextInt();
		int[] ans = new int[n+1];
		ans[n] = 1;
		if((n & (n - 1)) == 0){
			out.println(-1);
			return;
		} 
		
		for(int i=2;i<n;i++){
			ans[i] = i ^ 1;
		}	
		if(n%2 == 0){
			int idx = n ^ (1 << (31 - Integer.numberOfLeadingZeros(n)));
			ans[1] = ans[idx];
			ans[idx] = n;
		} else {
			ans[1] = n-1;
		}
		for(int i=1;i<=n;i++){
			out.print(ans[i] + " ");
		}
		out.println();
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
	
	 
