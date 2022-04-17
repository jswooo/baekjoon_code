package codestudy_4_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q1475 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int [] b = new int [10];
		String a = br.readLine();
		
		for (int i = 0; i<a.length(); i++) {
			b[a.charAt(i)-'0']++;
		}
		if ((b[6]+b[9])%2 != 0)  {
			b[6] += b[9];
			b[6] /= 2;
			b[6] += 1;
			b[9] = 0;
		}
		else if ((b[6]+b[9])%2 == 0){
			b[6] += b[9];
			b[6] /= 2;
			b[9] = 0;
		}
		
		System.out.println(Arrays.stream(b).max().getAsInt());
	}
}
