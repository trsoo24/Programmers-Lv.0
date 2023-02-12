//  압축된 문자열 code 의 압축을 해제하는 프로그램
// n{알파벳_문자열} -> 알파벳_문자열 을 n번만큼 반복
// 3{abc}d 는 abcabcabcd 로 압축해제한다
// code를 입력받아 압축을 해제한 문자열을 출력하라
// 0 < code.length <= 10000
// 문자열의 반복 횟수인 n 은 한자리 정수
// code[i] 는 영문 소문자


class Solution4 {
    int i = 0;   //멤버 변수 선언
                // recursive 안에서 생성하면 재귀함수 내에서 계속 돌거나,
                // 재귀 호출한 값이 제자리에 들어갈 수 있도록 고정될 값
                // 만약 recursive 안에 int i = 0; 을 선언했을 때,
                // 새로 들어온 재귀함수가 int i = 0; 를 만나서 다시 처음부터 시작될 염려가 있음

    public String solution(String code) {
        return recursive(code);
    }

    public String recursive(String s) { // 재귀함수 호출 {} 이 몇번 나올지 모르기 때문
        StringBuilder sb = new StringBuilder();
        String temp; //반복해야되는 문자열을 생성하기 위함

        int num = 0; // 반복되는 횟수 체크

        while(i < s.length()) {
            if(Character.isDigit(s.charAt(i))) {
                num = Character.getNumericValue(s.charAt(i));
                i++;
            } else if(s.charAt(i) == '{') {
                i++;
                temp = recursive(s);
//                sb.append(temp.repeat(num));
                for(int a = 0; a < num; a++) {
                    sb.append(temp);
                }
            } else if (s.charAt(i) == '}') {
                i++;
                break;
            } else {
                sb.append(s.charAt(i));
                i++;
            }
        }
        return sb.toString();
    }
}
