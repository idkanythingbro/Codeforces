import java.util.*;
import java.io.*;
public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PrintWriter out = new PrintWriter(System.out);
		String s = st.nextToken();
		st = new StringTokenizer(br.readLine());
		String t = st.nextToken();
		out.println(check(s, t) ? "YES" : "NO");
		out.flush();
		out.close();
	}
	private static boolean check(String s, String t){
		if(s.length() != t.length()){
			return false;
		}
		int n = s.length();
		int i = 0;
		while(i < n){
			if(s.charAt(n - i - 1) != t.charAt(i)){
				return false;
			}
			i++;
		}
		return true;
	}
}
