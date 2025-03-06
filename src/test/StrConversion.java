package test;

public class StrConversion {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution("-1234"));
        System.out.println(solution.solution("1234"));
    }

    static class Solution {
        public int solution(String s) {
            int answer = Integer.valueOf(s);
            return answer;

        }
    }
}
