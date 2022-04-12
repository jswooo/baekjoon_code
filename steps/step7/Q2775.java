package baekjoon_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2775 {
	static int rooms (int k, int n) {
		if (k == 0) {
			return n;
		} 
		if (n == 1) {
			return 1;
		}
		else {
			return rooms(k-1,n) + rooms(k,n-1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 0; i<T; i++) {
			int k = Integer.parseInt(br.readLine());
			int n = Integer.parseInt(br.readLine());
			bw.write(rooms(k,n) + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}