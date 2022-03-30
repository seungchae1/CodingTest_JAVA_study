package Lv1;

public class Lv1_02 {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        answer[0]=x;
        long or_x=x;
        for(int i=1; i<n; i++){
            x+=or_x;
            answer[i]=x;
        }
        return answer;
    }
}
