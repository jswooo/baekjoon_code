package baekjoon_7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2839 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n1 = t/5; 
		int n2 = t%5;
		if (t==4) {
			System.out.println(-1);
			return;
		}
		else if (t==7) {
			System.out.println(-1);
			return;
		}
		switch (n2) {
		case 0:
			System.out.println(n1);
			break;
		case 1:
			System.out.println(n1+1);
			break;
		case 2:
			System.out.println(n1+2);
			break;
		case 3:
			System.out.println(n1+1);
			break;
		case 4:
			System.out.println(n1+2);
			break;
		}
	}
}
