// 중복된 배열에서 중복된 요소 제거 후 4개를 뽑는 경우의 수

import java.util.*;

class Solution {
    public int solution(String[] names) {
        int answer = 0;
        HashSet<String> hs = new HashSet<>(Arrays.asList(names));
        names = hs.toArray(new String[0]);
        int a = hs.size();
        int pResult = 1;
        for(int i = a; i >= a - 3; i--){
            pResult *= i;
        }
        answer = pResult / 24;
        return answer;
    }
}
