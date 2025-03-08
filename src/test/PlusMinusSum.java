package test;

public class PlusMinusSum {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(new int[]{4, 7, 12}, new boolean[]{true, false, true}));
    }

    static class Solution {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for (int i = 0; i < absolutes.length; i++) {
                if (!signs[i]) {
                    answer += absolutes[i] * -1;
                } else {
                    answer += absolutes[i];
                }
            }
            return answer;
        }
    }
    static class Solution2 {
        public int solution(int[] absolutes, boolean[] signs) {
            int answer = 0;
            for (int i = 0; i < absolutes.length; i++) {
                if (signs[i]) {
                    answer += absolutes[i];
                } else {
                    answer -= absolutes[i];
                }
            }
            return answer;
        }
    }
}
