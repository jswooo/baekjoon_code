package baekjoon_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1193 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		
		int t = Integer.parseInt(br.readLine());
		int sum = 0;
		int k = 1; 
		
		if (t == 1) {
			bw.write("1/1");
			
		}
		else {
			for (int i = 1; ;i++) {
				sum += i;
				if (sum>=t) {
					k = i;
					sum -= i;
					break;
				}
			}
			int m = t-sum;
			int n = k+1-(t-sum);
			if (k%2 == 0) {
				bw.write(m + "/" + n);
			}
			else {
				bw.write(n + "/" + m);
			}
		}
		
		bw.flush();
		bw.close();
	}
}
