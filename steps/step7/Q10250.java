package baekjoon_7;

import java.io.*;
import java.util.StringTokenizer;

public class Q10250 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int num;
			int cnt = 0;
			
			aa:for (int j = 1; j<=w; j++) {
				for (int k = 1; k<=h; k++) {
					num = k*100 + j;
					cnt++;
					if (n == cnt) {
						bw.write(num+"\n");
						break aa;
					}
				}
			}
		}
		
		bw.flush();
		bw.close();
	}
}