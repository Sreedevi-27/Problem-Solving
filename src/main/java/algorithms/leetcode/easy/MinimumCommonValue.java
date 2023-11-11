package algorithms.leetcode.easy;
/*
2540. Minimum Common Value

Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays.
If there is no common integer amongst nums1 and nums2, return -1.
Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

Example 1:
Input: nums1 = [1,2,3], nums2 = [2,4]
Output: 2
Explanation: The smallest element common to both arrays is 2, so we return 2.

Example 2:
Input: nums1 = [1,2,3,6], nums2 = [2,3,4,5]
Output: 2
Explanation: There are two common elements in the array 2 and 3 out of which 2 is the smallest, so 2 is returned.

Constraints:
1 <= nums1.length, nums2.length <= 105
1 <= nums1[i], nums2[j] <= 109
Both nums1 and nums2 are sorted in non-decreasing order.
 */

public class MinimumCommonValue {
    /*
    APPROACH 1:
      int x=0, y=0;
        HashSet<Integer> hashSet1 = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();
        while(x<nums1.length || y<nums2.length){
            if(x<nums1.length){
                if(hashSet2.contains(nums1[x]))
                    return nums1[x];
                else
                    hashSet1.add(nums1[x]);
                x++;
            }
            if(y<nums2.length){
                if(hashSet1.contains(nums2[y]))
                    return nums2[y];
                else
                    hashSet2.add(nums2[y]);
                y++;
            }
        }
        return -1;
     */
    public static int getCommon(int[] nums1, int[] nums2) {
        for(int element : nums1){
            if(isPresent(nums2, element))
                return element;
        }
        return -1;
    }

    public static boolean isPresent(int[] nums2, int element){
        int left = 0;
        int right = nums2.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(nums2[mid]==element)
                return true;
            else if(nums2[mid] < element)
                left = mid+1;
            else
                right = mid-1;
        }
        return false;
    }
}

/*
Time Complexity : O(n)*O(log n) => O(nlogn)
Space Complexity : O(1)
 */
