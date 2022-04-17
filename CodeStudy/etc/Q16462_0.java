package codestudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q16462_0 {
	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		double sum = 0; 
		
		for (int i = 0; i < T; i++) {
			String num = br.readLine();
			
			if (num.equals("100")) {
				sum+= 100;
			}
			else {
				num = num.replace("0", "9");
				num = num.replace("6", "9");
				sum += Integer.parseInt(num);
			}
		}
		sum = sum/T;
		System.out.println(Math.round(sum));
	}
}
