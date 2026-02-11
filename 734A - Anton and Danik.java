import java.util.*;
import java.io.*;
public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		int a = 0;
		for(int i=0;i<n;i++){
			if(s.charAt(i) == 'A'){
				a++;
			}
		}
		if(a > (n-a)){
			out.println("Anton");
		} else if( a < (n-a)){
			out.println("Danik");
		} else {
			out.println("Friendship");
		}
		out.flush();
		out.close();
	}
}
