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
		if(n==2){
			out.println("1 2");
			return;
		}
		List<Integer> list = new ArrayList<>();
		for(int i=1;i<=n;i++){
			list.add(i);
		}
		boolean flag = true;
		int[] arr = new int[n+1];
		for(int i=n;i>=1;i--){
			if(i==n){
				arr[i] = list.get(0);
				list.remove(0);
				continue;
			}
			if(i == n-1){
				arr[i] = list.get(list.size() - 1);
				list.remove(list.size() - 1);
				continue;
			}
			if(i==n-2){
				arr[i] = list.get(0);
				list.remove(0);
				continue;
			}
			if(flag){
				arr[i] = list.get(list.size() - 1);
				list.remove(list.size() - 1);
			} else {
				arr[i] = list.get(0);
				list.remove(0);
			}
			flag = !flag;
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
