package baekjoon_6;

import java.io.*;
import java.util.StringTokenizer;

public class Q2675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st; 
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i<T; i++) {
			st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			String [] s = st.nextToken().split("");
			for (int j = 0; j<s.length; j++) {
				bw.write(s[j].repeat(k));
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}