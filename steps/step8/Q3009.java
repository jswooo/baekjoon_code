package baekjoon_8;

import java.io.*;
import java.util.Scanner;

public class Q3009 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = 0, t = 0, n1, n2;
		int [] num = {1, 1, 0 ,0};
		
		for (int i=0; i<2; i++) {
			if ((n1=sc.nextInt()) == x) num[0]++;
			else {
				num[2]++;
				z = n1;
			}
			if ((n2=sc.nextInt()) == y) num[1]++;
			else {
				num[3]++;
				t = n2;
			}
		}
		if (num[0]==1) System.out.print(x + " ");
		else System.out.print(z + " ");
		if (num[1]==1) System.out.print(y);
		else System.out.print(t);
	}		
}
