import java.util.*;
import java.io.*;
public class Main{
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		PrintWriter out = new PrintWriter(System.out);
		int n = Integer.parseInt(st.nextToken());
		int h = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int width = 0;
		for(int i=0;i<n;i++){
			int ht = Integer.parseInt(st.nextToken());
			if(ht<=h){
				width++;
			} else{
				width+=2;
			}
		}
		out.println(width);
		out.flush();
		out.close();
	}
}
