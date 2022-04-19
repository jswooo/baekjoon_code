package baekjoon_8;

import java.io.*;

public class Q11653_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i=2; i<=t; i++) {
			while(t%i==0) {
				t /= i;
				System.out.println(i);
			}
		}
	}
}
