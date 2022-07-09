package codestudy7;

import java.io.*;
import java.util.StringTokenizer;

public class Q10025_slidingWindow {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int [] arr = new int [1000001];
		
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int g = Integer.parseInt(st.nextToken());
			int x = Integer.parseInt(st.nextToken());
			
			arr[x] = g;
		}
		
		int sum, max;
		sum = max = 0;
		
		for (int i=0; i<(2*k+1) && (i<=1000000); i++) {
			sum += arr[i];
		}
		max = sum;
		
		for (int i=2*k+1, j=0; i<=1000000; i++, j++) {
			sum += arr[i];
			sum -= arr[j];
			
			if (sum>max) {
				max = sum;
			}
		}
		
		System.out.println(max);
		
	}
}
