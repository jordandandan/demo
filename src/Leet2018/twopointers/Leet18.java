package Leet2018.twopointers;

import java.util.*;

/**
 * ]
 *
 * @author bjxujiayi
 * @create 2018-10-18 15:32
 **/
public class Leet18 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(nums.length < 4)
            return res;
        Arrays.sort(nums);
        List<Integer> temp = new ArrayList<Integer>();
        Set<String> set = new HashSet<String>();
        for(int i =0; i< nums.length-3;i++){
            temp.add(nums[i]);
            for(int j = i+1;j<nums.length-2;j++){
                temp.add(nums[j]);
                int l = j+1, r = nums.length-1;
                int sum = target - (nums[i] + nums[j]);
                while(l < r){
                    int tmp = nums[l] + nums[r];
                    if(tmp == sum){
                        String str = "";
                        str += nums[i];
                        str += nums[j];
                        str += nums[l];
                        str += nums[r];
                        if(!set.contains(str)){
                            set.add(str);
                            List<Integer> tempResult = new ArrayList<Integer>(temp);
                            tempResult.add(nums[l]);
                            tempResult.add(nums[r]);
                            res.add(tempResult);
                        }
                        l++;
                        r--;
                    }else if(tmp < sum){
                        l++;
                    }else{
                        r--;
                    }
                }
                temp.remove(temp.size()-1);
            }
            temp.remove(temp.size()-1);
        }
        return res;
    }
}
