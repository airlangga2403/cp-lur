package com.javacp.masters.hackerrank.dsa;

import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {

        // Write your code here
        long minSum = Long.MAX_VALUE;
        long maxSum = Long.MIN_VALUE;
        long totalSum = 0;

        for (int num : arr) {
            totalSum += num;
            minSum = Math.min(minSum, num);
            System.out.println(minSum + " " + maxSum);
            maxSum = Math.max(maxSum, num);
        }


        long minSumResult = totalSum - maxSum;
        long maxSumResult = totalSum - minSum;

        System.out.println(minSumResult + " " + maxSumResult);
    }
}
