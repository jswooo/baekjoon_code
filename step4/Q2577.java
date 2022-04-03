package baekjoon_4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q2577{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n1 = Integer.parseInt(br.readLine());
		int n2 = Integer.parseInt(br.readLine());
		int n3 = Integer.parseInt(br.readLine());
		
		int n = n1*n2*n3;
		String s = String.valueOf(n);
		String [] st = s.split("");
		
		for (int j = 0; j <= 9; j++) {
			int cnt = 0;
			for (int i = 0; i < st.length; i++) {
				if (st[i].equals(String.valueOf(j))) {
					cnt++;
				}
			}
			bw.write(cnt + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}