package algorithms.leetcode.easy;

/*
69. Sqrt(x)
Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer
should be non-negative as well. You must not use any built-in exponent function or operator.
For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.

Example 1:
Input: x = 4
Output: 2
Explanation: The square root of 4 is 2, so we return 2.

Example 2:
Input: x = 8
Output: 2
Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.

Constraints:
0 <= x <= 231 - 1
 */

public class SquareRoot {
    public static int mySqrt(int x) {
        long sqrt = 0;
        if(x == 0 || x == 1) return x;
        for(long i = 2;i<=x;i++){
            if(i * i > x){
                sqrt = i-1;
                break;
            }
        }
        return (int)sqrt;
    }
}

/*
Time Complexity : O(n)
Space Complexity : O(1)
 */