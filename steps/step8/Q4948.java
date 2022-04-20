package baekjoon_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4948 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while(!(s=br.readLine()).equals("0")) {
			int t = Integer.parseInt(s);
			int cnt = 0;
			for(int i=t+1; i<=2*t; i++) {
				boolean pass = false;
				if(i==2 || i==3) {
					cnt++;
					continue;
				}
				for (int j=2; j<=Math.sqrt(i); j++) {
					if(i%j==0) {
						pass = true;
						break;
					}
				}
				if (!pass) cnt++;
			}
			System.out.println(cnt);
		}
	}		
}
