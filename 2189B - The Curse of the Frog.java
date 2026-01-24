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
		long x = in.nextLong();
		
		long baseDist = 0;
		long maxS = Long.MIN_VALUE;
		for(int i=0;i<n;i++){
			long a = in.nextLong();
			long b = in.nextLong();
			long c = in.nextLong();
			
			baseDist += a * (b-1);
			
			long s = a * b - c;
			if(s > maxS){
				maxS = s;
			}
		}
		
		if(baseDist >= x){
			out.println(0);
		} else {
			if(maxS <= 0){
				out.println(-1);
			} else {
				long needed = x - baseDist;
				long rollbacks = (needed + maxS - 1) / maxS;
				out.println(rollbacks);
			}
		}
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
	
	 
