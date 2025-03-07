package test;

public class Collatz {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println("6: " + solution.solution(6));
        System.out.println("16: " + solution.solution(16));
        System.out.println("626331: " + solution.solution(626331));
        System.out.println("1: " + solution.solution(1));

    }

    static class Solution {
        public int solution(int num) {

            if (num == 1) {
                return 0;
            }

            int count = 0;
            while (num != 1) {
                count++;

                if (num % 2 == 0) {
                    num /= 2;

                } else if (num % 2 == 1) {
                    num = (num * 3) + 1;

                } else if (count > 500) {
                    return -1;
                }
            }
            return count;
        }
    }
}
