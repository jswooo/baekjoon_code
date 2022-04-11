package baekjoon_4;

import java.io.*;

public class Q8958 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int T = Integer.parseInt(br.readLine());
		String [] arr = new String [T];
		
		for (int i = 0; i<T; i++) {
			arr[i] = br.readLine();
			int cnt = 0;
			int sum = 0;
			
			for (int j = 0; j<arr[i].length(); j++) {
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				}
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			bw.write(sum + "\n");
		}	
		bw.flush();
		bw.close();
	}
}
