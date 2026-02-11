import java.util.*;
import java.io.*;
public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PrintWriter out = new PrintWriter(System.out);
		long num = Long.parseLong(st.nextToken());
		out.println(check(num) ? "YES" : "NO");
		out.flush();
		out.close();
	}
	private static boolean check(long num){
		int count = 0;
		while(num > 0){
			if(num % 10 == 4 || num % 10 == 7){
				count++;
			}
			num/=10;
		}
		if((count == 4 || count == 7)){
			return true;
		} else {
			return false;
		}
	}
}
