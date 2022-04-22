package baekjoon_8;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Q1085 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();
		int h = sc.nextInt();
		
		int [] nums = {x, y, w-x, h-y};
		Arrays.sort(nums);
		System.out.println(nums[0]);	
	}		
}