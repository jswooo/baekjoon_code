package baekjoon_6;

import java.io.*;

public class Q11720 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int sum = 0;
		
		int T = Integer.parseInt(br.readLine());
		String nums = br.readLine();
		
		for (int i = 0; i<T; i++) {
			sum += (nums.charAt(i) - '0');
		}
		bw.write(sum + "");
		bw.flush();
		bw.close();
	}
}
