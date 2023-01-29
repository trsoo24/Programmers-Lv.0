// nums 배열에 3가지 색으로 구분되는 데이터들이 들어있다.
// 0은 흰색, 1은 파랑, 2는 빨강이라고 할 때,
// 주어진 nums 배열에서 흰색부터 빨강 순으로 인접하게 정렬시킨 후 출력하는 프로그램을 작성하세요.

// 입출력 예시
// 입력 : 2, 0, 2, 1, 1, 0
// 출력 : 0, 0, 1, 1, 2, 2

// ( 오름차순으로 정렬 )

import java.util.Arrays;

public class Chapter04_02_Practice1 {
    public static void solution(int[] arr){
        if (arr == null || arr.length == 0){ // 배열이 공백일때는 그냥 중지
            return;
        }

        int[] cntArr = new int[3]; // 0,1,2
        for (int i = 0; i < arr.length; i++) {
            cntArr[arr[i]]++; // cntArr 배열에 해당 숫자값 위치 개수 표시
        }

        int idx = 0;
        for (int i = 0; i < cntArr.length; i++) { // cntArr 순회하면서 출력
            while (cntArr[i] > 0){
                arr[idx++] = i;
                cntArr[i] -= 1;
            }
        }
    }

    public static void main(String[] args) {
        //Test code
        int[] arr = {2, 0, 2, 1, 1, 0};
        solution(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println();

        arr = new int[]{2, 0, 1};
        solution(arr);
        System.out.println(Arrays.toString(arr));
    }
}
