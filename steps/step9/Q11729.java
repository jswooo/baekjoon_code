package baekjoon_9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Q11729 {
	
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));	
	
	static void hanoi(int n, int start, int middle, int end) throws IOException {
		if (n==1) {
			bw.write(start+" "+end+"\n");
			
		} else {
			hanoi(n-1,start,end,middle);
			bw.write(start+" "+end+"\n");
			hanoi(n-1,middle,start,end);
		}
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		
		int t = Integer.parseInt(br.readLine());
		int k = (int)Math.pow(2, t)-1;
		bw.write(k+"\n");
		hanoi(t,1,2,3);
		bw.flush();
		bw.close();
	}
}
