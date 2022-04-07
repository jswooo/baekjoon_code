package codestudy;

import java.io.*;
import java.util.StringTokenizer;

public class Q5671 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		String s;
		
		while((s = br.readLine()) != null) {
			int count = 0;
			st = new StringTokenizer(s);
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());

			for (int n = n1; n<=n2; n++) {
				int [] arr = new int [10];
				String str = String.valueOf(n);
				int check = 1;
				for (int j = 0; j < str.length(); j++) {
					arr[str.charAt(j)-'0']++;
					if (arr[str.charAt(j)-'0'] != 1) {
						check = 0;
					}
				}
				count += check;
			}
			bw.write(count+ "\n");
		}
		bw.flush();
		bw.close();
	}
}