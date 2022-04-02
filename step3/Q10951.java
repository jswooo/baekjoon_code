package baekjoon_3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q10951 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st; 
		String s;
		
		while ((s = br.readLine()) != null) {
			st = new StringTokenizer(s);
			int T = Integer.parseInt(st.nextToken());
			int n = Integer.parseInt(st.nextToken());
			int sum = T+n;
			bw.write(sum + "\n");
		}
		
		bw.flush();
		bw.close();
	}
}
