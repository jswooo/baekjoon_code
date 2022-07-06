package codestudy626;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Q9421 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int t = Integer.parseInt(br.readLine());
		
		boolean arr[] = new boolean [1000001];
		for (int n=2; n<=Math.sqrt(1000000); n++) {
			if (arr[n*2]!=true) {
				for (int k=n*2; k<=1000000; k+=n) {
					arr[k] = true;
				}
			}
		}
		
		for (int i=3; i<=t; i++) {
			int num = i;
			if (!arr[num]) {
				Set<Integer> set = new HashSet<Integer>();
				set.add(num);
				boolean yn = false;
				while(true) {
					int sum = 0;
					int k = 1+(num/10);
					for (int n=0; n<k; n++) {
						sum += Math.pow(num%10,2);
						num /= 10;
					}
					if (sum==1) {
						yn = true;
						break;
					}
					if (!set.contains(sum)) {
						set.add(sum);
						num = sum;
					}
					else break;
				}
				if(yn) bw.write(i+"\n");
			}
		}
		bw.flush();
		bw.close();
	}
}
