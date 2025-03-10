package test;

import java.util.Arrays;

public class RevBase3 {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(45) = " + solution.solution(45));
        System.out.println("solution.solution(125) = " + solution.solution(125));

    }

    static class Solution {
        public int solution(int n) {
            StringBuilder revBase3 = new StringBuilder();
            while (n > 0) {
                revBase3.append(n % 3);
                n /= 3;
            }

            char[] charArr = revBase3.toString().toCharArray();
            int answer = 0;
            int digit = charArr.length-1;
            for (char c : charArr) {
                if (c == '0') {
                    digit--;
                    continue;
                }
                answer += (c - '0') * (int) Math.pow(3, digit);
                digit--;
            }
            return answer;
        }
    }
}
