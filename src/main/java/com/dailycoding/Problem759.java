package com.dailycoding;

import java.util.ArrayList;
import java.util.List;

public class Problem759 {

    private boolean isValid(String ip) {
        String[] ipArr = ip.split("\\.");
        for (String ipS : ipArr) {
            int intValue = Integer.valueOf(ipS);
            if (ipS.length() > 3  || intValue < 0 || intValue > 255) {
                return false;
            }
            if (ipS.length() > 1 && (intValue == 0 || ipS.charAt(0) == '0')) {
                return false;
            }
        }
        return true;
    }

    private List<String> convert(String digits) {
        int lenDigit = digits.length();
        if (lenDigit > 12) {
            return new ArrayList<>();
        }
        String snew = digits;
        List<String> rs = new ArrayList<>();
        for (int i = 1; i < lenDigit; i++) {
            for (int j = i + 1; j < lenDigit - 1; j++) {
                for (int k = j + 1; k < lenDigit; k++) {
                    snew = snew.substring(0, k) + "." + snew.substring(k, lenDigit);
                    snew = snew.substring(0, j) + "." + snew.substring(j, lenDigit);
                    snew = snew.substring(0, i) + "." + snew.substring(i, lenDigit);

                    if (isValid(snew)) {
                        rs.add(snew);
                        System.out.println(snew);
                    }
                    snew = digits;
                }
            }
        }

        return rs;
    }

    public static void main(String[] args) {
        Problem759 p759 = new Problem759();
        p759.convert("1210111189");

    }
}
