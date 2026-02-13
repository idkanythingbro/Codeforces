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
		int[] arr = new int[n + 1];
		int[] idxPos = new int[n + 1];
		for(int i=1;i<=n;i++){
			int val = in.nextInt();
			arr[i] = val;
			idxPos[val] = i;
		}
		int l = -1;
		int temp = n;
		for(int i=1;i<=n;i++){
			l = i;
			if(arr[i] != temp){
				break;
			} else {
				temp--;
			}
		}
		if(l == n){
			
		} else {
			int r = idxPos[temp];
			while(l < r){
				int tmp = arr[l];
				arr[l] = arr[r];
				arr[r] = tmp;
				l++;
				r--;
			}
		}
		for(int i=1;i<=n;i++){
			out.print(arr[i] + " ");
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
	
	 
