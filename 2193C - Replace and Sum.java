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
        int q = in.nextInt();
        
        long[] a = new long[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            int val = in.nextInt();
            if (val > a[i]) {
                a[i] = val;
            }
        }
        long currentMax = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] > currentMax) {
                currentMax = a[i];
            } else {
                a[i] = currentMax;
            }
        }
        
        long[] prefixSum = new long[n + 1];
        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + a[i];
        }
        for (int i = 0; i < q; i++) {
            int l = in.nextInt();
            int r = in.nextInt();
            out.print((prefixSum[r] - prefixSum[l - 1]) + " ");
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
	
	 
