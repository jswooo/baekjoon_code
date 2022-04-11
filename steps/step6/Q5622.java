package baekjoon_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 예외생각
 */
public class Q5622 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		
		String s = br.readLine();
		int cnt = 0;
		
		for (int i = 0; i<s.length(); i++) {
			if (s.charAt(i)-65 < 17) {
				cnt += (s.charAt(i)-65)/3+3;
			} 
			else if (s.charAt(i)=='Z') {
				cnt += 10;
			}
			else {
				cnt += (s.charAt(i)-66)/3+3;
			}
		}
		bw.write(cnt + "");
		bw.flush();
		bw.close();
	}
}