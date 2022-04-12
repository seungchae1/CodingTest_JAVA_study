package Lv1;

public class Lv1_13 {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; n>0; i++){
            answer+=n%10;
            n/=10;
        }
        return answer;
    }
}
