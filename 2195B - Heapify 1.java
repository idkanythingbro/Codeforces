import java.io.*;
import java.util.*;
public class Main{
	static int[] parent;
	public static void main(String args[]) throws Exception {
		FastReader in = new FastReader(System.in);
		PrintWriter out = new PrintWriter(System.out);
		int t = in.nextInt();
		while(t-- > 0){
			solve(in, out);
		}
		out.close();
	}
	static int find(int i){
		if(parent[i] == i){
			return i;
		}
		return parent[i] = find(parent[i]);
	}

	static void union(int i, int j){
		int rootI = find(i);
		int rootJ = find(j);
		if(rootI != rootJ){
			parent[rootI] = rootJ;
		}
	}

	static void solve(FastReader in, PrintWriter out) {
		int n = in.nextInt();
		int[] arr = new int[n+1];
		parent = new int[n+1];
		for(int i=1;i<=n;i++){
			arr[i] = in.nextInt();
			parent[i] = i;
		}
		for(int i=1;i<=n/2;i++){
			union(i, 2 * i);
		}		
		boolean possible = true;
		for(int i=1;i<=n;i++){
			if(find(i) != find(arr[i])){
				possible = false;
				break;
			}
		}
		out.println(possible ? "Yes" : "No");
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
	
	 
