package baekjoon_7;

import java.io.*;
import java.util.StringTokenizer;

public class Q2869 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int v = Integer.parseInt(st.nextToken());
		
		if ((v-b)%(a-b) != 0) {
			bw.write((v-b)/(a-b)+1+ "");
		}
		else bw.write((v-b)/(a-b)+ "");
		bw.flush();
		bw.close();
	}
}
