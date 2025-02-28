package test;

public class minus {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("10 - 5 = " + solution.solution(10, 5));
        System.out.println("2 - 3 = " + solution.solution(2, 3));
        System.out.println("100 - 2 = " + solution.solution(100, 2));

    }

    static class Solution {
        public int solution(int num1, int num2) {
            return num1 - num2;
        }
    }
}