import java.util.*;
import java.io.*;
public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int sum = 0;
		for(int i=0;i<n;i++){
		    st = new StringTokenizer(br.readLine());
			sum+=Integer.parseInt(st.nextToken());
		}
		System.out.println(sum==0? "YES" : "NO");

	}
}
