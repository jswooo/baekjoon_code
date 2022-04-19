package baekjoon_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11653_1 {
	static void div(int n) {
		int k=1;
		for (int i=2; i<=n; i++) {
			if (n%i==0) {
				System.out.println(i);
				k = n/i;
				break;
			}
		}
		if(!prime(k)) div(k);
		else {
			if(k!=1) System.out.println(k);
		}
	}
	
	static boolean prime(int n) {
		if (n==1 || n==2 || n==3) return true;
		for (int i=2; i<=(n/2); i++) {
			if(n%i==0) return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		if(n==1) return;
		
		div(n);
	}
}
