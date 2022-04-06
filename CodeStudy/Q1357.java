package codestudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q1357 {
	
	static int rev(int n) {
		if (n<10) {
			return n;
		}
		else if (n<100) {
			return (n%10)*10 + (n/10);
		}
		else if (n<1000){
			return (n%10)*100 + (n%100/10)*10 + (n/100);
		}
		else {
			return (n%10)*1000 + (n%100/10)*100 +(n%1000/100)*10 + (n/1000);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int s,m;
		s = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		System.out.println(rev(rev(s)+rev(m)));
	}
}
