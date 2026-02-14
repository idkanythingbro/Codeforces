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
		String s = in.nextLine();
		String s1 = "1" + s + "1";
		int ans = 0;
		for(int i=1, l=0;i<=n;i++){
			if(s1.charAt(i) == '0'){
				if(s1.charAt(i-1) == '1'){
					l = i;
				}
				if(s1.charAt(i+1) == '1'){
					int c = (l==1?1:0) + (i==n?1:0);
					ans+=(i - l + 1 + c)/3;
				}
			} else {
				ans++;
			}
			
		}		
		out.println(ans);
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
	
	 
