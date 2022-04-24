package baekjoon_8;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Q4153 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		aa: while(true) {
			st = new StringTokenizer(br.readLine());
			int [] arr = new int [3];
			for (int i=0; i<3; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			if (arr[0]==0 && arr[1]==0 && arr[2]==0) break aa;
			Arrays.sort(arr);
			double n1 = Math.pow(arr[0], 2) + Math.pow(arr[1], 2);
			double n2 = Math.pow(arr[2], 2);
			
			if (n2 == n1) System.out.println("right");
			else System.out.println("wrong");
		}
	}		
}