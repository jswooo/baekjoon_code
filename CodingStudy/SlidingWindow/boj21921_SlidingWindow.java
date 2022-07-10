package practice;

import java.io.*;
import java.util.*;

public class boj21921_SlidingWindow {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int [] days = new int [n];

        st = new StringTokenizer(br.readLine());
        for (int i=0; i<n; i++) {
            days[i] = Integer.parseInt(st.nextToken());
        }
        int max = 0;
        int num = 1;

        for (int i=0; i<k; i++) {
            max += days[i];
        }
        int cmax = max;

        for (int i=k; i<n; i++) {
            cmax += days[i];
            cmax -= days[i-k];
            if (cmax == max) {
                num++;
            }
            if (cmax > max) {
                max = cmax;
                num = 1;
            }
        }
        if (max != 0) {
            System.out.println(max);
            System.out.println(num);
        }
        else System.out.println("SAD");
    }
}

