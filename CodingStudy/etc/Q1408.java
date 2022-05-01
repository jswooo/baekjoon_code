package codestudy_4_14;

import java.io.*;
import java.util.StringTokenizer;

public class Q1408 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(),":");
		
		int hour,min,sec;
		
		int h1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		int s1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine(),":");
		
		int h2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		int s2 = Integer.parseInt(st.nextToken());
		
		hour = h2 - h1;
		min = m2 - m1;
		sec = s2 - s1;
		
		if (sec<0) {
			sec += 60;
			min -= 1;
		}
		if (min<0) {
			min += 60;
			hour -= 1;
		}
		if (hour<0) {
			hour += 24;
		}
		if (hour==0) {
			System.out.print("00:");
		} else if (hour < 10) {
			System.out.print("0"+ hour +":");
		} else {
			System.out.print(hour+ ":");
		}
		if (min==0) {
			System.out.print("00:");
		} else if (min < 10) {
			System.out.print("0"+ min +":");
		} else {
			System.out.print(min+ ":");
		}
		if (sec==0) {
			System.out.print("00");
		} else if (sec < 10) {
			System.out.print("0"+ sec);
		} else {
			System.out.print(sec);
		}
	}
}
