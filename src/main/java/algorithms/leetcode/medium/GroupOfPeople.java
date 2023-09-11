package algorithms.leetcode.medium;
/*
1282. Group the People Given the Group Size They Belong To
MEDIUM

There are n people that are split into some unknown number of groups. Each person is labeled with a unique ID from 0 to n - 1.
You are given an integer array groupSizes, where groupSizes[i] is the size of the group that person i is in.
For example, if groupSizes[1] = 3, then person 1 must be in a group of size 3.
Return a list of groups such that each person i is in a group of size groupSizes[i].
Each person should appear in exactly one group, and every person must be in a group. If there are multiple answers,
return any of them. It is guaranteed that there will be at least one valid solution for the given input.

Example 1:
Input: groupSizes = [3,3,3,3,3,1,3]
Output: [[5],[0,1,2],[3,4,6]]
Explanation:
The first group is [5]. The size is 1, and groupSizes[5] = 1.
The second group is [0,1,2]. The size is 3, and groupSizes[0] = groupSizes[1] = groupSizes[2] = 3.
The third group is [3,4,6]. The size is 3, and groupSizes[3] = groupSizes[4] = groupSizes[6] = 3.
Other possible solutions are [[2,1,6],[5],[0,4,3]] and [[5],[0,6,2],[4,3,1]].

Example 2:
Input: groupSizes = [2,1,3,3,3,2]
Output: [[1],[0,5],[2,3,4]]

Constraints:
groupSizes.length == n
1 <= n <= 500
1 <= groupSizes[i] <= n
 */

import java.util.*;
public class GroupOfPeople {
    public static List<List<Integer>> groupThePeople(int[] groupSizes) {
        HashMap<Integer, Queue> countGroups = new HashMap<>();
        for (int index=0; index<groupSizes.length ; index++) {
            if (countGroups.containsKey(groupSizes[index])) {
                Queue indeicesInGroup = countGroups.get(groupSizes[index]);
                indeicesInGroup.add(index);
                countGroups.put(groupSizes[index], indeicesInGroup);

            } else{
                Queue indeicesInNewGroup = new LinkedList<>();
                indeicesInNewGroup.add(index);
                countGroups.put(groupSizes[index], indeicesInNewGroup);
            }
        }

        List<List<Integer>> finalGroupOfPeople = new ArrayList<>();
        for(Map.Entry<Integer,Queue> entry : countGroups.entrySet()){
            int countInEachGroup = entry.getKey();
            Queue groupOfPeople = entry.getValue();
            int groupOfPeopleSize = groupOfPeople.size();

            if(countInEachGroup==groupOfPeopleSize)
                finalGroupOfPeople.add((List<Integer>) groupOfPeople);
            else{
                List<Integer> list = new ArrayList<>();
                while(groupOfPeople.size() > 0){
                    if(list.size() == countInEachGroup) {
                        finalGroupOfPeople.add(list);
                        list = new ArrayList<>();
                    }
                    list.add((Integer) groupOfPeople.remove());
                }
                finalGroupOfPeople.add(list);
            }
        }
        return finalGroupOfPeople;
    }
}
