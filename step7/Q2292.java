package baekjoon_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2292 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		
		int t = Integer.parseInt(br.readLine());
		int sum = 1;
		if (t == 1) {
			bw.write(1 + "");
		}
		else {
			for (int i = 1; ;i++) {
				sum += 6*i;
				if (sum>=t) {
					bw.write((i+1) + "");
					break;
				}
			}
		}
		
		bw.flush();
		bw.close();
	}
}