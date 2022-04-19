package baekjoon_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2581 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int min = Integer.MAX_VALUE;
		int sum = 0;
		
		for (int i=n1; i<=n2; i++) {
			boolean pass = false;
			if (i==1) continue;
			if (i==2 || i ==3) {
				if (min>i) min = i;
				sum += i;
				continue;
			}
			for (int j=2; j<=(i/2); j++) {
				if (i%j==0) {
					pass = true;
					break;
				}
			}
			if (!pass) {
				if (min>i) min = i;
				sum += i;
			}
		}
		if (sum == 0) System.out.println(-1);
		else {
			System.out.println(sum);
			System.out.println(min);
		}	
	}
}