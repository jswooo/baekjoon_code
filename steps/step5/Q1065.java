package baekjoon_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1065 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		if (T<100) {
			System.out.println(T);
		}
		else {
			int cnt = 99;
			for (int i = 100; i<=T; i++) {
				int n1 = (i/100) - (i%100/10);
				int n2 = (i%100/10) - (i%10);
				
				if (n1 == n2) {
					cnt++;
				}
			}
			System.out.println(cnt);
		}
	}
}
