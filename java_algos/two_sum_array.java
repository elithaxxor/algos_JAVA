import java.util.*;
/* Write a function that takes a non-empty array of distinct integers and an integer representing a target sum */
// given nums = [2,7,11,15]


class Program {
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i<nums.lenght; i++){
            for (int j=i+1; j<nums.length; j++){
                int complement = target - nums[i];

                if (nums[j] == complement){
                    return new int [] {i, j}
                }
            }
        }
        return new int[0];
    }
}

target = 10
[1,2,3,4,5,6,7,8,9,10]
