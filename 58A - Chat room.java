import java.util.*;
import java.io.*;
public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PrintWriter out = new PrintWriter(System.out);
		String s = st.nextToken();
		String key = "hello";
		int idx = 0;
		for(int i=0;i<s.length();i++){
			if(idx == 5){
				break;
			}
			if(key.charAt(idx) == s.charAt(i)){
				idx++;
			}
		}
		out.println(idx == 5 ? "YES" : "NO");
		out.flush();
		out.close();
	}
}
