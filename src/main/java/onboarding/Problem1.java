package onboarding;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

class Problem1 {

    private final static int WIN_POBI = 1;
    private final static int WIN_CRONG = 2;
    private final static int DRAW = 0;

    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    private static int[] int2Array(Integer pageNumber) {
        return Stream.of(String.valueOf(pageNumber.intValue()).split("")).mapToInt(Integer::parseInt).toArray();
    }

    private static int maxScore(int a, int b) {
        return Math.max(a, b);
    }

    private static int multiplyArray(int[] arr) {
        int result = 1;
        for (int i : arr) {
            result *= i;
        }
        return result;
    }

    private static int getScore(Integer pageNumbers) {
        int[] numberArray = int2Array(pageNumbers);
        int sum = Arrays.stream(numberArray).sum();

        return maxScore(Arrays.stream(numberArray).sum(), multiplyArray(numberArray));
    }

    private static int decideWinner(int p, int c) {
        if (p < c) {
            return WIN_CRONG;
        } else if (p > c) {
            return WIN_POBI;
        } else {
            return DRAW;
        }
    }
}