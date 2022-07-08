package codestudy7;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Q17086_bfs {
	static int M,N;
	static int [][] arr;
	static boolean [][] visited;
	static int [] dx = {-1, -1, -1, 0, 1, 1, 1, 0};
	static int [] dy = {-1, 0, 1, 1, 1, 0, -1, -1};
	static int ans = Integer.MIN_VALUE;
	
	public static int bfs(int x, int y) {
		visited = new boolean [N+1][M+1];
		Queue<int[]> q = new LinkedList<>();
		q.add(new int [] {x,y,0});
		visited[x][y] = true;
		
		
		while (!q.isEmpty()) {
			int narr [] = q.poll();
			
			for (int i=0; i<8; i++) {
				int nx = narr[0] + dx[i];
				int ny = narr[1] + dy[i];
				int nd = narr[2] + 1;
				
				if (nx < 1 || ny < 1 || nx > N || ny > M || visited[nx][ny]) continue;
				
				if (arr[nx][ny]==1) return nd;
				
				q.add(new int [] {nx,ny,nd});
				visited[nx][ny] = true;
			}
		}
		return 0;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int [N+1][M+1];
		
		for (int i=1; i<=N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=1; j<=M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i=1; i<=N; i++) {
			for (int j=1; j<=M; j++) {
				if (arr[i][j]==1) continue;
				
				int dd = bfs(i,j);
				if (dd>ans) {
					ans = dd;
					
				}
			}
		}
		System.out.println(ans);
	}
}