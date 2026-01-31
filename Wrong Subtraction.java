import java.util.*;
import java.io.*;
public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		while(k-- > 0){
			if(n%10 > 0){
				 --n;
			} else {
				n/=10;
			}
			
		}
		System.out.println(n);

	}
}
