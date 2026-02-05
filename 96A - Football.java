import java.util.*;
import java.io.*;
public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PrintWriter out = new PrintWriter(System.out);
		String s = st.nextToken();
		br.close();
		if(s.contains("0000000") || s.contains("1111111")){
			out.println("YES");
		} else{
		    out.println("NO");
		}
		out.flush();
		out.close();
	}
}
