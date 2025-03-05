package test;

public class numCompare {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solution(0, 0));
        System.out.println(solution.solution(2, 3));
        System.out.println(solution.solution(1540, 1540));
        System.out.println(solution.solution(-777, -777));

    }

    static class Solution {
        public int solution(int num1, int num2) {
            int answer = 0;
            if (num1 != 0 || num2 != 0) {
                return (num1 == num2) ? 1 : -1;
            }
            return answer;


        }
    }
}
