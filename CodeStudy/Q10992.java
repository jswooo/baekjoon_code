package codestudy_4_14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q10992 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		String s = "*";
		
		if (t == 1) System.out.println("*");
		else {
			System.out.println(" ".repeat(t-1) + "*");
			for (int i = 2 ; i < t ; i++) {
				System.out.println(" ".repeat(t-i) + "*" + " ".repeat(s.length()) + "*" );
				s = (" ".repeat(t-i) + "*" + " ".repeat(s.length()) + "*").trim();
			}
			System.out.println("*".repeat(2*t-1));
		}
	}
}