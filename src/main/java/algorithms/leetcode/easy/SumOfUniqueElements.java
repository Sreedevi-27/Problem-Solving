/*
1748. Sum of Unique Elements
EASY

You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
Return the sum of all the unique elements of nums.

Example 1:
Input: nums = [1,2,3,2]
Output: 4
Explanation: The unique elements are [1,3], and the sum is 4.

Example 2:
Input: nums = [1,1,1,1,1]
Output: 0
Explanation: There are no unique elements, and the sum is 0.

Example 3:
Input: nums = [1,2,3,4,5]
Output: 15
Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

Constraints:
1 <= nums.length <= 100
1 <= nums[i] <= 100
 */

package algorithms.leetcode.easy;

import java.util.HashMap;
import java.util.Map;



public class SumOfUniqueElements {
    public static void main(String[] args) {
        int[] inputArray = {1,2,3,2};
        SumOfUniqueElements problem = new SumOfUniqueElements();
        System.out.println(problem.sumOfUnique(inputArray));
    }

    public int sumOfUnique(int[] nums) {
        int sum = 0;
        HashMap<Integer, Integer> countOfElements = new HashMap<Integer, Integer>();
        for(int num : nums){
            if(countOfElements.containsKey(num))
                countOfElements.put(num,  countOfElements.get(num)+1);
            else
                countOfElements.put(num, 1);
        }
        for (Map.Entry<Integer,Integer> mapElement : countOfElements.entrySet()) {
            int key = mapElement.getKey();
            int value = mapElement.getValue();
            sum += (value==1) ? key : 0;
        }
        return sum;
    }
}
