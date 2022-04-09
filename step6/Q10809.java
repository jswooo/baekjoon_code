package baekjoon_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q10809 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		char [] alpa = new char [26];
		String s = br.readLine();
		
		for (int i = 97; i <123 ; i++) {
			alpa[i-97] = (char)i;
		}
		for (int i = 0; i<alpa.length; i++) {
			if (s.contains(String.valueOf(alpa[i]))) {
				bw.write(s.indexOf(String.valueOf(alpa[i]))+ " ");
			}
			else {
				bw.write(-1 + " ");
			}	
		}
		bw.flush();
		bw.close();
	}
}