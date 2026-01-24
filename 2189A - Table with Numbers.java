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
		int h = in.nextInt();
		int l = in.nextInt();

		int countRowOnly = 0;
		int countColOnly = 0;
		int countBoth = 0;
		for(int i=0;i<n;i++){
			int a = in.nextInt();
			boolean isValidRow = a <= h;
			boolean isValidCol = a <= l;
			if(isValidRow && isValidCol){
				countBoth++;
			} else if(isValidRow){
				countRowOnly++;
			} else if(isValidCol){
				countColOnly++;
			}
		}
		int maxPairs = 0;
		int perfectMatches = Math.min(countColOnly, countRowOnly);
		maxPairs += perfectMatches;
		countRowOnly -= perfectMatches;
		countColOnly -= perfectMatches;
		if(countRowOnly > 0){
			int taken = Math.min(countRowOnly, countBoth);
			maxPairs += taken;
			countBoth -= taken;
		} else if(countColOnly > 0){
			int taken = Math.min(countColOnly, countBoth);
			maxPairs += taken;
			countBoth -= taken;
		}
		maxPairs += countBoth / 2;
		out.println(maxPairs);
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
	
	 
