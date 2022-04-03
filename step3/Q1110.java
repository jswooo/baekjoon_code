package baekjoon_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q1110 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		int s = T;
		int cnt = 0;
		while (true) {
			if (T<10) {
				T = 10*T + T;
			} else {
				T = T%10*10 + (T/10 + T%10)%10;
			}
			cnt ++;
			if (T==s) {
				break;
			}
		}
		bw.write(cnt + "\n");
		
		
		bw.flush();
		bw.close();
	}
}
