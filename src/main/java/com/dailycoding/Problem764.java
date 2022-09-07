package com.dailycoding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.commons.lang3.StringUtils;

public class Problem764 {

    private String findLargeNumber(List<Integer> nums) {
        return StringUtils.join(nums.stream().sorted((n1, n2) -> {
            String j1 = String.valueOf(n1) + String.valueOf(n2);
            String j2 = String.valueOf(n2) + String.valueOf(n1);

            if (Integer.valueOf(j1) < Integer.valueOf(j2)) {
                return 1;
            }
            if (Integer.valueOf(j1) > Integer.valueOf(j2)) {
                return -1;
            }
            return 0;
        }).collect(Collectors.toList()), "");
    }
    
    
    public static void main(String[] args) {
        Problem764 p = new Problem764();
        List<Integer> nums = Arrays.asList(10, 7, 76, 415); // => 77641510
        System.out.println(p.findLargeNumber(nums)); 
    }
}
