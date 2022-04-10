package baekjoon_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
/*
 * 공백 문자열을 조심!! 
 */
public class Q1152 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 		
		int cnt = 0;
		String s = br.readLine();
		String arr [] = s.split(" ");
		
		if (s.equals(" ")) {
			bw.write(0 + "");
		}
		else {
			if (s.charAt(0) == ' ') {
				cnt++;
			}
			
			bw.write((arr.length-cnt) + "");
		}
		
		bw.flush();
		bw.close();
	}
}