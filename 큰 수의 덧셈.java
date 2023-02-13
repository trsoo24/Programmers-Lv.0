// 큰 수의 덧셈을 배열로 표현한다.
// 양수의 경우 숫자의 각 자리를 큰 자릿수부터 순서대로 배열에 저장한다.
// 음수는 사용하지 않는다.
// 0의 경우, 빈 배열로 표현한다.
// 1523 -> {1, 5, 2, 3};
// 0 <= a.length <= 1000
// 0 <= b.length <= 1000



import java.util.Arrays;
import java.util.Stack;

class Solution3 {
    public int[] solution (int[] a, int[] b) {
        Stack<Integer> stack = new Stack<>();
        int maxLen = Math.max(a.length, b.length);
        int offsetA = maxLen - a.length; // 더 짧은 배열은 offset 으로 앞에 빈자리를 생성하기 위함
        int offsetB = maxLen - b.length; // 예) a = {1, 2, 3} b = {ㅁ, 3, 4} ㅁ 자리가 offset으로 채워짐

        if(a.length == 0) {
            return b;
        }
        if(b.length == 0) {
            return a;
        }

        int overflow = 0; // 자릿수 올림
        for (int i = maxLen - 1; i >= 0; i--) {
            int aVal = (i - offsetA < 0) ? 0 : a[i - offsetA];
            int bVal = (i - offsetB < 0) ? 0 : a[i - offsetB];
            int cVal = aVal + bVal + overflow;
            if(cVal >= 10) {
                overflow = 1;
                stack.push(cVal - 10);
            } else {
                overflow = 0;
                stack.push(cVal);
            }
        }

        int resLen = maxLen; // 결과 배열의 길이
        if(overflow == 1) { // 위의 for 반복에서 마지막 overflow 가 1인 경우 마지막 자릿수 올림
            resLen++;
            stack.push(1);
        }
        int[] result = new int[resLen];
        for (int i = 0; i < resLen; i++) {
            result[i] = stack.pop();
        }
        return result;
    }
}

public class Week2_02 {
    public static void main(String[] args) {
        int[] a = {5, 2, 1, 4, 6};
        int[] b = {6, 1, 0, 4, 4};
        System.out.println(Arrays.toString(new Solution3().solution(a, b)));

        a = new int[]{9, 9, 9, 9, 9, 9};
        b = new int[]{1};
        System.out.println(Arrays.toString(new Solution3().solution(a, b)));
    }
}
