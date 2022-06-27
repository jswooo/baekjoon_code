package codestudy626;

import java.io.*;
import java.util.StringTokenizer;

public class Q16967 {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		int h = Integer.parseInt(st.nextToken());
		int w = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int [][] arr = new int [h+x+1][w+y+1];
		
		for (int i=1; i<=(h+x); i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=1; j<=(w+y); j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int m = h-x;
		int n = w-y;
		
		for (int i=1; i<=m; i++) {
			for (int j=1; j<=n; j++) {
				arr[i+x][j+y] -= arr[i][j];
			}
		}
		
		for (int i=1; i<=h; i++) {
			for (int j=1; j<=w; j++) {
				bw.write(arr[i][j]+" ");
			}
			bw.write("\n");
		}
		bw.flush();
		bw.close();
	}
}