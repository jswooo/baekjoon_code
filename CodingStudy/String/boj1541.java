package practice;

import java.io.*;
import java.util.*;

public class boj1541 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String [] nums = s.split("-");
        int sum = Integer.MAX_VALUE;

        for (int i=0; i<nums.length; i++) {
            String [] alpa = nums[i].split("\\+"); // + 앞에는 역슬래쉬 2개 넣어줘야 함
            int temp = 0;

            for (int j=0; j<alpa.length; j++) {
                temp += Integer.parseInt(alpa[j]);
            }

            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            } else {
                sum -= temp;
            }
        }
        bw.write(sum+"");

        bw.flush();
        bw.close();
    }
}

