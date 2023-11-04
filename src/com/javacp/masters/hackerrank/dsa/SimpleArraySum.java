package com.javacp.masters.hackerrank.dsa;

import java.util.List;

class SimpleArraySum {

    /*
     * Complete the 'simpleArraySum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY ar as parameter.
     */

    public static int simpleArraySum(List<Integer> ar) {
        // Write your code here
        int sum = 0;
        for(int num: ar) {
            sum+=num;
        }
        return sum;

    }

}

