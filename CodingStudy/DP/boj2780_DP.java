package practice;

import java.io.*;
import java.util.*;

public class boj2780_DP {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [][] nums = new int [1001][10];
        for (int i=0; i<10; i++) {
            nums[1][i] = 1;
        }
        for (int i=2; i<=1000; i++) {
            for (int j=0; j<10; j++) {
                if (j==0) nums[i][j] = nums[i-1][7];
                else if (j==1) nums[i][j] = nums[i-1][2] + nums[i-1][4];
                else if (j==2) nums[i][j] = nums[i-1][1] + nums[i-1][3] + nums[i-1][5];
                else if (j==3) nums[i][j] = nums[i-1][2] + nums[i-1][6];
                else if (j==4) nums[i][j] = nums[i-1][1] + nums[i-1][5] + nums[i-1][7];
                else if (j==5) nums[i][j] = nums[i-1][2] + nums[i-1][4] + nums[i-1][6] + nums[i-1][8];
                else if (j==6) nums[i][j] = nums[i-1][3] + nums[i-1][5] + nums[i-1][9];
                else if (j==7) nums[i][j] = nums[i-1][4] + nums[i-1][8] + nums[i-1][0];
                else if (j==8) nums[i][j] = nums[i-1][7] + nums[i-1][5] + nums[i-1][9];
                else if (j==9) nums[i][j] = nums[i-1][8] + nums[i-1][6];
                nums[i][j] %= 1234567;
            }
        }
        int n = Integer.parseInt(br.readLine());

        for (int i=0; i<n; i++) {
            int k = Integer.parseInt(br.readLine());
            int ans = 0;

            for (int d=0; d<10; d++) {
                ans += nums[k][d];
            }
            ans %= 1234567;
            System.out.println(ans);
        }

    }
}

