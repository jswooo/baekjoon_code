package implementation;

import java.io.*;
import java.util.StringTokenizer;

public class Q2563 {
	static int area [][] = new int [101][101];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int t = Integer.parseInt(br.readLine());
		for (int i=0; i<t; i++) {
			st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			for (int j=n1; j<(n1+10); j++) {
				for (int k=n2; k<(n2+10); k++) {
					area[j][k]++;
				}
			}
		}
		int cnt = 0;
		for (int i=0; i<=100; i++) {
			for (int j=0; j<=100; j++) {
				if (area[i][j] != 0) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
