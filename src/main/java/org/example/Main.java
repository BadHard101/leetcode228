package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();

        if (nums.length == 0) return ans;

        int index = 0;
        int temp = nums[index];
        for (int i = 1; i < nums.length; i++) {
            if (temp + i - index != nums[i]) {
                if (nums[i - 1] == temp)
                    ans.add("" + temp);
                else
                    ans.add(temp + "->" + nums[i - 1]);
                index = i;
                temp = nums[index];
            }
        }
        if (nums[nums.length - 1] == temp)
            ans.add("" + temp);
        else
            ans.add(temp + "->" + nums[nums.length - 1]);

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(summaryRanges(new int[]{0,1,2,4,5,7}));
    }
}