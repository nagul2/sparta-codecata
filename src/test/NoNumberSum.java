package test;

import java.util.Arrays;

public class NoNumberSum {

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{1, 2, 3, 4, 6, 7, 8, 0}));
    }

    static class Solution {
        public int solution(int[] numbers) {

            int answer = 45;

            for (int i = 0; i < numbers.length; i++) {
                answer -= numbers[i];
            }

            return answer;
        }
    }
}
