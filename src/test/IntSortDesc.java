package test;

import java.util.Arrays;
import java.util.Collections;

public class IntSortDesc {
    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(118372);
    }

    static class Solution {
        public long solution(long n) {
            String str = String.valueOf(n);
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);

            StringBuilder sb = new StringBuilder();
            for (char c : charArr) {
                sb.append(c);
            }
            sb.reverse();
            return Long.parseLong(sb.toString());
        }
    }

    static class Solution2 {
        public long solution(long n) {
            // 1. long을 문자열로 변환 후 문자 배열로 변환
            Character[] digits = String.valueOf(n)
                    .chars()  // IntStream 변환
                    .mapToObj(c -> (char) c)  // Character 변환(map == 기본형, mapToOjb == 래퍼형 변환)
                    .toArray(Character[]::new); // Character 배열 변환

            // 2. 내림차순 정렬
            Arrays.sort(digits, Collections.reverseOrder());

            // 3. 문자열로 변환 후 숫자로 변환
            String sortedStr = Arrays.stream(digits)
                    .map(String::valueOf)   // 문자열로 변환
                    .reduce("", String::concat);    // reduce, 요소를 하나로 합치는 역할

            return Long.parseLong(sortedStr);
        }
    }

    static class Solution3 {
        public long solution(long n) {
            // 1. 숫자를 문자열로 변환 후 문자 배열로 변환
            char[] digits = String.valueOf(n).toCharArray();

            // 2. 내림차순 정렬 (오름차순 정렬 후 뒤집기)
            Arrays.sort(digits);
            reverseArray(digits);

            // 3. 문자열로 변환 후 숫자로 변환
            return Long.parseLong(new String(digits));
        }

        // 배열을 뒤집는 메서드
        private void reverseArray(char[] array) {
            int left = 0;
            int right = array.length - 1;
            while (left < right) {
                char temp = array[left];
                array[left] = array[right];
                array[right] = temp;
                left++;
                right--;
            }
        }
    }
}
