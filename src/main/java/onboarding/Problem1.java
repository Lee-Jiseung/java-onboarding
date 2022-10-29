package onboarding;

import java.util.List;
import java.util.stream.Stream;

class Problem1 {
    public static int solution(List<Integer> pobi, List<Integer> crong) {
        int answer = Integer.MAX_VALUE;
        return answer;
    }

    private static int[] int2Array(Integer pageNumber) {
        return Stream.of(String.valueOf(pageNumber.intValue()).split("")).mapToInt(Integer::parseInt).toArray();
    }
}