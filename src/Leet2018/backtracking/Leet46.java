package Leet2018.backtracking;

import Leet2018.GsonUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author bjxujiayi
 * @create 2018-10-18 15:30
 **/
public class Leet46 {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(GsonUtils.toJson(permute(nums)));
    }
    public static  List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations = new ArrayList<List<Integer>>();
        if (nums.length == 0) {
            return permutations;
        }
        collectPermutations(nums, 0, new ArrayList<Integer>(), permutations);
        return permutations;
    }

    private static void collectPermutations(int[] nums, int start, List<Integer> permutation,
                                     List<List<Integer>>  permutations) {
        if (permutation.size() == nums.length) {
            permutations.add(new ArrayList<Integer>(permutation));
            return;
        }
        for (int i = 0; i <= permutation.size(); i++) {
//            List<Integer> newPermutation = new ArrayList<Integer>(permutation);
            //adding element to the same index will push the origin element to the next index`
            permutation.add(i, nums[start]);
            collectPermutations(nums, start + 1, permutation, permutations);
            permutation.remove(i);
        }
    }
}
