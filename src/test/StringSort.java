package test;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class StringSort {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Solution2 solution2 = new Solution2();
        Solution3 solution3 = new Solution3();
        System.out.println(solution.solution("Zbcdefg"));
        System.out.println(solution2.solution("Zbcdefg"));
        System.out.println(solution3.solution("Zbcdefg"));
    }

    static class Solution {
        public String solution(String s) {
            char[] charArr = s.toCharArray();
            Arrays.sort(charArr);

            for (int i = 0; i < charArr.length / 2; i++) {
                char temp = charArr[i];
                charArr[i] = charArr[charArr.length - i - 1];
                charArr[charArr.length - i - 1] = temp;
            }


            return new String(charArr);
        }
    }

    static class Solution2 {
        public String solution(String s) {
            String[] strArr = s.split("");
            Arrays.sort(strArr, Collections.reverseOrder());
            StringBuilder sb = new StringBuilder();
            for (String str : strArr) {
                sb.append(str);
            }

            return sb.toString();
        }
    }

    static class Solution3 {
        public String solution(String s) {
            return s.chars().mapToObj(num -> (char) num)
                    .sorted(Collections.reverseOrder())
                    .map(String::valueOf)
                    .collect(Collectors.joining());
        }
    }
}
