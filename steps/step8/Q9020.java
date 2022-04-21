package baekjoon_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q9020 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for (int i=0; i<t; i++) {
			int n = Integer.parseInt(br.readLine());
			int n1 = n/2;
			int n2 = n/2;
			while(true) {
				boolean pass1 = false;
				boolean pass2 = false;
				
				for (int k=2; k<=Math.sqrt(n1); k++) {
					if (n1%k==0) {
						pass1 = true;
						break;
					}
				}
				for (int k=2; k<=Math.sqrt(n2); k++) {
					if (n2%k==0) {
						pass2 = true;
						break;
					}
				}
				if (!pass1&&!pass2) {
					System.out.println(n1 + " " + n2);
					break;
				}
				n1--;
				n2++;
			}
		}
	}		
}