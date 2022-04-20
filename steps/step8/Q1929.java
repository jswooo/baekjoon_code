package baekjoon_8;

import java.io.*;
import java.util.StringTokenizer;

public class Q1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		for (int i=t; i<=n; i++) {
			boolean pass = false;
			if(i==1) continue;
			if(i==2 || i==3) {
				System.out.println(i);
				continue;
			}
			for (int j=2; j<=Math.sqrt(i); j++) {
				if(i%j==0) {
					pass = true;
					break;
				}
			}
			if (!pass) System.out.println(i);
		}
	}		
}
