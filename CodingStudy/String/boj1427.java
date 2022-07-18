package practice;

import java.io.*;
import java.util.*;

public class boj1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        String [] nums = s.split("");

        Arrays.sort(nums, Comparator.reverseOrder());

        for (String elem:nums) {
            bw.write(elem);
        }
        bw.flush();
        bw.close();
    }
}

