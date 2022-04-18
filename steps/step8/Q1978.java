package baekjoon_8;

import java.io.*;
import java.util.StringTokenizer;

public class Q1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		int cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i<t; i++) {
			int k = Integer.parseInt(st.nextToken());
			boolean pass = false;
			if (k==1) continue;
			if (k==2 || k==3) {
				cnt++;
				continue;
			}
			for (int j=2; j<=(k/2); j++) {
				if (k%j==0) {
					pass = true;
					break;
				}
			}
			if (!pass) cnt++;
		}
		System.out.println(cnt);
	}
}
