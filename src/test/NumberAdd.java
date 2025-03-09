package test;

public class NumberAdd {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(13, 17);
    }

    static class Solution {
        public int solution(int left, int right) {

            int answer = 0;

            for (int i = left; i <= right; i++) {
                int count = 0;

                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        count++;
                    }
                }

                answer += count % 2 == 0 ? i : -i;
            }

            return answer;
        }
    }
}
