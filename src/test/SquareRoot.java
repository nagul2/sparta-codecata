package test;

public class SquareRoot {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("solution.solution(121) = " + solution.solution(100000000));
    }

    static class Solution {
        public long solution(long n) {
            long sqrt = (long) Math.sqrt(n);

            if (sqrt * sqrt == n) {
                return (sqrt + 1) * (sqrt + 1);
            } else {
                return -1;
            }
        }
    }
}
