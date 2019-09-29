/*
 * Copyright 2019 Abeer Eltanawy
 */

package runtimepractice;

/**
 *
 * @author eltanawy
 */


public class RunTimePractice {

    public static int findNumOfRep(String s, char c) {
        int sum = 0;
        for (int i = 0; i<s.length(); i++) {
            if (s.charAt(i) == c) {
                sum++;
            }
        }
        return sum;
    }
    
    public static int[] findNumOfRepv1(String s, char[] c) {
        int[] sums = new int[c.length];
        for (int i = 0; i<s.length(); i++) {
            for (int j = 0; j<c.length; j++) {
                if (s.charAt(i) == c[j]) {
                    sums[j] = sums[j] + 1;
                }
            }
        }
        return sums;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long startTime = System.currentTimeMillis();
        findNumOfRep("abca", 'a');
        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;
        System.out.println("Test " + duration + "ns");
    }
}
