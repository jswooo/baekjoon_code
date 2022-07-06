package codestudy7;

import java.io.*;
import java.util.StringTokenizer;


public class Q9372 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int m = Integer.parseInt(br.readLine());
		
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			int l = Integer.parseInt(st.nextToken());
			System.out.println(k-1);
			for (int j=0; j<l; j++) {
				br.readLine();
			}
		}
	}
}
