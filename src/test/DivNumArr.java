package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DivNumArr {
    public static void main(String[] args) {

    }

    static class Solution {

        public int[] solution(int[] arr, int divisor) {

            List<Integer> buffer = new ArrayList<>();

            int count = 0;

            for (int num : arr) {
                if (num % divisor == 0) {
                    buffer.add(num);
                    count++;
                }
            }

            if (buffer.isEmpty()) {
                return new int[]{-1};
            }

            Collections.sort(buffer);

            int[] answer = new int[count];
            for (int i = 0; i < buffer.size(); i++) {
                answer[i] = buffer.get(i);
            }
            return answer;
        }
    }
}
